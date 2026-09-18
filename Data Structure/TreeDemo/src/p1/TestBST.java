package p1;

import java.util.Scanner;

public class TestBST
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        BST obj = new BST();

        int choice;

        do
        {
            System.out.println("1. Insert");
            System.out.println("2. Inorder");
            System.out.println("3. Preorder");
            System.out.println("4. Postorder");
            System.out.println("5. Display All");
            System.out.println("6. Delete");     
            System.out.println("7. Exit");    

            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch(choice)
            {
                case 1:
                    System.out.print("Enter element for insert: ");
                    int ele = sc.nextInt();
                    obj.insert(ele);
                    break;

                case 2:
                    obj.displayIn();
                    System.out.println();
                    break;

                case 3:
                    obj.displayPre();
                    System.out.println();
                    break;

                case 4:
                    obj.displayPost();
                    System.out.println();
                    break;

                case 5:
                    obj.displayAll();
                    break;

                case 6:  
                    System.out.print("Enter element to delete: ");
                    int del = sc.nextInt();
                    obj.deleteNode(del);
                    System.out.println("Deleted ");
                    break;

                case 7:
                    System.out.println("Exit");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        } while(choice != 7);

       
    }
}
