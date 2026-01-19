// 4. Write a program to check whether a given character is a vowel or consonant.

#include<stdio.h>
void VowelConsonant();
void main()
{
	VowelConsonant();
}
void VowelConsonant()
{
	char ch= 'a';
	
	if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
	{
		printf("Character is Vowel");
	}
	else
	{
		printf("Character is Consonant");
	}
}