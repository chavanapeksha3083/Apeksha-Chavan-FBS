package p1;

import java.util.Scanner;

public class TestLinkedListBubbleSort {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        LinkedListDemo<Employee> list = new LinkedListDemo<>();

        int choice;

        do {
           
            System.out.println("1. Insert Employee");
            System.out.println("2. Display Employees ");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Salary: ");
                    double salary = sc.nextDouble();

                    Employee emp = new Employee(id, name, salary);

                    // Sorted Insert
                    list.insert(emp);

                    System.out.println("Employee inseted Successfully");
                    break;

                    
                case 2:
                    list.bubbleSort();   
                    System.out.println("\nEmployees (Sorted):");
                    list.display();
                    break;

              
                case 3:
                    System.out.println("Exit");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        } while (choice != 3);

        
    }
}
