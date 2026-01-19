// 3. Print perfect numbers in the given range 1 to n.

#include<stdio.h>

void main()
{
	
	for(int j=1;j<=1000;j++)
	{
		
	
	int n=j;
	int sum =0;
	for(int i=1;i<n;i++)
	{
	 if(n%i==0)	
	 {
	   sum=sum+i;	
	 }
	 
	}
	
	if(sum==n)
	{
		printf(" %d ",j);
	}
	
}
}