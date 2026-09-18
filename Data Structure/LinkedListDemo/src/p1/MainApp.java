

package p1;

import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {

        MyLinkedList myLL = new MyLinkedList();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n1.Insert At Beginning");
            System.out.println("2.Insert At End");
            System.out.println("3.Insert At Position");
            System.out.println("4.Delete");
            System.out.println("5.Display");
            System.out.println("6.Display Reverse");
            System.out.println("7.Search");
            System.out.println("8.Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter number: ");
                    myLL.insertAtPos(sc.nextInt(), 1);
                    break;

                case 2:
                    System.out.print("Enter number: ");
                    myLL.insertAtEnd(sc.nextInt());
                    break;

                case 3:
                    System.out.print("Enter number: ");
                    int ele = sc.nextInt();
                    System.out.print("Enter position: ");
                    int pos = sc.nextInt();
                    myLL.insertAtPos(ele, pos);
                    break;

                case 4:
                    System.out.print("Enter position to delete: ");
                    myLL.delete(sc.nextInt());
                    break;

                case 5:
                    myLL.displayAll();
                    break;

                case 6:
                    myLL.displayReverse();
                    break;

                case 7:
                    System.out.print("Enter value to search: ");
                    myLL.search(sc.nextInt());
                    break;

                case 8:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 8);

        sc.close();
    }
}