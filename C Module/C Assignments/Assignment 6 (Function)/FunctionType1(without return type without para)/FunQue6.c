// 6. Write a program to check whether a given character is uppercase or lowercase.

#include<stdio.h>
void UpperLower();
void main() 
{

UpperLower();
	
}

void UpperLower()
{
	char ch ='c';

	if(ch>='A'&& ch<='Z')
	 {
		printf("Character is Uppercase");
	} 
	else 
	{
		printf("Character is Lowercase");
	}
}