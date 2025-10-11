/*Conver the time entered in hh,min and sec into total seconds.*/


#include<stdio.h>

	void main()
	{
		
     int hh,min,sec,totalsec;
     
     printf("Ener Hours");
     scanf("%d",&hh);
     
     
     printf("Ener Minuits");
     scanf("%d",&min);
     
     
     printf("Ener Seconds");
     scanf("%d",&sec);
     
     totalsec=hh*3600+min*60+sec;          // 1hrs=3600seconds and 1min=60seconds and  1sec=1second
     printf("Total Seconds are :%d",totalsec);
	 
	}
	

