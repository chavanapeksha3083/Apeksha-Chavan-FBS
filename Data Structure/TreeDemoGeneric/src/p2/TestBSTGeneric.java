package p2;

import java.util.Scanner;

public class TestBSTGeneric
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        BSTGeneric<Employee> obj = new BSTGeneric<>();

        int choice;

        do
        {
           
            System.out.println("1. Insert");
            System.out.println("2. Inorder");
            System.out.println("3. Preorder");
            System.out.println("4. Postorder");
            System.out.println("5. Delete");
            System.out.println("6. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch(choice)
            {
                case 1:
                    System.out.print("Enter id: ");
                    int id = sc.nextInt();

                    System.out.print("Enter name: ");
                    String name = sc.next();

                    System.out.print("Enter salary: ");
                    double sal = sc.nextDouble();

                    Employee e = new Employee(id, name, sal);
                    obj.insert(e);
                    break;

                case 2:
                    obj.displayIn();
                    break;

                case 3:
                    obj.displayPre();
                    break;

                case 4:
                    obj.displayPost();
                    break;

                case 5:
                    System.out.print("Enter id to delete: ");
                    int delId = sc.nextInt();

                   
                    Employee delEmp = new Employee(delId, "", 0);
                    obj.deleteNode(delEmp);
                    break;

                case 6:
                    System.out.println("Exit...");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while(choice != 6);

       
    }
}
