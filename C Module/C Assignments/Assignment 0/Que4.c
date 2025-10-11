
//4. Write a C program to swap two numbers using a temporary third variable.

#include<stdio.h>

void main()
{


	
	int a=10,b=20;
	int temp;
	
	printf("Before swapping a and b are: %d and %d  ",a,b);
	temp=a;
	a=b;
	b=temp;
	
  
	printf("\nAfter swapping %d and %d ",a,b);
}