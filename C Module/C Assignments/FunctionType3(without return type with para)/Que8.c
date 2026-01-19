
// 8. Write a C program to input the length and width of a rectangle and find its perimeter.
#include<stdio.h>

void area(int,int);
void peri(int ,int);
void main()
{
	int l,b;
	
	printf("Enter Length and Breadth of Rectangle:");
	scanf("%d %d",&l,&b);

    area(l,b);
    peri(l,b);
 
    
}

void area(int l,int b)
{
int	area= l*b;
   printf("Area is :%d",area);
}

void peri(int l,int b)
{
int	perimeter= 2*(l+b);
    printf("\nPerimeter is :%d",perimeter);
}




