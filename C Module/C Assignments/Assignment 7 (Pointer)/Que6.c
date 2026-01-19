//6. Write a C program to find the square and cube of a given number.(Without return type with parameter)

#include<stdio.h>
void square(int*);
void cube(int*);
void main()
{
	int a ;
    
	printf("Enter Any number :");	
	scanf("%d",&a);
	
     square(&a);
     cube(&a);
 

}

void square(int* a)
{
	int square= (*a)*(*a);	
   printf("Square is :%d",square);
	

}

void cube(int* a)
{
	int cube=(*a)*(*a)*(*a);
	printf("Cube is :%d",cube);
}
