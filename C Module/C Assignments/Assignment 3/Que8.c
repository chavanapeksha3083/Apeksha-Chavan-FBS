/* 8.Check the given number is Strong number or not.
Input: n = 145
Output: Strong
*/
#include<stdio.h>
void main() 
{
	int n=145;
	int sum=0;
	int rem;
	int temp=n;
	while(n>0)
	 {
		rem=n%10;
		int fact=1;
		int i=1;
		while(i<=rem)
		 {
			fact =fact*i;
			i++;
		}
		sum=sum+fact;
		n=n/10;

	}
	if(sum==temp)

	{
		printf("Strong");

	} else {
		printf("Not Strong");
	}
}