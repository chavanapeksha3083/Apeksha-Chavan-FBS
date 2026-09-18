package p1;

public class LinkedListDemo<T extends Comparable<T>> {

    Node<T> head;

   
    public void insert(T data) {
        Node<T> newNode = new Node<>(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node<T> temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    public void bubbleSort() {

        if (head == null || head.next == null) {
            return;
        }

        boolean swapped;

        do {
            swapped = false;
            Node<T> temp = head;

            while (temp.next != null) {

                if (temp.data.compareTo(temp.next.data) > 0) {

                    
                    T tempData = temp.data;
                    temp.data = temp.next.data;
                    temp.next.data = tempData;

                    swapped = true;
                }

                temp = temp.next;
            }

        } while (swapped);
    }

 
    public void display() {
        Node<T> temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }
}
