/*
Print last 2 digit of number.
E.g  i/p - 223410
o/p - 10
*/

#include<stdio.h>

	void main()
	{
		int num=223410;
		int ld;
		
		ld =num%100;
		
		printf("%d",ld);
	}


/*
#include<stdio.h>

	void main()
	{
		int num=223410;
		int r1,r2,q1;
		
		r1=num%10;
		q1=num/10;
		r2=q1%10;
		
		printf("%d%d",r2,r1);
	}
*/