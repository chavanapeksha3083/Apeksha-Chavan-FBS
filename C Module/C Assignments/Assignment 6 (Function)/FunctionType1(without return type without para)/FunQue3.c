//3. Write a program to check whether a given year is a leap year.

#include<stdio.h>
void LeapYear();
void main()
{
 LeapYear();

}
void LeapYear()
{
	int year=2004;
	if(year%4==0 && year%100!=0 || year%400==0)
	{
		printf("Year is Leap");
	}
	else
	{
		printf("Year is not leap");
	}
	
}