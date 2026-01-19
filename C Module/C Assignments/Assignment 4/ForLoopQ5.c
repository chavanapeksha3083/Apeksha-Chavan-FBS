/*Check the given number is Armstrong number or not..
Input: n = 153
Output: Armstrong
*/
#include<stdio.h>
void main()
{   
	int n= 153;
	int temp=n;
	int rem;
	int sum =0;
	for(int i=0;n>0;i++) 
	{
		rem=n%10;
		sum=sum+rem*rem*rem;
		n=n/10;
		
	}
	
	if(sum==temp)
	{
		printf("Armstrong");
	}
	else
	{
		printf("Not Armstrong");
	}

}
