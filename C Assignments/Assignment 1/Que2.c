// 2.Write a program to check given 3 digit number is pallindrome or not.

#include<stdio.h>

void main ()
{
	int num = 121;
/*
	int first,last;
	first = num%10;
	last = num/100;
	if(first==last)

*/
if(num%10 ==num/100)
	{
		printf("Number is palindrome");
		
	}
	else
	{
		printf("Number is not palindrome");
	}
}
