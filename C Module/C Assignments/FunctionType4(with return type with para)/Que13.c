//3. Write a program to check whether a given year is a leap year. (with return type with para)

#include<stdio.h>
int isLeapYear(int);
void main()
{
 
 int year=2009;
 printf("Enter Year:");
 scanf("%d",&year);
 
int res= isLeapYear(year);
 if(res==1)
 printf("Year is Leap");
 else
 printf("Year is not Leap");
	
}

int isLeapYear(int year)
{
	if(year%4==0 && year%100!=0 || year%400==0)
	{
	  return 1;
	}
	else
	{
	return 0;
	}
}


	

