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