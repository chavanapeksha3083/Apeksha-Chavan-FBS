package p2;
import p1.Employee;


		public class HR extends Employee
		{
		 
		  int commission;
		 

		public HR()

		{
		super();
		this.commission=4567;
		}
		public HR(int i,String n,double s,int c)
		{
			super(i,n,s);
		this.commission=c;
		}


		void setCommission(int c)
		{
		this.commission=c;
		}

		public void display()
		{
			super.display();
		 System.out.println("Commission is :"+this.commission);

		}



		}//class HR ends here


		




