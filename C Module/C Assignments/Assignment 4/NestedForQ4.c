// 4. Print strong numbers in the given range 1 to n.

#include<stdio.h>


void main()
{
	
	for(int  j=1;j<=200;j++)
	{

	int n=j;
	int rem,sum=0;
	int temp=n;
	while(n>0)	
	{
		rem=n%10;
		int fact=1;
	
		int i=1;
		
		while(i<=rem)
		{
			fact=fact*i;
			i++;
		}
		sum =sum+fact;
		n=n/10;
	}
	
	if(sum==temp)
	
	{
		printf(" %d ",j);
	}
	
}
}
	
	