import java.util.Scanner;

  class TestCircularQueue
  {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter queue size: ");
        int size = sc.nextInt();

        Queue q = new Queue(size);

        int choice, ele;

        do {
            System.out.println("\n MENU");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Display");
            
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter element: ");
                    ele = sc.nextInt();
                    q.enqueue(ele);
                    break;

                case 2:
                    ele = q.dequeue();
                    if (ele != -1)
                        System.out.println("Deleted: " + ele);
                    break;

                case 3:
                    q.display();
                    break;

                case 4:
                    System.out.println("Exit");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        } while (choice != 4);

        
    }
}