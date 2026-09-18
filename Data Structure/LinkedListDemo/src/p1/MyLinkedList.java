package p1;

public class MyLinkedList {

    Node start;
    int length;

    public MyLinkedList() {
        start = null;
        length = 0;
    }

  
    public void insertAtEnd(int ele) {
        Node temp = new Node(ele);

        if (start == null) {
            start = temp;
        } else {
            Node itr = start;
            while (itr.next != null)
                itr = itr.next;
            itr.next = temp;
        }
        length++;
    }

    
    public void insertAtPos(int ele, int pos) {
        Node x = new Node(ele);

        if (pos < 1 || pos > length + 1) {
            System.out.println("Invalid position");
            return;
        }

        if (pos == 1) {
            x.next = start;
            start = x;
        } else {
            Node p = start;
            for (int i = 1; i < pos - 1; i++)
                p = p.next;

            x.next = p.next;
            p.next = x;
        }
        length++;
    }

    
    public void delete(int pos) {
        if (start == null) {
            System.out.println("Empty list");
            return;
        }

        if (pos < 1 || pos > length) {
            System.out.println("Invalid position");
            return;
        }

        if (pos == 1) {
            start = start.next;
        } else {
            Node p = start;
            for (int i = 1; i < pos - 1; i++)
                p = p.next;

            p.next = p.next.next;
        }
        length--;
    }

    
    public void displayAll() {
        if (start == null) {
            System.out.println("List is Empty");
            return;
        }

        Node itr = start;
        while (itr != null) {
            System.out.print(itr.data + " -> ");
            itr = itr.next;
        }
        System.out.println("null");
    }

    
    private void printReverse(Node node) {
        if (node == null)
            return;

        printReverse(node.next);
        System.out.print(node.data + " ");
    }

    public void displayReverse() {
        printReverse(start);
        System.out.println();
    }

    
    public void search(int val) {
        Node temp = start;
        int pos = 1;

        while (temp != null) {
            if (temp.data == val) {
                System.out.println(val + " found at position " + pos);
                return;
            }
            temp = temp.next;
            pos++;
        }
        System.out.println(val + " not found in list");
    }
}












