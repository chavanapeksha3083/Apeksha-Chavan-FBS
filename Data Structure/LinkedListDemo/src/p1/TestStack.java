package p1;

import java.util.Scanner;

public class TestStack 
{
	public static void main(String[] args) {
		Stack st = new Stack();
		Scanner sc = new Scanner(System.in);
		int choice;
		do
		{
			
			System.out.println("\n1.Push");
			System.out.println("\n2.Pop");
			System.out.println("\n3.Display");
			System.out.println("\n4.Exit");
			System.out.println("Enter choice:");
			
			choice = sc.nextInt();
			switch(choice)
			{
			
			case 1:
				
				System.out.println("Enter Element:");
				int num=sc.nextInt();
				st.push(num);
				break;
				
			case 2: 
				st.pop();
				break;
				
			case 3 :
				st.display();
				break;
				
			case 4 :
				System.out.println("Program End");
				break;
			
				default  :
					System.out.println("Invalid");
		}
		
		}while(choice!=4);
		
		
	}

}
