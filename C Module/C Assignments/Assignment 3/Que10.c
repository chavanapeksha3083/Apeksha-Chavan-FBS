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
	while(n>10)
	{
		n=n/10;
		sum=n+ld;
		
	}
	printf("%d",sum);
}

/*
#include<stdio.h>
void main()
{
int n=12345;
int fd,ld;
 ld=n%10;
 int sum=0;
 while(n>0)
 {
 fd=n%10;
 n=n/10;
 sum=fd+ld;
 }
 
 printf("%d",sum);


}

*/

