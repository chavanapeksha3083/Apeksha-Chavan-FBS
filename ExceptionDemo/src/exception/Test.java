package exception;

public class Test
{
	
public static void main(String[] args)
{
	Voter v1 = new Voter(32);
	
	try
	{
		v1.validateAge();
	}
	
	catch(InvalidAgeException ae)
	{
		System.out.println(ae);
	}
	
}

}
