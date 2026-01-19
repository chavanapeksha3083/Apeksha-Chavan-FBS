/* Find Sum of first and last digit of given number.
Input: n = 12345
Output: 6 (1 + 5)
*/


#include<stdio.h>
void main()
{
	int n=12345;
	int ld=n%10;
	int sum=0;
	for(;n>10;)
	{
		n=n/10;
		sum=n+ld;
		
	}
	printf("%d",sum);
}
