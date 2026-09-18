package com;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;
import java.util.Scanner;
import java.sql.PreparedStatement;
public class JDBCApplication 
{

    Connection con;
    Statement stmt;
    ResultSet rs;
    PreparedStatement pst;

    public void connect() 
    {
        try 
        {
        	//read the middleware
        	FileInputStream fis= new FileInputStream(".//Resources//Dbconfig.properties");
        	Properties p =new Properties();
        	p.load(fis);
        	
        	String dClass=p.getProperty("driver");
        	String url=p.getProperty("url");
        	String u=p.getProperty("username");
        	String pass=p.getProperty("password");
        	
        	
        	//step 1 .....load class into memory
            Class.forName(dClass);

            con = DriverManager.getConnection(url,u,pass);
            
            System.out.println("Connection successful");

        } 
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public void retrieve(String u) 
    {
        try 
        {
            /*stmt = con.createStatement();
            rs = stmt.executeQuery("select * from User");
           */
            pst=con.prepareStatement("select * from User where UserName=?");
            pst.setString(1,u);
            rs=pst.executeQuery();
           boolean flag=false;
            while(rs.next()) 
            {
            	flag =true;
                String user = rs.getString(1);
                String pass = rs.getString(2);

                System.out.println("Table records are.... "+user + " / " +pass);
            }
            
            if(flag)
            {
            	System.out.println("UserName found");
            }
            else
            {
            	System.out.println("UserName Not found");
            }

        }
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }

    public void insert(String u,String p,String q,String a)
    {
        try
        {
            stmt = con.createStatement();
           /*
            int count = stmt.executeUpdate("insert into User(UserName,Password,securityQuestion,securityAnswer) " +
            "values('Apeksha','apeksha@123','what is your fav pet','dog')");
          
            */
            pst = con.prepareStatement("insert into User values(?,?,?,?)");
            pst.setString(1,u);
            pst.setString(2,p);
            pst.setString(3,q);
            pst.setString(4,a);

            int updatecount=pst.executeUpdate();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    public void delete(String username) 
    {
        try
        {
        	/*
            stmt = con.createStatement();
            int count=stmt.executeUpdate("delete from User where UserName='Aditi'");
            */

        	 pst=con.prepareStatement("delete from User where UserName=?");
             pst.setString(1, username);
            

             int count=pst.executeUpdate();
             
             if(count > 0)
             {
                 System.out.println(count + " record deleted successfully");
             }
             else
             {
                 System.out.println("User not found nothing deleted");
             }

          
           // System.out.println(count + "record deleted");
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }

    public void update(String newPassword, String username) 
    {
        try 
        {
         /*
        	stmt=con.createStatement();
            int count=stmt.executeUpdate("update User set password='123@priya' where UserName='Priya'");

            System.out.println(count + "record updated ");

          */
        	
        	
        	 pst = con.prepareStatement("update User set password=? where UserName=?");
             pst.setString(1, newPassword);
             pst.setString(2, username);

             int count = pst.executeUpdate();

             if(count > 0)
             {
                 System.out.println("Password updated successfully");
             }
             else
             {
                 System.out.println("User not found update failed");
             }
        	
        	
        } 
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) 
    {
        //accept data from user
        JDBCApplication j1 = new JDBCApplication();
        Scanner sc=new Scanner(System.in);
        
        j1.connect();
        System.out.println("Enter username to search:");
        String username = sc.nextLine();

        j1.retrieve(username);
        System.out.println("Enter new user details");

        System.out.println("Username:");
        String u = sc.nextLine();
        System.out.println("Password:");
        String p = sc.nextLine();

        System.out.println("Enter username to update password:");
        String upUser = sc.nextLine();

        System.out.println("Enter new password:");
        String newPass = sc.nextLine();
        
        
        System.out.println("Security Question:");
        String q = sc.nextLine();

        System.out.println("Security Answer:");
        String a = sc.nextLine();

        j1.insert(u,p,q,a);
        System.out.println("New User Inserted Successfully");
  
        System.out.println("Enter username to delete:");
        String deluser = sc.nextLine();

        j1.delete(deluser);

        j1.update(newPass, upUser);
        
        
       
    }
}
