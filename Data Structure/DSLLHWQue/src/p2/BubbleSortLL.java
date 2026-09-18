package p2;

public class BubbleSortLL {

    Node head;

    // Insert at end
    public void insert(int data) {

        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node curr = head;

        while (curr.next != null) {
            curr = curr.next;
        }

        curr.next = newNode;
    }

    // 🔥 Bubble Sort
    public void bubbleSort() {

        if (head == null || head.next == null)
            return;

        boolean swapped;

        do {
            swapped = false;
            Node curr = head;

            while (curr.next != null) {

                if (curr.data > curr.next.data) {

                    // swap data
                    int t = curr.data;
                    curr.data = curr.next.data;
                    curr.next.data = t;

                    swapped = true;
                }

                curr = curr.next;
            }

        } while (swapped);
    }

    // Display
    public void display() {

        Node curr = head;

        while (curr != null) {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }

        System.out.println("null");
    }
}
