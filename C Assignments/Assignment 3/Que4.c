/*Check the given number is prime or not.
Input: n = 7
Output: Prime
*/

#include<stdio.h>

	void main()
	{
		int n=7;
		int i=2,flag=0;
		
		while(i<n)
		{
			if(n%i==0)
			{
				flag=1;
			    break;
			}
			i++;
			
		}
		if(flag==0)
		{
			printf("Number is Prime");
		}
		else{
				printf("Number is not Prime");
		}
	}
