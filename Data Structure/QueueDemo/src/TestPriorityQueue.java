 class TestPriorityQueue {

    public static void main(String[] args) {

        PriorityQueue pq = new PriorityQueue(5);

        pq.insert(30);
        pq.insert(10);
        pq.insert(40);
        pq.insert(20);

        pq.display();

        pq.delete();
        pq.display();
    }
}
