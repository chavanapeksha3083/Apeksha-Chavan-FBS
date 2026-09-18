package p2;

import java.util.Scanner;
public class TestBubbleSortLL

{
	
	



	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);
	       BubbleSortLL list = new BubbleSortLL();

	        System.out.print("Enter number of elements: ");
	        int n = sc.nextInt();

	        for (int i = 0; i < n; i++) {
	            System.out.print("Enter element " + (i + 1) + ": ");
	            int value = sc.nextInt();
	            list.insert(value);
	        }

	        System.out.println("\nBefore Sorting:");
	        list.display();

	        list.bubbleSort();

	        System.out.println("\nAfter Sorting:");
	        list.display();

	        sc.close();
	    
	}


}
