package com.DAOImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.DAOInterface.DAOInterface;
import com.aspect.provider.DBConnectionProvider;

public class DAOImplementation implements DAOInterface
{
    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    boolean flag = false;

   
    public boolean retrivalRecord(String userName) 
    {
        try
        {
            con = DBConnectionProvider.createConnection();

           // pst = con.prepareStatement("select * from User where userName=? and password=?");
            pst = con.prepareStatement("select * from User where userName=?");
            pst.setString(1, userName);
            //pst.setString(2, password);

            rs = pst.executeQuery();

            if(rs.next())
            {
                flag = true;
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return flag;
    }

   
    public boolean updatePassword(String UserName, String newPassword)
    {
        try
        {
            con = DBConnectionProvider.createConnection();

            pst = con.prepareStatement("update User set password=? where UserName=?");
            pst.setString(1, newPassword);
            pst.setString(2, UserName);

            int count = pst.executeUpdate();

            if(count > 0)
            {
                flag = true;
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return flag;
    }

    
    public boolean insertRecord(String userName, String password)
    {
        try
        {
            con = DBConnectionProvider.createConnection();

            pst = con.prepareStatement("insert into User(userName,password) values(?,?)");
            pst.setString(1, userName);
            pst.setString(2, password);

            int count = pst.executeUpdate();

            if(count > 0)
            {
                flag = true;
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return flag;
    }

    
    public boolean DeletetRecord(String userName, String password)
    {
        try
        {
            con = DBConnectionProvider.createConnection();

            pst = con.prepareStatement("delete from User where userName=? and password=?");
            pst.setString(1, userName);
            pst.setString(2, password);

            int count = pst.executeUpdate();

            if(count > 0)
            {
                flag = true;
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return flag;
    }


}