/* 10. Write a C program to input marks of five subjects, find the total marks, and calculate
the percentage.*/

#include<stdio.h>
void main()
{
	
	int eng=88;
	int hindi=85;
	int marathi=84;
	int sci=70;
	int math=90;
	
    int total;
    float per;
    
    
    total = eng + hindi+marathi+sci+math;
    per= total/5.0;
    
    printf("Total marks is :%d",total);
    printf("\n Percentage is :%2f",per);



}