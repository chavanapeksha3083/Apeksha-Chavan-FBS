/*

5. Write a menu driven program to take a number for user and perform operations as follows.

Press 1.To check number is even or odd.
2.To check number is prime or not.
3.To check number is pallindrome or not.
4.To check number is positive, negative or zero.
5.To reverse a number.
6.To find sum of digits.

*/

#include<stdio.h>

void main()
{
	
	int num,flag,rev,rem,temp,sum;
	int choice;
	
	printf("Enter Number:");
	scanf("%d",&num);
	
	 printf("\n1. Check Even or Odd");
	printf("\n2. check number is prime or not");
		printf("\n3. check number is pallindrome or not.");
			printf("\n4. check number is positive, negative or zero.");
				printf("\n5. reverse a number.");
					printf("\n6. find sum of digits..");
	printf("\nEnter Choice:");
	scanf("%d",&choice);
	
	switch(choice)
	{
		
		case 1:
			
			if(num%2==0)
			  {
			  	printf("Even");
			  }
			  
			else
			{
				printf("Odd");
			}
		
		break;
		
		
		case 2:
			
           flag=0;
			for(int i=2;i<=num/2;i++)
			{
				if(num%i==0)
				{
					flag=1;
					break;
				}
				
			}
			if(flag==0)
			{
			printf("Prime")	;
			}
			else
			{
				printf("Not Prime");
			}
			
			break;
			
			case 3:
				
			rev=0;
	        temp=num;
    	for(;num>0;)
	{
	  rem= num%10;
	  rev=rev*10+rem;
	  num=num/10;
	}
	
	if(temp==rev)
	{
		printf("Palindrome");
	}
	else
	{
		printf("Not Palindrome");
	}
		
	
	break;
	
	case 4:
		
		if(num>0)
		{
			printf("Positive");
		}
		else if(num==0)
		{
			printf("Neutral");
		}
		else
		{
			printf("Negative");
		}
		
		break;
		
	case 5:
				
			rev=0;
	        temp=num;
    	for(;num>0;)
	{
	  rem= num%10;
	  rev=rev*10+rem;
	  num=num/10;
	}
	
		printf("Reversed  Number is: %d",rev);

	break;
	
	case 6:
		num;
		sum=0;
		for(;num>0;)
	{
	  rem= num%10;
	  sum=sum+rem;
	  num=num/10;
	}
		printf("Sum of digit is:%d",sum);
		break;
			
}

}