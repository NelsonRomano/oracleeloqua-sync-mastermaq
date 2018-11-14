package com.eloqua.mastermaq.client;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class ConversaoDeData {

    public static long get1970() {
        Calendar ano1970 = Calendar.getInstance();
        ano1970.set(Calendar.YEAR, 1970);
        ano1970.set(Calendar.MONTH, 0);
        ano1970.set(Calendar.DAY_OF_MONTH, 1);
        ano1970.set(Calendar.HOUR_OF_DAY, -3);
        ano1970.set(Calendar.MINUTE, 0);
        ano1970.set(Calendar.SECOND, 0);
        ano1970.set(Calendar.MILLISECOND, 0);
        return ano1970.getTimeInMillis();
    }

    public static Date getDate(long tempoEmSegs) {
        long milissegundos = tempoEmSegs * 1000;
        Date data = new Date(milissegundos + get1970());
        return data;
    }
    
    public static String getDateString(long tempoEmSegs) {
        long milissegundos = tempoEmSegs * 1000;
        Date data = new Date(milissegundos + get1970());
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
        sdf.setTimeZone(TimeZone.getTimeZone("America/Sao_Paulo"));
        String dataString = sdf.format(data);
        return dataString;
    }
    
    public static long getDataLong(String dataString) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date dataDate = sdf.parse(dataString);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(dataDate);
        long dataLong = calendar.get(Calendar.SECOND);
        return dataLong;
    }    
    
}