
//4. Write a C program to swap two numbers using a temporary third variable.

#include<stdio.h>
int swap();
void main()
{
  int res=swap();
  printf("\nAfter Swapping is  %d:",res);
  
}
int swap()
{
	
	int a,b;
	int temp;
	printf("Enter Number for a:");
	scanf("%d",&a);
	
	printf("Enter Number for b:");
	scanf("%d",&b);
	
	printf("Before swapping a and b are: %d and %d  ",a,b);
	temp=a;
	a=b;
	b=temp;
	
   return a;
  
	//printf("\nAfter swapping %d and %d ",a,b);
}