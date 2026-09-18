import java.util.Scanner;

class TesttEditor {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        TextEditor editor = new TextEditor();

        int choice;

        do {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Write a line");
            System.out.println("2. Undo last line");
            System.out.println("3. Display current text");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter line: ");
                    String line = sc.nextLine();
                    editor.writeLine(line);
                    break;

                case 2:
                    editor.undoLine();
                    break;

                case 3:
                    editor.displayText();
                    break;

                case 4:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 4);

    }
}
