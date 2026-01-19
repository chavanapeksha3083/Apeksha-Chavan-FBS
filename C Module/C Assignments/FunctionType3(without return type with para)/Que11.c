
//1. Write a program to check whether a number is even or odd.(without return type with para)
#include<stdio.h>
void EvenOdd(int);
void main()
{
	int num;
	printf("Enter Number:");
	scanf("%d",&num);
	
	EvenOdd(num);
	
}


void EvenOdd(int num)
{
	if(num%2==0)
		printf("Even");
	else
    printf("Odd");
		
}