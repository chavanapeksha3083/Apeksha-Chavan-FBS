/*Check the given number is prime or not.
Input: n = 7
Output: Prime
*/

#include<stdio.h>

	void main()
	{
		int n=7;
		int flag=0;
		
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				flag=1;
			    break;
			}
			
		}
		if(flag==0)
		{
			printf("Number is Prime");
		}
		else{
				printf("Number is not Prime");
		}
	}
