// 2. Print prime numbers in the given range 1 to n.

#include<stdio.h>

void main()
{
	for(int j=2;j<=100;j++)
	{
		
	int n=j;
	int flag=0;
	for(int i=2;i<=n/2;i++)
	{
		if(n%i==0)
		{
		 flag=1;
		 break;	
		}
		
	}
	if(flag==0)
	{
		printf(" %d ",j);
	}
	
}
	
}