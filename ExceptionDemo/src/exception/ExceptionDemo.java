package exception;

public class ExceptionDemo 
{
	public static void main(String[] args)
	{
		try
		{
			int a= Integer.parseInt(args[0]);
			int b= Integer.parseInt(args[1]);
			
			
			int c= a/b;
			
			System.out.println("Result: "+c);
		}
		
		catch(NumberFormatException nfe)
		{
			System.out.println("Please provides only numbers as input");
			
			
		}
		
		catch(ArrayIndexOutOfBoundsException aioo)
		{
			System.out.println("please provide minimum two arguments");
			
		}
		
		catch(ArithmeticException ae)
		{
			System.out.println("Don not provide second argument as 0");
		
			
		}
		
    catch(RuntimeException e)
		
		{
			
		System.out.println("If above any exception not occured");	
		}
		
		catch(Exception e)
		
		{
			
		System.out.println("Somethimg went to wrong");	
		}
		
	
		
		
		
	}
	

}
