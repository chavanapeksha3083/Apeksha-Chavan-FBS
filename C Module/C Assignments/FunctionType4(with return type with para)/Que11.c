
//1. Write a program to check whether a number is even or odd.(with return type with para)
#include<stdio.h>
int EvenOdd(int);
void main()
{
	int num;
	printf("Enter Number:");
	scanf("%d",&num);
	
	int res=EvenOdd(num);
	if(res==1)
	printf("Even");
	else
    printf("Odd");
}


int EvenOdd(int num)
{
		if(num%2==0)
		return 1;
		
  	else
	return 0;

	
}