/* 3. Write a C program to convert temperature from Celsius to Fahrenheit using the
formula: 
F = (C *9/5) + 32  (Without return type with parameter)
*/

#include<stdio.h>
 void temperature(int );
void main()
{
	 int C;
	 printf("Enter Temperature:");
	 scanf("%d",&C);
	 temperature(C);

}

 void temperature(int C)
{
	float F=(C*9.0/5)+32;
		 

//	 printf("Temperature is:%d",C);
	 printf("\nTemperature from Celsius to Fahrenheit is:%f",F);

}

	