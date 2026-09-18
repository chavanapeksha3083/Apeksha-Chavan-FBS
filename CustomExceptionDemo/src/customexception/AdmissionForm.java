package customexception;

public class AdmissionForm {
	String name;
	int age;
	double percentage;
	double feesPaid;
	double courseFees;

	

	AdmissionForm(String name, int age, double percentage, double feesPaid, double courseFees) {
		this.name = name;
		this.age = age;
		this.percentage = percentage;
		this.feesPaid = feesPaid;
		this.courseFees = courseFees;
	}



	public void validateForm() throws EmptyNameException,UnderageException,InvalidPercentageException,NotFitForAdmissionException,FeesNotPaidException,InsufficientFeesException  {
		// TODO Auto-generated method stub
		if(this.name == " ")
		{
			throw new EmptyNameException();
			
		}
		if(this.age<17)
		{
			throw new UnderageException();
			
		}
		if(this.percentage<0 ||this.percentage>100)
		{
			throw new InvalidPercentageException();
		}
		if(this.percentage<35)
		{
			throw new NotFitForAdmissionException();
		}
		if(feesPaid==0)
		{
			throw new FeesNotPaidException();
		}
		if(feesPaid<0.3*courseFees)
		{
			throw new InsufficientFeesException();
		}
		else
		System.out.println("Admission successful");
	}


}