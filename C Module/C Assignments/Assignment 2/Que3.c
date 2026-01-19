/*
3. Write a program to find greatest of three numbers using nested if-else.
*/
# include<stdio.h>
void main()
{
	int n1=100;
	int n2=50;
	int n3=30;
	
	if(n1>n2 && n1>n3)
	{
		printf("Number1 is greater");
		
	}
	else
	{
		if(n2>n3 && n2>n1)
		{
			printf("Number2 is greater");
		}
		else
		{
			if(n3>n1 && n3>n2)
			{
				printf("Number3 is greater");
			}
		
		}
	}
}


/*

void main()
{
	int a=10,b=100,c=30;
	
	if(a>b)
	{
		if(a>c)
		{
	    	printf("a is greater");	
		}
		else
		{
			printf("c is greater");
		}
		
	}
	else
	{
		if(b>c)
		{
			printf("b is greater");	
		}
		else
		{
				printf("c is greater");
		}
	}
}

*/
