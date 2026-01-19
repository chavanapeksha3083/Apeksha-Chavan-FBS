// 2.Write a program to check given 3 digit number is pallindrome or not.

#include<stdio.h>
int palindrome(int);
void main ()
{
	int num ;
	printf("Enter Number");
	scanf("%d",&num);
	
	int res=palindrome(num);
	if(res==1)
	printf("Number is palindrome");
	else
	printf("Number is not palindrome");
}
/*
	int first,last;
	first = num%10;
	last = num/100;
	if(first==last)

*/
int palindrome(int num)
{
if(num%10 ==num/100)
	{
		return 1;
		
	}
	else
	{
		return 0;
	}	
}


