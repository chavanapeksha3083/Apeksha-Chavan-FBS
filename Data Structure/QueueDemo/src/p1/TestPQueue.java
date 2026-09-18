package p1;
import java.util.Scanner;

public class TestPQueue {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        MyPriorityQueue q = new MyPriorityQueue();

        q.enqueue(10);
        q.enqueue(3);
        q.enqueue(7);
        q.enqueue(1);
        q.enqueue(5);

        System.out.println("Peek (smallest): " + q.peek());

        System.out.println("Dequeue: " + q.dequeue());
        System.out.println("Dequeue: " + q.dequeue());

        System.out.println("Remaining queue:");
        q.display();
    }
}
