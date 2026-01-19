/*
5. Print an inverted pyramid pattern
Input: n = 5
Output:

*****
****
***
**
*
*/

#include<stdio.h>
void main()
{
	for(int i=5;i>=1;i--)
	{
		for(int j=1;j<=5-i;j++)
		
		{	
			printf("  ");
		}
		for(int k=1;k<=i;k++)
			{
				printf(" *  ");
			}
			printf("\n");
		
	}
}

