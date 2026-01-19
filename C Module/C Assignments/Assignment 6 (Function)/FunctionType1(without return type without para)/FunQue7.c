/*
7. Calculating total salary based on basic. If basic <=5000 da, ta and hra will be
10%,20% and 25% respectively otherwise da, ta and hra will be 15%,25% and 30%
respectively.

*/

#include<stdio.h>
void basicsalary();
void main()
{
	basicsalary();	
	
}

void basicsalary()
{
	double bs= 7000;
	 double da,ta,hra,ts;
	
	if(bs<=5000)
	{
		da =bs*0.10;
		ta=bs*0.20;
		hra=hra*0.25;
	}
	else{
		da =bs*0.15;
		ta=bs*0.25;
		hra=bs*0.30;
		
	}
	ts=bs+da+ta+hra;
	printf("Total Salary is :%f",ts);
	
}