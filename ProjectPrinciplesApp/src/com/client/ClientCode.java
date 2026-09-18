package com.client;

import java.util.Scanner;

import com.aspect.provider.ObjectProvider;
import com.serviceImpl.ValidateUser;
import com.services.LoginValidation;

public class ClientCode {
	 public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("please enter username");
	String name=sc.next();
	System.out.println("please enter password");
	String password=sc.next();
	
	LoginValidation validate =ObjectProvider.createObject();
	
	if(validate.validateUser(name,password))
	{
		System.out.println("welcome user ..."+name);
		
	}
	else
	{
		System.out.println("please try again");
	}
	
	 }

}