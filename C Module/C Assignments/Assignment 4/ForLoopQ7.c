/*Find factorial of given number.
Input: n = 5
Output: 120
*/

#include<stdio.h>

void main()

{
	int n=5;
	int fact=1;
	
  for(int i=1;i<=5;i++)
  {
  	fact=fact*i;
  	
  }
  printf("%d",fact);
}