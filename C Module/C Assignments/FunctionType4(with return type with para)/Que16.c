// 6. Write a program to check whether a given character is uppercase or lowercase.

#include<stdio.h>
char UpperLower(char);
void main() {

	char ch ;
	printf("Enter character:");
    scanf("%c",&ch);
    
   char res= UpperLower(ch);
   if(res==1)
     printf("Character is Uppercase");
  else
    printf("Character is LowerCase");
}

char UpperLower(char ch)
{
		if(ch>='A'&& ch<='Z')
	 {
		return 1;
	} 
	else 
	{
		return 0;
	}
}