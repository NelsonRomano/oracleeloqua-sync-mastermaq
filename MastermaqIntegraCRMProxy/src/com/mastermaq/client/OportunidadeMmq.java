package com.mastermaq.client;

import com.mastermaq.integracrm.OportunidadeSF;

public class OportunidadeMmq {
    private OportunidadeSF oportunidadeSF;
    private String accountId;

    public static OportunidadeMmq toOportunidadeMmq(OportunidadeSF oportunidadeSF) {
        OportunidadeMmq oportunidadeMmq = new OportunidadeMmq();
        oportunidadeMmq.setOportunidadeSF(oportunidadeSF);
        return oportunidadeMmq;
    }

    public OportunidadeSF getOportunidadeSF() {
        return oportunidadeSF;
    }

    public void setOportunidadeSF(OportunidadeSF oportunidadeSF) {
        this.oportunidadeSF = oportunidadeSF;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

}