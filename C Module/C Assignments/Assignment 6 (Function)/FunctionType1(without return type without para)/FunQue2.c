#include<stdio.h>
void palindrome();
void main ()
{
 palindrome();
}
void palindrome()
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