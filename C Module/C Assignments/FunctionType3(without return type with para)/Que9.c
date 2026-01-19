
// 9. Write a C program to input the base and height of a triangle and calculate its area.

#include<stdio.h>
void Triarea(int,int);
void main()
{
	int b;
	int h;
	
	printf("Enter base and height:");
	scanf("%d %d",&b,&h);
	
	Triarea(b,h);

}

void Triarea(int b,int h)
{
	int area;
	area= 0.5*b*h;
	printf("Area of Triangle is : %f",area);
}

