package com.migros.ucg.interfaces.java8.connection.program;

public class MySQLConnection extends AbstractConnection
{
    public MySQLConnection(String url) {
        super(url);
    }

    @Override
    public void showDateInfo()
    {
        super.showDateInfo();
        System.out.println("MySQL detayları...");
    }

    @Override
    public boolean openConnection()
    {
          /*
            MySQL'e ait bağlantı açma işlemleri yapılır.
         */
        return false;
    }

    @Override
    public boolean closeConnection()
    {
        /*
            MySQL'e ait bağlantı açma işlemleri yapılır.
         */
        return false;
    }
}
