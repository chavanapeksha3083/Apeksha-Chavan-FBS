// 7. Write a C program to convert given minutes into hours and remaining minutes.

#include<stdio.h>

void main()
{
 int min= 90;
 int hrs;
 int remmin;
 hrs = min/60;
 remmin=min%60;
 
 printf("Hours are :%d",hrs);
 printf("\nRemaining Minutes are :%d",remmin);
  	
}