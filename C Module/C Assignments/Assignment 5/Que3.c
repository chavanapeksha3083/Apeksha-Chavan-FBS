/*
3. Print an inverted right-angled triangle pattern
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
	for (int i=5;i>=1;i--)
	{
		for(int j=1;j<=i;j++)
		{
			printf("*");
		}
		
		printf("\n");
	}
}