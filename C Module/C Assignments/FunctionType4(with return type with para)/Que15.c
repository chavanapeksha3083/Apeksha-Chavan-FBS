
// 5. Write a program to check whether a person is eligible to vote (age = 18).

#include<stdio.h>
int	isEligible(int);
void main()
{
	int age;
	printf("Enter age:");
	scanf("%d",&age);
	
int	res=isEligible(age);
if(res==1)
   printf("Eligible for vote");
else
   printf("Not Eligible for vote");
	
}
int	isEligible(int age)
	{
		if(age>=18)
	{
		return 1;
	}
	else
	{
		return 0;
	 }	
}

