package com.DAOInterface;

public  interface DAOInterface 
{
public boolean retrivalRecord(String userName);
boolean updatePassword(String username, String newPassword);
public boolean insertRecord(String userName,String password);
public boolean DeletetRecord(String userName,String password);

	
	
}
