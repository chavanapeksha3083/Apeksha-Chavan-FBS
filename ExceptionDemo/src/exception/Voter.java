package exception;

public class Voter

{
	int age;

	public Voter(int age) {
		super();
		this.age = age;
	}
	
	
public void validateAge() throws InvalidAgeException
{
	if(this.age<18)
	{
	
			throw new InvalidAgeException();
		
	}
	
	else
	{
		System.out.println("You Can Vote");
	}
	
}

}
