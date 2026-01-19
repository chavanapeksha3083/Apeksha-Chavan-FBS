
// 1. Write a C program to add two integers and display the result (Without Return type with Parameter)

#include<stdio.h>
void add(int*,int*);  //function declaration
void main()
{
	int a,b;
	printf("Enter number for a:");
	scanf("%d",&a);
	
	printf("Enter number for b:");
	scanf("%d",&b);
	
  add(&a,&b);  //function call
 
  
}

void add(int* a,int* b)  // function defination
{
	
	int c=*a+*b;
	 printf("Addition is :%d",c);
	
}
