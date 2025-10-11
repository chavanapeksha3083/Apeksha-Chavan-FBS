
/* 2.WAP to add alternate numbers from given range .
e.g - i/p : start=1, end=5
o/p : sum=9

*/

#include<stdio.h>
void main()
{  
  //  int start=1,end=5;
	int sum=0;
	for(int k=1;k<=5;k+=2)
	{
	
      sum=sum+k;
      
	}
	printf("sum is = %d",sum);
}


/*
#include<stdio.h>

void main()
{
	int sum=0;
	for(int k=1;k<=5;k++)
	{
	int n=k;

    if(n%2!=0 )
    {
      	sum=sum+k;
	}
}
printf("sum is = %d",sum);

}
*/


