//6. Write a C program to find the square and cube of a given number.

#include<stdio.h>
void main()
{
	int a ;
	int square;
	int cube;
	
	printf("Enter Any number :");
	
	scanf("%d",&a);
	square= a*a;
	cube=a*a*a;
	printf("\nSquare of given number is :%d",square);
	printf("\nCube of given number is :%d ",cube);

}
