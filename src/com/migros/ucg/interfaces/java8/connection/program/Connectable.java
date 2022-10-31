package com.migros.ucg.interfaces.java8.connection.program;

import java.text.SimpleDateFormat;
import java.util.Date;

public interface Connectable
{
    boolean openConnection();

    boolean closeConnection();

    default void showDateInfo()
    {
        System.out.println("Date: " + new SimpleDateFormat("dd-MM-yyyy, hh:mm:ss").format(new Date()));
    }

    static void tarihBilgisiGoster()
    {
        System.out.println("Tarih: " + new SimpleDateFormat("dd-MM-yyyy, hh:mm:ss").format(new Date()));
    }
}
