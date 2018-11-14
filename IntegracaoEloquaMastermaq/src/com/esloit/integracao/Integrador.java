package com.esloit.integracao;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.xml.datatype.DatatypeConfigurationException;

import com.eloqua.mastermaq.client.Conversor;
import com.eloqua.mastermaq.client.MastermaqLogger;
import com.eloqua.mastermaq.client.ParametrosConexaoEloqua;
import com.eloqua.mastermaq.client.RestfulClientProxy;
import com.eloqua.mastermaq.entity.ContaEloqua;
import com.eloqua.mastermaq.entity.ContatoEloqua;
import com.eloqua.mastermaq.entity.PropriedadesConta;
import com.eloqua.mastermaq.entity.PropriedadesContato;
import com.mastermaq.client.IntegraCrmClient;
import com.mastermaq.integracrm.ContaEL;
import com.mastermaq.integracrm.ContatoEL;

public class Integrador {
    private static SimpleDateFormat sdfArquivo = new SimpleDateFormat("yyyy-MM-dd");
    private static File arquivoLog = new File("." + File.separator + "log" + File.separator + "Integracao_SI_Eloqua_"
            + sdfArquivo.format(new Date()) + ".log");

    public static void main(String[] args) {
        
        if(args.length != 5) {            
            MastermaqLogger mastermaqLogger = null;
            
            try {
                mastermaqLogger = new MastermaqLogger(arquivoLog);
            }

            catch (IOException e) {
                e.printStackTrace();

            }
            
            try {
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                Date dataAtualizacao = sdf.parse(args[5]);            
                atualizarDadosContatos(args[0], args[1], args[2], args[3], args[4], dataAtualizacao, mastermaqLogger);            
                integrarContas(args[0], args[1], args[2], args[3], args[4], args[5], mastermaqLogger);            
                integrarContatos(args[0], args[1], args[2], args[3], args[4], args[5], mastermaqLogger);
            }

            catch (ParseException e) {
                e.printStackTrace();
                String mensagem = "Formato de data inválido. Revise os parâmetros.";
                mastermaqLogger.erroConsole(mensagem);
                mastermaqLogger.erroArquivo(mensagem);
            }

            catch (IOException e) {
                e.printStackTrace();
            }

            catch (URISyntaxException e) {
                e.printStackTrace();
            }
            
        }
        
        else {
            System.out.println("A aplicação não pode ser executada porque os parâmetros necessários não foram enviados "
                    + "corretamente.");
            System.exit(1);
        }
        
    }

    public static void atualizarDadosContatos(String usuarioMmq, String senhaMmq, String comapanhiaEL, String usuarioEL,
            String senhaEL, Date dataAtualizacao, MastermaqLogger mastermaqLogger) {
        mastermaqLogger.infoConsole("==================== Iniciando Atualização de Contatos Eloqua -> Mastermaq "
                + "====================");
        mastermaqLogger.infoArquivo("==================== Iniciando Atualização de Contatos Eloqua -> Mastermaq "
                + "====================");
        ParametrosConexaoEloqua parametrosConexaoEloqua = new ParametrosConexaoEloqua(comapanhiaEL, usuarioEL, senhaEL);
        PropriedadesContato propriedadesContato = new PropriedadesContato();
        String mensagem = "";

        try {
            long dataLong = dataAtualizacao.getTime() / 1000;
            propriedadesContato = RestfulClientProxy.buscarContatoEloquaPorDataAtualizacao(Long.toString(dataLong), 
                    parametrosConexaoEloqua);
        }

        catch (IOException e1) {
            e1.printStackTrace();
        }

        if (propriedadesContato.getElements() != null && propriedadesContato.getElements().size() > 0) {

            for (ContatoEloqua contatoEloqua : propriedadesContato.getElements()) {

                try {
                    IntegraCrmClient integraCrmClient = new IntegraCrmClient(usuarioMmq, senhaMmq);
                    integraCrmClient
                            .elAtualizaDadosContato(Conversor.converterContatoEloquaParaContatoEloqua(contatoEloqua));
                    mensagem = "Contato atualizado com sucesso no SI da Mastermaq. (" + contatoEloqua.getEmailAddress() + ")";
                    mastermaqLogger.infoConsole(mensagem);
                    mastermaqLogger.infoArquivo(mensagem);
                }

                catch (NumberFormatException | ParseException | DatatypeConfigurationException e) {
                    e.printStackTrace();
                }

            }

        }

        else {
            mensagem = "Não há contatos para atualizar no SI da Mastermaq.";
            mastermaqLogger.erroConsole(mensagem);
            mastermaqLogger.erroArquivo(mensagem);
        }
        
        mastermaqLogger.infoConsole("==================== Fim da Atualização de Contatos Eloqua -> Mastermaq ====================");
        mastermaqLogger.infoArquivo("==================== Fim da Atualização de Contatos Eloqua -> Mastermaq ====================");
    }

    public static void integrarContas(String usuarioMmq, String senhaMmq, String comapanhiaEL, String usuarioEL, String senhaEL,
            String dataAtualizacao, MastermaqLogger mastermaqLogger) throws IOException, URISyntaxException {
        mastermaqLogger.infoConsole("==================== Iniciando Integração de Contas Mastermaq -> Eloqua "
                + "====================");
        mastermaqLogger.infoArquivo("==================== Iniciando Integração de Contas Mastermaq -> Eloqua "
                + "====================");
        IntegraCrmClient integraCrmClient = new IntegraCrmClient(usuarioMmq, senhaMmq);
        List<ContaEL> contasMmq = new ArrayList<ContaEL>();

        try {
            contasMmq = integraCrmClient.elDadosContas(dataAtualizacao);
        }

        catch (Exception e) {
            e.printStackTrace();
        }

        for (ContaEL contaEL : contasMmq) {
            ParametrosConexaoEloqua parametrosConexaoEloqua = new ParametrosConexaoEloqua(comapanhiaEL, usuarioEL, senhaEL);
            PropriedadesConta resultadoBusca = RestfulClientProxy
                    .buscarContaEloqua(Integer.toString(contaEL.getCodigoSiEmpresa()), parametrosConexaoEloqua);
            ContaEloqua contaConvertida = Conversor.converterContaELParaContaEloqua(contaEL, parametrosConexaoEloqua);

            if (resultadoBusca.getElements() != null) {

                if (resultadoBusca.getElements().size() < 1) {

                    try {
                        RestfulClientProxy.criarContaEloqua(contaConvertida, parametrosConexaoEloqua, mastermaqLogger);
                    }

                    catch (RuntimeException e) {
                        e.printStackTrace();
                    }

                }

                else {
                    contaConvertida.setId(resultadoBusca.getElements().get(0).getId());

                    try {
                        RestfulClientProxy.atualizarContaEloqua(contaConvertida, parametrosConexaoEloqua, mastermaqLogger);
                    }

                    catch (RuntimeException e) {
                        e.printStackTrace();
                    }

                }

            }

        }
        
        mastermaqLogger.infoConsole("==================== Fim da Integração de Contas Mastermaq -> Eloqua ====================");
        mastermaqLogger.infoArquivo("==================== Fim da Integração de Contas Mastermaq -> Eloqua ====================");
    }

    public static void integrarContatos(String usuarioMmq, String senhaMmq, String comapanhiaEL, String usuarioEL, String senhaEL,
            String dataAtualizacao, MastermaqLogger mastermaqLogger) throws IOException, URISyntaxException {
        mastermaqLogger.infoConsole("==================== Iniciando Integração de Contatos Mastermaq -> Eloqua "
                + "====================");
        mastermaqLogger.infoArquivo("==================== Iniciando Integração de Contatos Mastermaq -> Eloqua "
                + "====================");
        IntegraCrmClient integraCrmClient = new IntegraCrmClient(usuarioMmq, senhaMmq);
        List<ContatoEL> contatosMmq = new ArrayList<ContatoEL>();

        try {
            contatosMmq = integraCrmClient.elDadosContatos(dataAtualizacao);
        }

        catch (Exception e) {
            e.printStackTrace();
        }

        for (ContatoEL contatoEL : contatosMmq) {
            ParametrosConexaoEloqua parametrosConexaoEloqua = new ParametrosConexaoEloqua(comapanhiaEL, usuarioEL, senhaEL);
            PropriedadesContato resultadoBuscaContato = RestfulClientProxy
                    .buscarContatoEloquaPorEmail(contatoEL.getEmailAddress(), parametrosConexaoEloqua);
            ContatoEloqua contatoConvertido = Conversor.converterContatoELParaContatoEloqua(contatoEL, parametrosConexaoEloqua);
            PropriedadesContato resultadoBuscaConta = RestfulClientProxy
                    .buscarContatoEloquaPorEmail(contatoEL.getEmailAddress(), parametrosConexaoEloqua);

            if (resultadoBuscaConta.getElements() != null) {

                if (resultadoBuscaConta.getElements().size() > 0) {

                    if (resultadoBuscaContato.getElements().size() > 1) {

                        try {
                            RestfulClientProxy.criarContatoEloqua(contatoConvertido, parametrosConexaoEloqua, mastermaqLogger);
                        }

                        catch (RuntimeException e) {
                            e.printStackTrace();
                        }

                    }

                    else {
                        contatoConvertido.setId(resultadoBuscaContato.getElements().get(0).getId());

                        try {
                            RestfulClientProxy.atualizarContatoEloqua(contatoConvertido, parametrosConexaoEloqua, mastermaqLogger);
                        }

                        catch (RuntimeException e) {
                            e.printStackTrace();
                        }

                    }

                }

            }

        }

        mastermaqLogger.infoConsole("==================== Fim da Integração de Contatos Mastermaq -> Eloqua ====================");
        mastermaqLogger.infoArquivo("==================== Fim da Integração de Contatos Mastermaq -> Eloqua ====================");
    }

}