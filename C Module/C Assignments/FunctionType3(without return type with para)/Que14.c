// 4. Write a program to check whether a given character is a vowel or consonant.

#include<stdio.h>

void VowelConsonant(char);
void main()
{
	char ch;
	printf("Enter Character:");
	scanf("%c",&ch);
	
    VowelConsonant(ch);
	
}

void VowelConsonant(char ch)
{
	if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
		printf("Character is Vowel");
    else
    	printf("Character is Consonant");
}