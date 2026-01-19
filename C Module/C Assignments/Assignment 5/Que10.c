/*
10. Print a hollow square with diagonal pattern
Input: n = 5
Output:

* * * * *
* *     *
*   *   *
*     * *
* * * * *
*/

#include<stdio.h>
void main()
{
	for(int i=1;i<=5;i++)
	{
		for(int j=1;j<=5;j++)
		{
			if(i==1||j==1||i==5||j==5||i==j)
			{
				printf("*");
			}
			else
			{
				printf(" ");
			}
			
		}
		printf("\n");
	}
}