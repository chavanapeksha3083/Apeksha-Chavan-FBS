package p1;

public class Employee
{
	
  int id;
  String name;
  double salary;
 
  
 
public Employee()
{
this.id=234;
this.name="Priya";
this.salary=23455;

}
public Employee(int i,String n,double s)
{
 this.id=i;
 this.name=n;
this.salary=s;

}
void setId(int i)
{
 this.id=i;
}

void setName(String n)
{
  this.name=n;
}

void setSalary(double s)
{
 this.salary=s;
}
public void display()
{
  System.out.println("ID is :"+this.id);
  System.out.println("Name is :"+this.name);
  System.out.println("Salary is :"+this.salary);

}



}//EmployeeDemo class ends here


