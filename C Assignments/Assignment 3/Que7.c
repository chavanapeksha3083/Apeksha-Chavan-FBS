/*Find factorial of given number.
Input: n = 5
Output: 120
*/

#include<stdio.h>

void main()

{
	int n=5;
	int fact=1,i=1;
	
  while(i<=5)
  {
  	fact=fact*i;
  	i++;
  	
  }
  printf("%d",fact);
}