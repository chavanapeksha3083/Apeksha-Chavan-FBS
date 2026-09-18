package p2;

import p1.Employee;

public class SalesManager extends Employee
{
 
  int incentive;
  int target;
   
public SalesManager()
{
super();
this.incentive=45;
this.target=235;

}

public SalesManager(int i,String n,int s ,int c,int t)
{
super(i,n,s);
this.incentive=c;
this.target=t;

}


void setIncentive(int c)
{
this.incentive=c;
}

void setTarget(int t)
{
this.target=t;
}
public void display()
{
	super.display();
 System.out.println("Incentive is :"+this.incentive);
 System.out.println("Target is :"+this.target);

}



}//class SalesManager ends here

