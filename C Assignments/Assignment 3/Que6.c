
/*
6.Check the given number is Perfect number or not.
Input: n = 28
Output: Perfect
*/
#include<stdio.h>

void main()
{
	int n=28;
	int i=1;
	int sum=0;
	 while(n>i)
	 {
	 	
	 	if(n%i==0)
	 	{
	 	sum =sum+i; 	
		 }
	 
		i++;
		 
	 }
	 if(sum==n)
	 {
	 	printf("Perfect");
	 	
	 }
	 else
	 {
	 	printf("Not Perfect");
	 }
}