package com.aspect.provider;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class DBConnectionProvider
{
    public static Connection createConnection()
    {
        Connection con = null;

        try
        {
            FileInputStream fis = new FileInputStream(".//Resources//Dbconfig.properties");
            Properties p = new Properties();
            p.load(fis);

            String dClass = p.getProperty("driver");
            String url = p.getProperty("url");
            String u = p.getProperty("username");
            String pass = p.getProperty("password");

            Class.forName(dClass);
            con = DriverManager.getConnection(url, u, pass);

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return con;
    }
}