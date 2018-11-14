package com.eloqua.mastermaq.client;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.Base64;
import java.net.URL;

public class ParametrosConexaoEloqua {
    private String companhia;
    private String usuario;
    private String senha;    
    
    public ParametrosConexaoEloqua(String companhia, String usuario, String senha) {
        this.companhia = companhia;
        this.usuario = usuario;
    	this.senha = senha;
    }
    
    public String getSenha() {
        String login = companhia + "\\" + usuario + ":" + senha;
        byte[] b = login.getBytes();
        String senha = Base64.getEncoder().encodeToString(b);
        return senha;
    }

    public HttpURLConnection hTTPConnection(String urlString, String metodo) throws IOException {    	
    	URL url = new URL("https://secure.p04.eloqua.com" + urlString);
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setDoOutput(true);
        con.setRequestMethod(metodo);
        con.setRequestProperty("Authorization", "Basic " + getSenha());
        con.setRequestProperty("Content-Type", "application/json");
        con.setRequestProperty("Accept", "application/json");
        return con;
    }

}