package com.myusebean;

public class ServiceBean 
{
	private String type,service;
	public ServiceBean() 
	{
		// TODO Auto-generated constructor stub
	}
	
	
	public ServiceBean(String type, String service) {
	
		this.type = type;
		this.service = service;
	}


	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getService() {
		return service;
	}
	public void setService(String service) {
		this.service = service;
	}
	
	
	public String getServiceStatus()
	{
		String service=null;
		if(type.equals("current"))
		{
			service="overdraft";
		}
		 
		if(type.equals("saving"))
		{
			service="fd";
		}
		
		return service;
	}

}