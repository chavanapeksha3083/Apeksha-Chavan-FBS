package com.services;

public interface LoginValidation 
{
    public boolean validateUser(String userName, String password);

    public String forgetPassword(String username);

    public String updatePassword(String userName, String password, String newPassword);
}