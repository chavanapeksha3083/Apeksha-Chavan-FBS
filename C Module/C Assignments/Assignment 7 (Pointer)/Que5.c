//5. Write a C program to input five numbers and find their average.(without return type with parameter)

#include<stdio.h>
void avg(int*,int*,int*,int* ,int*);
void main ()
{
  int n1,n2,n3,n4,n5;
  printf("Enter five numbers :");
  scanf("%d%d%d%d%d",&n1,&n2,&n3,&n4,&n5);
  
 avg(&n1,&n2,&n3,&n4,&n5);
 
}

void avg(int* n1,int* n2,int* n3,int* n4,int* n5)
{
	 float average=(*n1+*n2+*n3+*n4+*n5)/5.0;
    printf("%f",average);
}
