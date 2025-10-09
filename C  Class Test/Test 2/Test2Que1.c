/* WAP to calculate electricity bill.
For 1-50 units- 30rs/unit ,For 51-150 units -40 rs/unit ,For 151 and above units-50 rs/unit.
*/

 #include<stdio.h>

void main()
{
	int unit =58;
	int bill=0;
	if(unit>0 && unit<=50)
	{
	    bill= 30*50; 
		
	}
	else if(unit>50 && unit<=150)
	{
		bill=30*50 + 40*100;
	}
	else
	{
		bill=30*50 + 40*100+50*6;
	}
	
	printf("Total Electricity Bill is :%d Rs ",bill);
	
}
