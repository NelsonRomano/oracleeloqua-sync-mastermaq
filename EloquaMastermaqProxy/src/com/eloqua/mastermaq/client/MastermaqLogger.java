package com.eloqua.mastermaq.client;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MastermaqLogger {
    private static MastermaqLogger mastermaqLogger = null;    
    private static SimpleDateFormat sdfLog = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    private BufferedWriter logWriter;

    public MastermaqLogger(File file) throws IOException {
        file.getParentFile().mkdirs();
        this.logWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file, true), "UTF-8"));
    }

    public static MastermaqLogger getMastermaqLogger(File file) throws IOException {
        
        if (mastermaqLogger == null) {
            mastermaqLogger = new MastermaqLogger(file);
        }
        
        return mastermaqLogger;
    }

    public String info(String mensagem) {
        Date agora = new Date();
        String infoString = infoConsole(agora, mensagem);
        infoArquivo(agora, mensagem);
        return infoString;
    }

    public void infoArquivo(Date data, String mensagem) {
        
        try {
            this.logWriter.write(sdfLog.format(data) + " INFO: " + mensagem);
            this.logWriter.newLine();
            this.logWriter.flush();
        }
        
        catch (IOException e) {
            e.printStackTrace();
        }
        
    }
    
    public void infoArquivo(String mensagem) {
      
      try {
          this.logWriter.write(mensagem);
          this.logWriter.newLine();
          this.logWriter.flush();
      }
      
      catch (IOException e) {
          e.printStackTrace();
      }
      
  }

    public String infoConsole(String mensagem) {
      String infoString = mensagem;
      System.out.println(infoString);
      return infoString;
    }

    public String infoConsole(Date data, String mensagem) {
        String infoString = sdfLog.format(data) + " INFO: " + mensagem;
        System.out.println(infoString);
        return infoString;
    }

    public String erro(String mensagem) {
        Date agora = new Date();
        String erroString = erroConsole(agora, mensagem);
        erroArquivo(agora, mensagem);
        return erroString;
    }

    public void erroArquivo(Date data, String mensagem) {
        
        try {
            this.logWriter.write(sdfLog.format(data) + " ERRO: " + mensagem);
            this.logWriter.newLine();
            this.logWriter.flush();
        }
        
        catch (IOException e2) {
            e2.printStackTrace();
        }
        
    }
    
    public void erroArquivo(String mensagem) {
      
      try {
          this.logWriter.write(mensagem);
          this.logWriter.newLine();
          this.logWriter.flush();
      }
      
      catch (IOException e2) {
          e2.printStackTrace();
      }
      
  }

    public void erroArquivo(Date data, String mensagem, Exception e) {
        
        try {
            this.logWriter.write(sdfLog.format(data) + " ERRO: " + mensagem + "\n" + stack2String(e));
            this.logWriter.flush();
        }
        
        catch (IOException e3) {
            e3.printStackTrace();
        }

        this.erroArquivo(data, mensagem + "\n" + stack2String(e));
        
    }

    public String erroConsole(Date data, String mensagem) {
        String erroString = sdfLog.format(data) + " ERRO: " + mensagem;
        System.out.println(erroString);
        return erroString;
    }
    
    public String erroConsole(String mensagem) {
      String erroString = mensagem;
      System.out.println(erroString);
      return erroString;
  }

    public void erroConsole(Date data, String mensagem, Exception e) {
        System.out.println(sdfLog.format(data) + " ERRO: " + mensagem + "\n" + stack2String(e));
    }

    public void linha() {
        
        try {
            this.logWriter.newLine();
            this.logWriter.flush();
        }
        
        catch (IOException e) {
            e.printStackTrace();
        }
        
    }

    public static String stack2String(Exception e) {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        e.printStackTrace(pw);
        return sw.toString();
    }
    
}