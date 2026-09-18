
package com.aspect.provider;

import com.services.LoginValidation;

import java.io.FileInputStream;
import java.util.Properties;

import com.DAOInterface.DAOInterface;

import com.serviceImpl.ValidateUser;


public class ObjectProvider {
static Properties p;
static
{
try
{
FileInputStream fis=new FileInputStream(".//Resources//info.properties");
        p=new Properties();
        p.load(fis);
}
catch(Exception e)
{
e.printStackTrace();
}
}

    public static LoginValidation createObject() {
        LoginValidation l = null;
        try
        {
        //read the file of middleware
       
        String className=p.getProperty("BusinessClass");
       
        //2nd step -create an object of business class
       
        l=(LoginValidation) Class.forName(className).newInstance();
        }
        catch(Exception e)
        {
        e.printStackTrace();
        }
        return l;
       
    }
   
    public static DAOInterface createDAOObject()
    {
    DAOInterface dao=null;
    try
    {
    String className=p.getProperty("DAOClass");
       
        //2nd step -create an object of business class
       
        dao=(DAOInterface) Class.forName(className).newInstance();
    }
    catch(Exception e)
    {
    e.printStackTrace();
    }
    return dao;
   
    }
}

