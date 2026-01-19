// 4. Write a program to check whether a given character is a vowel or consonant.

#include<stdio.h>

char VowelConsonant(char);
void main()
{
	char ch;
	printf("Enter Character:");
	scanf("%c",&ch);
	
	char res=VowelConsonant(ch);
	if(res==1)
		printf("Character is Vowel");
    else
    	printf("Character is Consonant");
}

char VowelConsonant(char ch)
{
	if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
	{
	return 1;
	}
	else
	{
		return 0;
	}
}