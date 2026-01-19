/* 10. Write a C program to input marks of five subjects, find the total marks, and calculate
the percentage.*/

#include<stdio.h>
void total(int*,int*,int*,int*,int*);   //function declaration
void per(int*,int*,int*,int*,int*);
void main() {

	int eng,hindi,marathi,sci,math;
	printf("Enter marks of five subjects:");
	scanf("%d%d%d%d%d",&eng,&hindi,&marathi,&sci,&math);

	total(&eng,&hindi,&marathi,&sci,&math);  //function call
	

	per(&eng,&hindi,&marathi,&sci,&math);
	
}

void total(int* eng,int* hindi,int* marathi,int* sci,int* math)  //function defination
{
	float tot;
	tot=(*eng+*hindi+*marathi+*sci+*math);
	printf("Total Marks  = %f",tot);
}

void per(int* eng,int* hindi,int* marathi,int* sci,int* math)
 {
	float percentage;
	percentage=(*eng+*hindi+*marathi+*sci+*math)/5.0;
	printf("Percentage is = %f",percentage);
}


