
//1. Print armstrong numbers in the given range 1 to n.
#include<stdio.h>

void main()
{
	
	for(int j=1;j<=1000;j++)
	{	
	int n=j,rem,sum=0;
	int temp=n;
	for(int i=1;n>0;i++)
	
	{
	  rem = n%10; 
	  sum=sum+rem*rem*rem; 
	  n=n/10;     
	  	
	}
	
	
	if(sum==temp)
	{
		printf(" %d ",j);
	}
	
}
}

	

