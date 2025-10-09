/*
2. Accept three sides of a triangle from the user and determine whether the triangle is
equilateral, isosceles, or scalene.
*/
#include<stdio.h>

void main()
{
	int side1=2,side2=2,side3=2;
	
	
	if( side1==side2 && side2==side3)
	{
		printf("Triangle is Equilateral" );
	}
	else if(side1==side2 ||side2==side3 ||side1==side3)
	{
		printf("Triangle is Isoscales" );
	}
	else
	{
		printf("Triangle is Scalene" );
	}
	
	
}


