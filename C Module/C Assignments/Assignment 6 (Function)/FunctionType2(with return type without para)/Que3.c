/* 3. Write a C program to convert temperature from Celsius to Fahrenheit using the
formula: 
F = (C *9/5) + 32
*/


#include<stdio.h>
float temperature();
void main()
{
  float res =temperature();
  printf("%f",res);
}
float temperature()
{
	
	int C;
	 printf("Enter Temperature:");
	 scanf("%d",&C);
	 float F=(C*9.0/5)+32;
	 return F;

}

	


	