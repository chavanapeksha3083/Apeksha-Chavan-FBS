//3. Write a program to check whether a given year is a leap year. (without return type with para)

#include<stdio.h>
void isLeapYear(int);
void main()
{
 
 int year=2009;
 printf("Enter Year:");
 scanf("%d",&year);
 
isLeapYear(year);

	
}

void isLeapYear(int year)
{
	if(year%4==0 && year%100!=0 || year%400==0)
	
      printf("Year is Leap");
   else
      printf("Year is not Leap");
}


	

