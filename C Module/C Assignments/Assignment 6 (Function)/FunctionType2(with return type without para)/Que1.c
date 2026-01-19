
// 1. Write a C program to add two integers and display the result
#include<stdio.h>
int add(); // function declaration
void main()
{
	int res= add();   // function call
	printf("%d",res);
}
int add()  // function defination
{
	
int a ,b;
	int n;
	printf("Enter first number:");
	scanf("%d",&a);
	printf("Enter second number:");
	scanf("%d",&b);
	int c=a+b;
	return c;
}