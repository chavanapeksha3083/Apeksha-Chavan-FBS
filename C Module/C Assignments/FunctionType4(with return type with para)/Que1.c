
// 1. Write a C program to add two integers and display the result (With Return type with Parameter)

#include<stdio.h>
int add(int,int);  //function declaration
void main()
{
	int a,b;
	printf("Enter number for a:");
	scanf("%d",&a);
	
	printf("Enter number for b:");
	scanf("%d",&b);
	
  int res =add(a,b);  //function call
  printf("%d",res);
  
}

int add(int a,int b)  // function defination
{
	
	int c=a+b;
	return c;
	
}
