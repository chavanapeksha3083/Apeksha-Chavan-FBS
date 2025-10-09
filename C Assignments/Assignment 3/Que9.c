/*
Check the given number is Palindrome number or not.
Input: n = 121
Output: Palindrome
*/

#include<stdio.h>
void main()
{
	
	int n=121,rem,rev=0;
	int temp=n;
	while(n>0)
	{
	  rem= n%10;
	  rev=rev*10+rem;
	  n=n/10;
	}
	
	if(temp==rev)
	{
		printf("Palindrome");
	}
	else
	{
		printf("Not Palindrome");
	}
	
}