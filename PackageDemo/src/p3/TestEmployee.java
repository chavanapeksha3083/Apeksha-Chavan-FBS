package p3;
import p1.Employee;
import p2.HR;
import p2.Admin;
import p2.SalesManager;
public class TestEmployee
{
	
	

		public static void main(String[] args) {
			
		
		
		Employee e1 = new Employee(101,"Apeksha",20000);
		
		HR h1 = new HR(102,"Priya",23000,45);
		SalesManager sm1 = new SalesManager(103,"Sakshi",25000,23,56);
		Admin a1 = new Admin(108,"Aditi",30000,50);
		
		e1.display();
		h1.display();
		sm1.display();
		a1.display();
		}
		
	}
	


