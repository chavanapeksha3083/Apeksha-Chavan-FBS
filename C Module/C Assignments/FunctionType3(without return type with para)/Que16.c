// 6. Write a program to check whether a given character is uppercase or lowercase.

#include<stdio.h>
void UpperLower(char);
void main() {

	char ch ;
	printf("Enter character:");
    scanf("%c",&ch);
    
   UpperLower(ch);
   
}

void UpperLower(char ch)
{
		if(ch>='A'&& ch<='Z')
	 {
		 printf("Character is Uppercase");
	} 
	else 
	{
		printf("Character is LowerCase");
	}
}