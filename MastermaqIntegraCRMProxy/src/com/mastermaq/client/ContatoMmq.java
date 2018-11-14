package com.mastermaq.client;

import com.mastermaq.integracrm.ContatoSF;

public class ContatoMmq {
    private ContatoSF contatoSF;
    private String accountId;

    public static ContatoMmq toContatoMmq(ContatoSF contatoSF) {
        ContatoMmq contatoMmq = new ContatoMmq();
        contatoMmq.setContatoSF(contatoSF);
        return contatoMmq;
    }

    public ContatoSF getContatoSF() {
        return contatoSF;
    }

    public void setContatoSF(ContatoSF contatoSF) {
        this.contatoSF = contatoSF;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

}