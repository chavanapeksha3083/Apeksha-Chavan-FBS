//2. Write a C program to find the area of a circle.(Without return type with parameter)

#include<stdio.h>
void area(int*);
void main()
{
	int r;
	printf("Enter Radius is :");
	scanf("%d",&r);
   
   area(&r);
   
}

void area(int* r)
{
	float area= 3.14*(*r)*(*r);
	 printf("Area is :%f",area);
}
