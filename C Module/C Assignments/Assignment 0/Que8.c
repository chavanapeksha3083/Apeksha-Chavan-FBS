// 8. Write a C program to input the length and width of a rectangle and find its perimeter.
#include<stdio.h>

void main()
{
	int l;
	int b;
	int perimeter;
	int area;
	printf("Enter Length and Breadth of Rectangle:");

	scanf("%d %d",&l,&b);
	perimeter= 2*(l+b);
	area= l*b;
    printf("Perimeter is :%d",perimeter);
    printf("\nArea is :%d",area);

}
