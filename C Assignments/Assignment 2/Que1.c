/*
1. Accept two numbers from user and an operator (+,-,/,*,%) based on that perform the
desired operations.
*/


#include<stdio.h>

void main()
 {
	int a=3;
	int num1=5,num2=10;
	int c;
	
	if(a==1)
	{
		c=num1+num2;
		printf("\n Addition is :%d",c);
	}
	else if(a==2)

	{ 
		c=num1-num2;
		printf("\n Subtraction is: %d",c);
	}
	else if(a==3)
	{
		c=num1*num2;
		printf("\n Multiplication is :%d",c);
	}
	 
	else if(a==4)
	 {
		c=num1/num2;
		printf("\n Division is:%d",c);
	} 

	else if(a==5)
	 {
		c=num1%num2;
		printf("Remainder is :%d",c);
	}
	else
	{
		printf("Invalid");
	} 

    



}
                               