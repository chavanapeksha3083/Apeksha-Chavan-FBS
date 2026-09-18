package p1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class TestEmployee
{
	public static void main(String[] args)
	{ 
		Employee1 e1 = new Employee1(105,"Apeksha",50000);
		Employee1 e2 = new Employee1(101,"Sanika",7000);
		Employee1 e3 = new Employee1(108,"Anushka",6000);
		Employee1 e4 = new Employee1(102,"Priya",40000);
		Employee1 e5 = new Employee1(109,"Nikita",13000);
		
		ArrayList<Employee1> l1 = new ArrayList<Employee1>();
		
		l1.add(e1);
		l1.add(e2);
		l1.add(e3);
		l1.add(e4);
		l1.add(e5);
		System.out.println(l1);
		
		//MyIdComparator midc = new MyIdComparator();
		
	//	MyNameComparator mnc= new MyNameComparator();
		
		//MySalaryComparator msc = new MySalaryComparator();
		
		Scanner sc = new Scanner(System.in);
	
		int choice;
		do
		{
			
			System.out.println("1.Sort By ID");
			
			System.out.println("2.Sort By Name");
			System.out.println("3.Sort By Salary");
			System.out.print("Enter your choice: ");
			
			choice = sc.nextInt();

	        switch (choice) {

	            case 1:
	                 	MyIdComparator midc = new MyIdComparator();
	            	    Collections.sort(l1,midc);
	            	
	            	//Collections.sort(l1,new MyIdComparator());
	            	
	            	System.out.println(l1);
	            	break;
	            	
	            	
	            case 2:
	            	MyNameComparator mnc= new MyNameComparator();
	            	Collections.sort(l1,mnc);
	            	System.out.println(l1);
	            	break;
	            	
	            case 3:
	            	MySalaryComparator msc = new MySalaryComparator();
	            	Collections.sort(l1,msc);
	            	System.out.println(l1);
	            	break;
	            	
	           default:
	        	   System.out.println("Invalid choice");
	            	
	        
	            	
	            
		
		}
		
	 } while (choice != 4);
		
		
            	
		
		
	}

}

