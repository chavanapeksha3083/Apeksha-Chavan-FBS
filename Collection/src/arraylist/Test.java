package arraylist;

import java.util.List;
import java.util.LinkedList;

public class Test {
	public static void main(String[] args)
	{
		//ArrayList L1;
	
		List <Integer> L1;
		L1 = new LinkedList<Integer>();
		
		//L1 = new ArrayList();
	    //L1 = new LinkedList();
		//L1.add("FirstBit");
		
		L1.add(10);
		L1.add(30);
		L1.add(20);
		System.out.println(L1);
		for(int i=0;i<L1.size();i++)
		{
			System.out.println(L1.get(i));
		}
		for(Integer i   : L1)
		{
			System.out.println(i);
		}
		if(L1.contains(220))
		{
			System.out.println("FirstBit");
		}
		else
		{
			System.out.println("Not Found");
		}
	}

}