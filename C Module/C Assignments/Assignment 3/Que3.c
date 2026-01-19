/*Sum of numbers in given range.
Find sum of numbers from start to end.
Input: start = 1, end = 5 */

#include<stdio.h>
 void main()
 {
 	int start=1,sum=0;
 	while(start<=5)
 	{
 		sum= sum+start;
 		
 		start++;
	 }
	 printf("%d",sum);
 }