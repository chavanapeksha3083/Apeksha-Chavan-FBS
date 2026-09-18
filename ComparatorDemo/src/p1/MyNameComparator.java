package p1;

import java.util.Comparator;

public class MyNameComparator implements Comparator
{

	@Override
	public int compare(Object o1, Object o2)
	{
		// TODO Auto-generated method stub
		
		Employee1 e1 = (Employee1)o1;// downcasting
		Employee1 e2 = (Employee1)o2;// downcasting
		return e1.name.compareTo(e2.name);
	}
	

}
