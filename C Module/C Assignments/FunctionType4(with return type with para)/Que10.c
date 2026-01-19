/* 10. Write a C program to input marks of five subjects, find the total marks, and calculate
the percentage.*/

#include<stdio.h>
float total(int,int,int,int,int);   //function declaration
float per(int,int,int,int,int);
void main() {

	int eng,hindi,marathi,sci,math;
	printf("Enter marks of five subjects:");
	scanf("%d%d%d%d%d",&eng,&hindi,&marathi,&sci,&math);

	float res1 =total(eng,hindi,marathi,sci,math);  //function call
	printf("Total marks = %f",res1);

	float res2=per(eng,hindi,marathi,sci,math);
	printf("Percentage is  = %f",res2);
}

float total(int eng,int hindi,int marathi,int sci,int math)  //function defination
{
	float tot;
	tot=(eng+hindi+marathi+sci+math);
	return tot;
}

float per(int eng,int hindi,int marathi,int sci,int math)
 {
	float percentage;
	percentage=(eng+hindi+marathi+sci+math)/5.0;
	return percentage;
}


