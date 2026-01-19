// 7. Write a C program to convert given minutes into hours and remaining minutes.(without return type with para)

#include<stdio.h>
void hours(int);
void remminutes(int);

void main()
 {
	int min;
	printf("Enter Minutes:");
	scanf("%d",&min);

    hours(min);

     remminutes(min);

}

void hours(int min)
 {
	int hrs;
	hrs = min/60;
		printf("Hours are :%d",hrs);


}

void remminutes(int min)
 {
	int remmin ;
	remmin = min%60;
		printf("\nRemaining Minutes are :%d",remmin);

}