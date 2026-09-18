
package p1;
import java.util.PriorityQueue;

public class MyPriorityQueue {

    private PriorityQueue<Integer> pq;

    public MyPriorityQueue() {
        // MIN heap → small number first
        pq = new PriorityQueue<>();
    }

    // enqueue
    public void enqueue(int data) {
        pq.add(data);   // insert time pe priority set
    }

    // dequeue
    public int dequeue() {
        if (pq.isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return pq.poll();   // smallest element remove
    }

    // peek
    public int peek() {
        if (pq.isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return pq.peek();   // smallest element
    }

    // isEmpty
    public boolean isEmpty() {
        return pq.isEmpty();
    }

    // size
    public int size() {
        return pq.size();
    }

    // display (for understanding)
    public void display() {
        System.out.println(pq);
    }
}
