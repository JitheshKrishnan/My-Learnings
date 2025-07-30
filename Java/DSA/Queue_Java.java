package DSA;

class Queue {
    int rear = -1;
    int front = 0;
    int size = 0;
    int[] arr = new int[4];

    public void enqueue(int data) {
        if (!isFull()) {
            rear = (rear + 1) % 4;
            arr[rear] = data;
            size++;
        } else
            System.out.println("Queue is full");
    }

    public int dequeue() {
        if (!isEmpty()) {
            int data = arr[front];
            front = (front + 1) % 4;
            size--;
            return data;
        } else
            System.out.println("Queue is empty");
        return 0;
    }

    public int peek() {
        if (!isEmpty())
            return arr[front];
        else
            System.out.println("Queue is empty");
        return 0;
    }

    public void printQueue() {
        if (!isEmpty()) {
            for (int i = 0; i < size; i++) {
                int index = (i + front) % 4;
                System.out.print(arr[index] + " ");
            }
        } else {
            System.out.println("Queue is empty");
        }
    }

    public boolean isFull() {
        return size == 4;
    }

    public boolean isEmpty() {
        return size == 0;
    }
}

public class Queue_Java {
    public static void main(String a[]) {
        Queue queue = new Queue();

        queue.enqueue(4);
        queue.enqueue(8);
        queue.enqueue(2);
        queue.enqueue(7);
        System.out.println(queue.dequeue());
        queue.enqueue(9);
        System.out.println(queue.peek());
        queue.printQueue();
    }
}
