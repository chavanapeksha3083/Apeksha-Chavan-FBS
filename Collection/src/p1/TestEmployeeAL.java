
package p1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class TestEmployeeAL
{
	


	public static void main(String[] args)
	{
		
		EmployeeDemo e1 = new EmployeeDemo(105,"Apeksha",50000);
		EmployeeDemo e2 = new EmployeeDemo(101,"Sanika",7000);
		EmployeeDemo e3 = new EmployeeDemo(108,"Anushka",6000);
		EmployeeDemo e4 = new EmployeeDemo(102,"Priya",40000);
		EmployeeDemo e5 = new EmployeeDemo(109,"Nikita",13000);
		
		ArrayList<EmployeeDemo> l1 = new ArrayList<EmployeeDemo>();
		
		l1.add(e1);
		l1.add(e2);
		l1.add(e3);
		l1.add(e4);
		l1.add(e5);
		
		System.out.println("Before Sorting");
		System.out.println(l1);
		
		System.out.println("After Sorting");
		Collections.sort(l1);
		System.out.println(l1);
		
	}
	
	

	public static void main1(String[] args)
	{
		
		EmployeeDemo e1 = new EmployeeDemo(105,"Apeksha",50000);
		EmployeeDemo e2 = new EmployeeDemo(101,"Sanika",7000);
		EmployeeDemo e3 = new EmployeeDemo(108,"Anushka",6000);
		EmployeeDemo e4 = new EmployeeDemo(102,"Priya",40000);
		EmployeeDemo e5 = new EmployeeDemo(109,"Nikita",13000);
		
		HashSet<EmployeeDemo> hs = new HashSet<EmployeeDemo>();
		
		hs.add(e1);
		hs.add(e2);
		hs.add(e3);
		hs.add(e4);
		hs.add(e5);
		
		System.out.println("Before Sorting");
		System.out.println(hs);
		
		 ArrayList<EmployeeDemo> al = new ArrayList<>(hs);
		    Collections.sort(al); 
		    
		    System.out.println("After Sorting");
		    System.out.println(al);
		    
		//System.out.println("After Sorting");
		//Collections.sort(hs);
		//System.out.println(hs);
		
		
		
	}

}
