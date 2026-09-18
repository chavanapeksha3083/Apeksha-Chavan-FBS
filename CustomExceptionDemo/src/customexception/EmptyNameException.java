package customexception;

public class EmptyNameException extends Exception
{

	@Override
	public String toString() {
		return "You must enter the name/you can't leave name field empty";
	}
	
	

}
