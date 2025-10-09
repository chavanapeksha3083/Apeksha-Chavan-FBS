//WAP to check if the year is leap or not

# include<stdio.h>
void main()

{
	int year=2003;
	if(year%4==0 &&year%100!=0 ||year%400==0)
	{
		printf("Leap Year");
	}
	else
	{
		printf(" Not Leap Year");
	}
}