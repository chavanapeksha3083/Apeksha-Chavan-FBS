/*
7. Accept the age and check if the person is:
Child (age < 12),Teenager (12–19),Adult (20–59),Senior (60 and above)
*/

#include<stdio.h>

void main()
{
  int age = 60;
  if(age>0 &&age<=12)
  {
  	printf("Child");
  }
  else if(age>12 &&age<=19)
  {
  	
  	printf("Teenager");
  }
  else if(age>=20 && age<=59)
  {
  	
  	printf("Adult");
  }
  else if(age>=60 && age<80)
  {
  	
  	printf("Senior");
  	
  }
  else
  {
  	
  	printf("Invalid age");
}

}
