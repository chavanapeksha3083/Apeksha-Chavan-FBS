package treeset;

import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args)
	{
		
		TreeSet t1 = new TreeSet();
		t1.add(10);
		t1.add(20);
		t1.add(30);
		System.out.println(t1);
		//for(int i=0;i<L1.size();i++)
		//{
			//System.out.println(L1.get(i));
		//}
			for(Object o : t1)
			{
				System.out.println(o);
			}
	}

}