package com.migros.ucg.interfaces.java8.connection.program;

public class OracleConnection extends AbstractConnection
{
    public OracleConnection(String url) {
        super(url);
    }

    @Override
    public void showDateInfo()
    {
        super.showDateInfo();
        System.out.println("Oracle detayları...");
    }

    @Override
    public boolean openConnection()
    {
        /*
            Oracle'a ait bağlantı açma işlemleri yapılır.
         */

        return false;
    }

    @Override
    public boolean closeConnection()
    {
          /*
            Oracle'a ait bağlantı kapatma işlemleri yapılır.
         */

        return false;
    }
}
