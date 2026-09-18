package p1;
class Employee1
{
  int id;
  String name;
  double salary;
 
  
 
Employee1()
{
this.id=00;
this.name="Not Given";
this.salary=00;

}
Employee1(int i,String n,double s)
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

public String toString()
{
  return "\nId :"+this.id +"\nName :"+this.name +"\nSalary :"+this.salary;
}
}