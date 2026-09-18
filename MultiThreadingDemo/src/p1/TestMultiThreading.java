package p1;



class Worker extends Thread
{
	
	public void run()
	{
		String numstr= "123456789012753789763789954";
		
		for(int i=0;i<numstr.length();i++)
		{
			
			System.out.print(numstr.charAt(i));
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
}

public class TestMultiThreading
{
	
	public static void main(String[] args)
	{
		
		Worker w1 =new Worker();
		w1.start();
		String alfstr= "abcdefghijklmn";
		for(int i=0;i<alfstr.length();i++)
		{
			
			System.out.print(alfstr.charAt(i));
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
		
		
	}

}
