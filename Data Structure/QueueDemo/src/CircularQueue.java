 class Queue {

    int[] arr;
    int front;
    int rear;

    Queue(int size) {
        arr = new int[size];
        front = -1;
        rear = -1;
    }

    boolean isEmpty() {
        if (rear == -1)
            return true;
        else
            return false;
    }

    boolean isFull() {
        if ((rear == arr.length - 1 && front == 0) || (rear + 1 == front))
            return true;
        else
            return false;
    }

    void enqueue(int ele) {
        if (isFull()) {
            System.out.println("Queue is Full");
        } else {
            if (rear == -1) {
                rear = 0;
                front = 0;
            } else if (rear == arr.length - 1) {
                rear = 0;
            } else {
                rear++;
            }
            arr[rear] = ele;
            System.out.println("Inserted: " + ele);
        }
    }

    int dequeue() {
        int ele;

        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        } else {
            ele = arr[front];

            if (rear == front) {
                rear = -1;
                front = -1;
            } else if (front == arr.length - 1) {
                front = 0;
            } else {
                front++;
            }
            return ele;
        }
    }

    void display()
    {
        if (isEmpty())
        {
            System.out.println("Queue is Empty");
        } else 
        {
            int i = front;
            System.out.print("Queue: ");
            while (i!=rear)
            {
                System.out.print(arr[i] + " ");
            
                   

                if (i == arr.length - 1)
                    i = 0;
                else
                    i++;
            }
            System.out.println();
        }
    }
}