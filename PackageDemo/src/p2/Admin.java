package p2;

import p1.Employee;
	public class Admin extends Employee
	{
	  
	  int allowance;
	 

	public  Admin()
	{
	super();
	this.allowance=456;
	}
	public Admin(int i,String n,double s,int a)
	{
	super(i,n,s);
	this.allowance=a;
	}



	void setAllowance(int a)
	{
	  this.allowance=a;
	}

	public void display()
	{
	 super.display();
	  System.out.println("Allowance is :"+this.allowance);

	}



	} //class Admin1 ends here



