package p2;

import java.util.TreeMap;

class Player
{
	int jersyNumber;
	String name;
	int run;
	
	
	
	public Player(int jersyNumber, String name, int run) {
		super();
		this.jersyNumber = jersyNumber;
		this.name = name;
		this.run = run;
	}



	@Override
	public String toString() {
		return "Player [jersyNumber=" + jersyNumber + ", name=" + name + ", run=" + run + "]";
	}
	


}


public class TestPlayer
{
	public static void main(String[] args)
	{
		
	TreeMap<MyKey, Player> tm = new TreeMap<MyKey, Player>();
	tm.put(new MyKey(111),new Player(10,"Rohit",100));
	tm.put(new MyKey(101),new Player(7, "Dhoni",99));
	tm.put(new MyKey(16),new Player(18, "Virat",98));
	System.out.println(tm);
	}

	
}
