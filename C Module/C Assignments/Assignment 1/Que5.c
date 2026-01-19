
// 5. Write a program to check whether a person is eligible to vote (age ≥ 18).

#include<stdio.h>
void isEligible();
void main()
{
	isEligible();
}
void isEligible()
{
	int age = 16;
	if(age>=18)
	{
		printf("Eligible for vote");
	}
	else
	{
		printf("Not Eligible");
	}
}
