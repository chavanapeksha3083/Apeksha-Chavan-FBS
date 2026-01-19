//2. Write a C program to find the area of a circle.(With return type with parameter)

#include<stdio.h>
float area();
void main()
{
	int r;
	printf("Enter Radius is :");
	scanf("%d",&r);
   
   float res=area(r);
   printf("%f",res);
}

float area(int r)
{
	float area= 3.14*r*r;
	 return area;
}
