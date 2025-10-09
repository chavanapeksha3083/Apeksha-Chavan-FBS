/*
5. Accept the price from user. Ask the user if he is a student (user may say y or n). If he
is a student and he has purchased more than 500 than discount is 20% otherwise
discount is 10%.But if he is not a student then if he has purchased more than 600
discount is 15% otherwise there is not discount.
*/

#include<stdio.h>
void main()
{
double price=500,fprice,discount;
 char ch ='y';
if(ch=='y')	

{
	if(price>=500)
	{
		discount=price*0.20;
		fprice=price-discount;
			
	}
	
	else
	{
		discount=price*0.10;
		fprice=price-discount;
	}
}

else
{
	if(price>=600)
	{
		discount=price*0.15;
		fprice=price-discount;	
	}
	
	else
	{
		discount=0;
     fprice=price ;
	}	
}
   printf("Actual price is: %lf ,Final price is :%lf,Discount is:%lf",price,fprice,discount);
}