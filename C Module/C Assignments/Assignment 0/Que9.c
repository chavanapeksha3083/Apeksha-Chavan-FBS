// 9. Write a C program to input the base and height of a triangle and calculate its area.

#include<stdio.h>
void main()
{
	int b;
	int h;
	int area;
	
	printf("Enter base and height:");
	
	scanf("%d %d",&b,&h);
	
	area= 0.5*b*h;
	printf("Area of Triangle is : %d",area);

}
