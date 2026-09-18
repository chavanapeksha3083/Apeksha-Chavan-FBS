package p1;

class EmployeeDemo implements Comparable<EmployeeDemo>
{
  int id;
  String name;
  double salary;
 
  
 
EmployeeDemo()
{
this.id=00;
this.name="Not Given";
this.salary=00;

}
EmployeeDemo(int i,String n,double s)
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



@Override
public boolean equals(Object o)
{
  System.out.println("equals called");
  EmployeeDemo e2 = (EmployeeDemo) o;
  if(this.id==e2.id)  
	  return true;
  else
	  return false;
  
}


@Override
public int compareTo(EmployeeDemo o) 
{
	// TODO Auto-generated method stub
	
	//return this.id-o.id;
	
	//return this.name.compareTo(o.name); // ascending order
	// return o.name.compareTo(this.name);
	
	return (int) (this.salary- o.salary);
}



public int hashCode()
{
 System.out.println("inside hashcode");

	return this.id;
}







}

