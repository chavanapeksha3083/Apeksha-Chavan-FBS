package com.serviceImpl;

import com.DAOInterface.DAOInterface;
import com.aspect.provider.ObjectProvider;
import com.bean.User;
import com.services.LoginValidation;

public class ValidateUser implements LoginValidation
{
	
	User u = new User("java","java");
    private boolean flag;

    public boolean validateUser(String userName, String password)
    {
        DAOInterface dao = ObjectProvider.createDAOObject();

        flag = dao.retrivalRecord(userName); 

        if(flag)
            System.out.println("valid user");
        else
            System.out.println("invalid user");

        return flag;
    }

  /*
     public String forgetPassword(String username)
   
    {
    	DAOInterface dao = ObjectProvider.createDAOObject(); 
    	flag=dao.updatePassword(username,newPassword); 
    	if(flag)
    	
    		return "Your password is: "+ u.getPassword();
    	
    	else
    
    		return "User not found!";
    	
    	}

*/
    
    @Override
    public String forgetPassword(String username)
    {
        return "Please reset password using updatePassword()";
    }
    
    
    @Override
    public String updatePassword(String userName, String password, String newPassword)
    {
        DAOInterface dao = ObjectProvider.createDAOObject();

        flag = dao.updatePassword(userName, newPassword);

        if(flag)
        {
            return "Password updated successfully";
        }
        else
        {
            return "User not found";
        }
    }

   
}