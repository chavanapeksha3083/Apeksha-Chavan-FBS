
// 5. Write a program to check whether a person is eligible to vote (age = 18).

#include<stdio.h>
void isEligible(int);
void main()
{
	int age;
	printf("Enter age:");
	scanf("%d",&age);
	
isEligible(age);
	
}
void isEligible(int age)
	{
		if(age>=18)
          printf("Eligible for vote");
      else
       printf("Not Eligible for vote");
}

