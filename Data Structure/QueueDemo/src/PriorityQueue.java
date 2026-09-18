 class PriorityQueue {

    int[] pq;
    int size;

    public PriorityQueue(int capacity) {
        pq = new int[capacity];
        size = 0;
    }

  
    public void insert(int value) {
        if (size == pq.length) {
            System.out.println("Priority Queue is Full");
            return;
        }

        int i = size - 1;

        while (i >= 0 && pq[i] > value) {
            pq[i + 1] = pq[i];
            i--;
        }

        pq[i + 1] = value;
        size++;

        System.out.println(value + " inserted");
    }

    // Delete highest priority element (minimum number)
    public void delete() {
        if (size == 0) {
            System.out.println("Priority Queue is Empty");
            return;
        }

        int deleted = pq[0];

        for (int i = 0; i < size - 1; i++) {
            pq[i] = pq[i + 1];
        }

        size--;

        System.out.println("Deleted (Highest Priority): " + deleted);
    }

   
    public void display() {
        if (size == 0) {
            System.out.println("Queue is Empty");
            return;
        }

        System.out.print("Priority Queue: ");
        for (int i = 0; i < size; i++) {
            System.out.print(pq[i] + " ");
        }
        System.out.println();
    }
}
