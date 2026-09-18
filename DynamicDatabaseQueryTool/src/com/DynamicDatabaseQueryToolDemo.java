package com;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;
import java.util.Scanner;

public class QueryAnalizeApplicationDemo
{
    Connection con;
    Statement stmt;
    ResultSet rs;

    public void Connect(String query) 
    {
        try 
        {
            // Load properties file
            FileInputStream fis = new FileInputStream("Resources/Dbconfig.properties");
            Properties p = new Properties();
            p.load(fis);

            String dClass = p.getProperty("driver");
            String url = p.getProperty("url");
            String u = p.getProperty("username");
            String pass = p.getProperty("password");

            // Load driver
            Class.forName(dClass);

            // Create connection
            con = DriverManager.getConnection(url, u, pass);
            System.out.println("✅ Connection successful\n");

            // Create statement
            stmt = con.createStatement();

            // 🔥 Query Type Detection
            String qType = query.trim().toLowerCase();

            if (qType.startsWith("select")) 
            {
                rs = stmt.executeQuery(query);

                // 🔥 Table Format Output
                var meta = rs.getMetaData();
                int colCount = meta.getColumnCount();

                // Print column names
                for (int i = 1; i <= colCount; i++) 
                {
                    System.out.print(meta.getColumnName(i) + "\t");
                }
                System.out.println();

                // Print rows
                while (rs.next()) 
                {
                    for (int i = 1; i <= colCount; i++) 
                    {
                        System.out.print(rs.getString(i) + "\t");
                    }
                    System.out.println();
                }
            } 
            else 
            {
                int count = stmt.executeUpdate(query);
                System.out.println("✅ " + count + " rows affected");
            }

        } 
        catch (Exception e) 
        {
            // 🔥 Professional Exception Handling
            System.out.println("❌ Error: " + e.getMessage());
        } 
        finally 
        {
            // 🔥 Resource Closing
            try 
            {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if (con != null) con.close();
            } 
            catch (Exception e) 
            {
                System.out.println("❌ Closing error: " + e.getMessage());
            }
        }
    }

    public static void main(String[] args) 
    {
        QueryAnalizeApplicationDemo query = new QueryAnalizeApplicationDemo();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your SQL query:");
        String q = sc.nextLine();

        query.Connect(q);
    }
}