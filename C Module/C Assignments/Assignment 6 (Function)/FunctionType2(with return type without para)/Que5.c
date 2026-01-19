//5. Write a C program to input five numbers and find their average.

#include<stdio.h>
float average();
void main ()
{
 float res=average();
 printf("%f",res);
}
float average()
{
  int num1,num2,num3,num4,num5;
  int avg;
  printf("Enter Five Numbers:");
  scanf("%d%d%d%d%d",&num1,&num2,&num3,&num4,&num5);
  avg=num1+num2+num3+num4+num5/5;
  return avg;
}
