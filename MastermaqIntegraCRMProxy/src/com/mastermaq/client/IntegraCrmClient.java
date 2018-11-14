package com.mastermaq.client;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;
import com.mastermaq.integracrm.ContaEL;
import com.mastermaq.integracrm.ContaSF;
import com.mastermaq.integracrm.ContatoEL;
import com.mastermaq.integracrm.ContatoSF;
import com.mastermaq.integracrm.IntegraSalesForce;
import com.mastermaq.integracrm.IntegraSalesForceSoap;
import com.mastermaq.integracrm.ObjectFactory;
import com.mastermaq.integracrm.Oportunidade;
import com.mastermaq.integracrm.OportunidadeSF;
import com.mastermaq.integracrm.PersonalAuthentication;
import com.mastermaq.integracrm.ProdutoSF;
import com.mastermaq.integracrm.RetornoOportunidade;

public class IntegraCrmClient {
    private static IntegraSalesForce integraSalesForce;
    private IntegraSalesForceSoap integraSalesForceSoap;
    private final PersonalAuthentication personalAuthentication;
    protected static ObjectFactory of = new ObjectFactory();
    private static SimpleDateFormat sdfMmq = new SimpleDateFormat("dd/MM/yyyy");

    public IntegraCrmClient(String usuario, String senha) {
        sdfMmq.setTimeZone(TimeZone.getTimeZone("America/Sao_Paulo"));
        integraSalesForce = new IntegraSalesForce();
        this.integraSalesForceSoap = integraSalesForce.getIntegraSalesForceSoap();
        this.personalAuthentication = of.createPersonalAuthentication();
        personalAuthentication.setUsername(usuario);
        personalAuthentication.setPassword(senha);
    }

    public String elAtualizaDadosContato(ContatoEL contato) {
        return this.integraSalesForceSoap.elAtualizaDadosContato(contato, personalAuthentication);
    }
    
    public RetornoOportunidade novaOportunidade(Oportunidade oportunidade) throws Exception {
        return this.integraSalesForceSoap.novaOportunidade(oportunidade, personalAuthentication);
    }

    public List<ContaEL> elDadosContas(String dataAtualizacao) throws Exception {
        return this.integraSalesForceSoap.elDadosContas(dataAtualizacao, personalAuthentication).getContaEL();
    }

    public List<ContatoEL> elDadosContatos(String dataAtualizacao) throws Exception {
        return this.integraSalesForceSoap.elDadosContatos(dataAtualizacao, personalAuthentication).getContatoEL();
    }

    public List<ContaSF> sfContaInfo(String dataAtualizacao) throws Exception {
        return this.integraSalesForceSoap.sfContaInfo(dataAtualizacao, personalAuthentication).getContaSF();
    }

    public List<ContaSF> sfContaInfo(int diasAtras) throws Exception {
        
        if (diasAtras > 0) {
            diasAtras *= -1;
        }
        
        Calendar cal = Calendar.getInstance();
        cal.setTime(new Date());
        cal.add(Calendar.DATE, diasAtras);
        return sfContaInfo(sdfMmq.format(cal.getTime()));
    }

    public List<ContatoSF> sfContatoInfo(String dataAtualizacao) throws Exception {
        return this.integraSalesForceSoap.sfContatoInfo(dataAtualizacao, personalAuthentication).getContatoSF();
    }

    public List<ContatoMmq> contatoMmqInfo(String dataAtualizacao) throws Exception {
        List<ContatoSF> contatosSF = sfContatoInfo(dataAtualizacao);
        List<ContatoMmq> contatosMmq = new ArrayList<ContatoMmq>();

        for (ContatoSF c : contatosSF) {
            contatosMmq.add(ContatoMmq.toContatoMmq(c));
        }

        return contatosMmq;
    }

    public List<OportunidadeSF> sfOportunidadeInfo(String dataAtualizacao) throws Exception {
        return this.integraSalesForceSoap.sfOportunidadeInfo(dataAtualizacao, personalAuthentication).getOportunidadeSF();
    }

    public List<OportunidadeMmq> oportunidadeMmqInfo(String dataAtualizacao) throws Exception {
        List<OportunidadeSF> oportunidadesSF = sfOportunidadeInfo(dataAtualizacao);
        List<OportunidadeMmq> oportunidadesMmq = new ArrayList<OportunidadeMmq>();

        for (OportunidadeSF o : oportunidadesSF) {
            oportunidadesMmq.add(OportunidadeMmq.toOportunidadeMmq(o));
        }

        return oportunidadesMmq;
    }

    public List<ProdutoSF> sfProdutoInfo(String dataAtualizacao) throws Exception {
        return this.integraSalesForceSoap.sfProdutoInfo(personalAuthentication).getProdutoSF();
    }

}