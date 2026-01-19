//2. Write a C program to find the area of a circle.

#include<stdio.h>
float area();
void main()
{

 float res = area();
	printf("%2f",res);
}
float area()
{
	
	 int r;
	printf("Enter Radius:");
	scanf("%d",&r);
	float area= 3.14*r*r;
	return area;
}
