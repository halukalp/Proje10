package com.migros.ucg.interfaces.java8.connection.program;

public class Main
{
    private static final String ORACLE_URL = "";
    private static String MYSQL_URL = "";

    public static void main(String[] args)
    {
        OracleConnection oracleConnection1 = new OracleConnection(ORACLE_URL);
        oracleConnection1.showDateInfo();

        System.out.println("\n");

        MySQLConnection mySQLConnection1 = new MySQLConnection(MYSQL_URL);
        mySQLConnection1.showDateInfo();

        System.out.println("\n");

        Connectable.tarihBilgisiGoster();
    }
}
