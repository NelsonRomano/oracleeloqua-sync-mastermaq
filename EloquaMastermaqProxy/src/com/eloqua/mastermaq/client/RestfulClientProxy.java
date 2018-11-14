package com.eloqua.mastermaq.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import com.eloqua.mastermaq.entity.ContaEloqua;
import com.eloqua.mastermaq.entity.ContatoEloqua;
import com.eloqua.mastermaq.entity.FieldValue;
import com.eloqua.mastermaq.entity.PropriedadesConta;
import com.eloqua.mastermaq.entity.PropriedadesContato;

public class RestfulClientProxy {

    // Método para apagar um registro de Conta existente no Oracle Eloqua
    public static void apagarContaEloqua(String id, ParametrosConexaoEloqua parametrosConexaoEloqua, 
            MastermaqLogger mastermaqLogger) throws IOException, URISyntaxException {
        HttpURLConnection con = parametrosConexaoEloqua.hTTPConnection("/api/REST/1.0/data/account/" + id, "DELETE");
        String mensagem = "";
        String request = "{\"id\":\"" + id + "\"}";

        try {
            OutputStream os = con.getOutputStream();
            os.write(request.getBytes());
            os.close();

            if (con.getResponseCode() != 200) {
                mensagem = "Código de Status HTTP: " + con.getResponseCode();
                throw new RuntimeException(mensagem);
            }

            con.getInputStream();
            con.disconnect();
            mastermaqLogger.infoConsole("Conta excluída com sucesso: " + id);
            mastermaqLogger.infoArquivo("Conta excluída com sucesso: " + id);
        }

        catch (MalformedURLException e) {
            mastermaqLogger.erroConsole(mensagem);
            mastermaqLogger.erroArquivo(mensagem);
            mastermaqLogger.erroConsole(MastermaqLogger.stack2String(e));
            mastermaqLogger.erroArquivo(MastermaqLogger.stack2String(e));
        }

        catch (IOException e) {
            mastermaqLogger.erroConsole(mensagem);
            mastermaqLogger.erroArquivo(mensagem);
            mastermaqLogger.erroConsole(MastermaqLogger.stack2String(e));
            mastermaqLogger.erroArquivo(MastermaqLogger.stack2String(e));
        }

    }

    // Método para apagar um registro de Contato existente no Oracle Eloqua
    public static void apagarContatoEloqua(String id, ParametrosConexaoEloqua parametrosConexaoEloqua,
            MastermaqLogger mastermaqLogger) throws IOException, URISyntaxException {
        HttpURLConnection con = parametrosConexaoEloqua.hTTPConnection("/api/REST/1.0/data/contact/" + id, "DELETE");
        String mensagem = "";
        String request = "{\"id\":\"" + id + "\"}";

        try {
            OutputStream os = con.getOutputStream();
            os.write(request.getBytes());
            os.close();

            if (con.getResponseCode() != 200) {
                mensagem = "Código de Status HTTP: " + con.getResponseCode();
                throw new RuntimeException(mensagem);
            }

            con.getInputStream();
            con.disconnect();
            mastermaqLogger.infoConsole("Contato excluído com sucesso: " + id);
            mastermaqLogger.infoArquivo("Contato excluído com sucesso: " + id);
        }

        catch (MalformedURLException e) {
            mastermaqLogger.erroConsole(mensagem);
            mastermaqLogger.erroArquivo(mensagem);
            mastermaqLogger.erroConsole(MastermaqLogger.stack2String(e));
            mastermaqLogger.erroArquivo(MastermaqLogger.stack2String(e));
        }

        catch (IOException e) {
            mastermaqLogger.erroConsole(mensagem);
            mastermaqLogger.erroArquivo(mensagem);
            mastermaqLogger.erroConsole(MastermaqLogger.stack2String(e));
            mastermaqLogger.erroArquivo(MastermaqLogger.stack2String(e));
        }

    }

    // Método para atualizar um registro de Conta existente no Oracle Eloqua
    public static String atualizarContaEloqua(ContaEloqua conta, ParametrosConexaoEloqua parametrosConexaoEloqua,
                MastermaqLogger mastermaqLogger) throws IOException, URISyntaxException {
        HttpURLConnection con = parametrosConexaoEloqua.hTTPConnection("/api/REST/1.0/data/account/" + conta.getId(), "PUT");
        String mensagem = "";
        String json = Conversor.converterContaEloqua2Json(conta);
        String codSIEmpresa = "";

        if (conta.getFieldValues() != null) {

            for (FieldValue fv : conta.getFieldValues()) {
                if (fv.getId().equals("100275")) {
                    codSIEmpresa = fv.getValue();
                }
            }

        }

        try {
            OutputStream os = con.getOutputStream();
            os.write(json.getBytes());
            os.close();

            if (con.getResponseCode() != 200) {
                mensagem = "Código de Status HTTP: " + con.getResponseCode();
                throw new RuntimeException(mensagem);
            }

            con.getInputStream();
            con.disconnect();
            mastermaqLogger.infoConsole("Conta atualizada com sucesso. (Código SI Empresa: " + codSIEmpresa + ")");
            mastermaqLogger.infoArquivo("Conta atualizada com sucesso. (Código SI Empresa: " + codSIEmpresa + ")");
            return mensagem;
        }

        catch (MalformedURLException e) {
            mastermaqLogger.erroConsole("Não foi possível atualizar Conta. (Código SI Empresa: " + codSIEmpresa + ") Motivo: ");
            mastermaqLogger.erroArquivo("Não foi possível atualizar Conta. (Código SI Empresa: " + codSIEmpresa + ") Motivo: ");
            mastermaqLogger.erroConsole(MastermaqLogger.stack2String(e));
            mastermaqLogger.erroArquivo(MastermaqLogger.stack2String(e));
        }

        catch (IOException e) {
            mastermaqLogger.erroConsole("Não foi possível atualizar Conta. (Código SI Empresa: " + codSIEmpresa + ") Motivo: ");
            mastermaqLogger.erroArquivo("Não foi possível atualizar Conta. (Código SI Empresa: " + codSIEmpresa + ") Motivo: ");
            mastermaqLogger.erroConsole(MastermaqLogger.stack2String(e));
            mastermaqLogger.erroArquivo(MastermaqLogger.stack2String(e));
        }

        return null;
    }

    // Método para atualizar um registro de Contato existente no Oracle Eloqua
    public static void atualizarContatoEloqua(ContatoEloqua contato, ParametrosConexaoEloqua parametrosConexaoEloqua,
            MastermaqLogger mastermaqLogger)
                    throws IOException, URISyntaxException {
        HttpURLConnection con = parametrosConexaoEloqua.hTTPConnection("/api/REST/1.0/data/contact/" + contato.getId(), "PUT");
        String json = Conversor.converterContatoEloqua2Json(contato);
        String mensagem = "";

        try {
            OutputStream os = con.getOutputStream();
            os.write(json.getBytes());
            os.close();

            if (con.getResponseCode() != 200) {
                mensagem = "Código de Status HTTP: " + con.getResponseCode();
                throw new RuntimeException(mensagem);
            }

            con.getInputStream();
            con.disconnect();
            mastermaqLogger.infoConsole("Contato atualizado com sucesso. (" + contato.getEmailAddress() + ")");
            mastermaqLogger.infoArquivo("Contato atualizado com sucesso. (" + contato.getEmailAddress() + ")");
        }

        catch (MalformedURLException e) {
            mastermaqLogger.erroConsole("Não foi possível atualizar Contato. (Email: " + contato.getEmailAddress() + ") Motivo:");
            mastermaqLogger.erroArquivo("Não foi possível atualizar Contato. (Email: " + contato.getEmailAddress() + ") Motivo:");
            mastermaqLogger.erroConsole(MastermaqLogger.stack2String(e));
            mastermaqLogger.erroArquivo(MastermaqLogger.stack2String(e));
        }

        catch (IOException e) {
            mastermaqLogger.erroConsole("Não foi possível atualizar Contato. (Email: " + contato.getEmailAddress() + ") Motivo:");
            mastermaqLogger.erroArquivo("Não foi possível atualizar Contato. (Email: " + contato.getEmailAddress() + ") Motivo:");
            mastermaqLogger.erroConsole(MastermaqLogger.stack2String(e));
            mastermaqLogger.erroArquivo(MastermaqLogger.stack2String(e));
        }

    }

    // Método para buscar um registro de Conta existente no Oracle Eloqua a partir do EmailAddress
    public static PropriedadesConta buscarContaEloqua(String codSIEmpresa, ParametrosConexaoEloqua parametrosConexaoEloqua)
            throws IOException, URISyntaxException {
        HttpURLConnection con = parametrosConexaoEloqua.hTTPConnection(
                "/api/REST/2.0/data/accounts?depth=complete&search=M_Codigo_SI_Empresa1='" + codSIEmpresa + "'", "GET");
        String output = "";
        String resultado = "";

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader((con.getInputStream())));

            while ((output = br.readLine()) != null) {
                resultado = resultado + output;
            }

            con.disconnect();
        }

        catch (MalformedURLException e) {
            e.printStackTrace();
        }

        catch (IOException e) {
            e.printStackTrace();
        }

        PropriedadesConta propriedadesConta = Conversor.converterJson2ContaEloqua(resultado);
        return propriedadesConta;
    }

    // Método para buscar um registro de Contato existente no Oracle Eloqua a partir do CodSIEmpresa
    public static PropriedadesContato buscarContatoEloquaPorCodSIEmpresa(String codSIEmpresa,
            ParametrosConexaoEloqua parametrosConexaoEloqua) throws IOException, URISyntaxException {
        HttpURLConnection con = parametrosConexaoEloqua.hTTPConnection(
                "/api/REST/1.0/data/contacts?depth=complete&search=C_Codigo_SI_Empresa1='" + codSIEmpresa + "'", "GET");
        String output = "";
        String resultado = "";

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader((con.getInputStream())));

            while ((output = br.readLine()) != null) {
                resultado = resultado + output;
            }

            con.disconnect();
        }

        catch (MalformedURLException e) {
            e.printStackTrace();
        }

        catch (IOException e) {
            e.printStackTrace();
        }

        return Conversor.converterJson2ContatoEloqua(resultado);
    }

    // Método para buscar um registro de Contato existente no Oracle Eloqua a partir da data da última atualização
    public static PropriedadesContato buscarContatoEloquaPorDataAtualizacao(String dataAtualizacao,
            ParametrosConexaoEloqua parametrosConexaoEloqua) throws IOException {
        HttpURLConnection con = parametrosConexaoEloqua
                .hTTPConnection("/api/REST/1.0/data/contacts?lastUpdatedAt=" + dataAtualizacao, "GET");
        String output = "";
        String resultado = "";

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader((con.getInputStream())));

            while ((output = br.readLine()) != null) {
                resultado = resultado + output;
            }

            con.disconnect();
        }

        catch (MalformedURLException e) {
            e.printStackTrace();
        }

        catch (IOException e) {
            e.printStackTrace();
        }

        return Conversor.converterJson2ContatoEloqua(resultado);
    }

    // Método para buscar um registro de Contato existente no Oracle Eloqua
    public static PropriedadesContato buscarContatoEloquaPorEmail(String emailAddress,
            ParametrosConexaoEloqua parametrosConexaoEloqua) throws IOException, URISyntaxException {
        HttpURLConnection con = parametrosConexaoEloqua.hTTPConnection(
                "/api/REST/1.0/data/contacts?depth=complete&search=C_EmailAddress='" + emailAddress + "'", "GET");
        String output = "";
        String resultado = "";

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader((con.getInputStream())));

            while ((output = br.readLine()) != null) {
                resultado = resultado + output;
            }

            con.disconnect();
        }

        catch (MalformedURLException e) {
            e.printStackTrace();
        }

        catch (IOException e) {
            e.printStackTrace();
        }

        return Conversor.converterJson2ContatoEloqua(resultado);
    }

    // Método para criação de uma novo registro de Conta no Oracle Eloqua
    public static void criarContaEloqua(ContaEloqua conta, ParametrosConexaoEloqua parametrosConexaoEloqua,
            MastermaqLogger mastermaqLogger) throws IOException, URISyntaxException {
        HttpURLConnection con = parametrosConexaoEloqua.hTTPConnection("/api/REST/1.0/data/account", "POST");
        String json = Conversor.converterContaEloqua2Json(conta);
        String mensagem = "";
        String CodSIEmpresa = "";

        if (conta.getFieldValues() != null) {
            
            for (FieldValue fv : conta.getFieldValues()) {
                
                if (fv.getId().equals("100275")) {
                    CodSIEmpresa = fv.getValue();
                }
                
            }
            
        }

        try {
            OutputStream os = con.getOutputStream();
            os.write(json.getBytes());
            os.flush();

            if (con.getResponseCode() != HttpURLConnection.HTTP_CREATED) {
                mensagem = "Código de Status HTTP: " + con.getResponseCode();
                throw new RuntimeException(mensagem);
            }

            BufferedReader br = new BufferedReader(new InputStreamReader((con.getInputStream())));

            while (br.readLine() != null) {
            }

            con.disconnect();
            mastermaqLogger.infoConsole("Conta criada com sucesso. (" + CodSIEmpresa + ")");
            mastermaqLogger.infoArquivo("Conta criada com sucesso. (" + CodSIEmpresa + ")");
        }

        catch (MalformedURLException e) {
            mastermaqLogger.erroConsole("Não foi possível criar Conta. (Código SI Empresa: " + CodSIEmpresa + ") Motivo:");
            mastermaqLogger.erroArquivo("Não foi possível criar Conta. (Código SI Empresa: " + CodSIEmpresa + ") Motivo:");
            mastermaqLogger.erroConsole(MastermaqLogger.stack2String(e));
            mastermaqLogger.erroArquivo(MastermaqLogger.stack2String(e));
        }

        catch (IOException e) {
            mastermaqLogger.erroConsole("Não foi possível criar Conta. (Código SI Empresa: " + CodSIEmpresa + ") Motivo:");
            mastermaqLogger.erroArquivo("Não foi possível criar Conta. (Código SI Empresa: " + CodSIEmpresa + ") Motivo:");
            mastermaqLogger.erroConsole(MastermaqLogger.stack2String(e));
            mastermaqLogger.erroArquivo(MastermaqLogger.stack2String(e));
        }

    }

    // Método para criação de um novo registro de Contato no Oracle Eloqua
    public static void criarContatoEloqua(ContatoEloqua contato, ParametrosConexaoEloqua parametrosConexaoEloqua,
            MastermaqLogger mastermaqLogger) throws IOException, URISyntaxException {
        HttpURLConnection con = parametrosConexaoEloqua.hTTPConnection("/api/REST/1.0/data/contact", "POST");
        String json = Conversor.converterContatoEloqua2Json(contato);
        String mensagem = "";

        try {
            OutputStream os = con.getOutputStream();
            os.write(json.getBytes());
            os.flush();

            if (con.getResponseCode() != HttpURLConnection.HTTP_CREATED) {
                mensagem = "Código de Status HTTP: " + con.getResponseCode();
                throw new RuntimeException(mensagem);
            }

            BufferedReader br = new BufferedReader(new InputStreamReader((con.getInputStream())));

            while (br.readLine() != null) {
            }

            con.disconnect();
            mastermaqLogger.infoConsole("Contato criado com sucesso: " + contato.getEmailAddress() + ")");
            mastermaqLogger.infoArquivo("Contato criado com sucesso: " + contato.getEmailAddress() + ")");
        }

        catch (MalformedURLException e) {
            mastermaqLogger.erroConsole("Não foi possível criar Contato. (" + contato.getEmailAddress() + ") Motivo:");
            mastermaqLogger.erroArquivo("Não foi possível criar Contato. (" + contato.getEmailAddress() + ") Motivo:");
            mastermaqLogger.erroConsole(MastermaqLogger.stack2String(e));
            mastermaqLogger.erroArquivo(MastermaqLogger.stack2String(e));
        }

        catch (IOException e) {
            mastermaqLogger.erroConsole("Não foi possível criar Contato. (" + contato.getEmailAddress() + ") Motivo:");
            mastermaqLogger.erroArquivo("Não foi possível criar Contato. (" + contato.getEmailAddress() + ") Motivo:");
            mastermaqLogger.erroConsole(MastermaqLogger.stack2String(e));
            mastermaqLogger.erroArquivo(MastermaqLogger.stack2String(e));
        }

    }

}