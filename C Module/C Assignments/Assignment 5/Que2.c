/*
2. Print a right-angled triangle pattern
Input: n = 5
Output:
*
**
***
****
*****

*/
#include<stdio.h>
void main()
{
	for(int i=1;i<=5;i++)
	{
		for(int j=1;j<=i;j++)
		{
			printf("* ");
		}
		printf("\n");
	}
}