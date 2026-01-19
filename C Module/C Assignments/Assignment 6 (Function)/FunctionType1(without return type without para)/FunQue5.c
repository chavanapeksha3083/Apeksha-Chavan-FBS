//5. Write a C program to input five numbers and find their average.

#include<stdio.h>
void Average();
void main ()
{
  Average();
}
void Average()
{
	int num1=5;
  int num2=10;
  int num3=15;
  int num4=16;
  int num5=20;
 float avg;
  
  avg=(num1+num2+num3+num4+num5)/5;
  printf("Average of five numbers are : %f",avg);
}
