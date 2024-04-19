public class CircularQueue {
    private int[] queue;
    private int front, rear, size;

    public CircularQueue(int capacity) {
        queue = new int[capacity];
    }

    public void enqueue(int value) {
        if (!isFull())
            queue[(++rear) % queue.length] = value;
        else
            System.out.println("Queue is full.");
    }

    public int dequeue() {
        if (!isEmpty())
            return queue[(front++) % queue.length];
        else {
            System.out.println("Queue is empty.");
            return -1;
        }
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == queue.length;
    }

    public static void main(String[] args) {
        CircularQueue queue = new CircularQueue(5);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        System.out.println("Removed element: " + queue.dequeue());
        System.out.println("Removed element: " + queue.dequeue());
        System.out.println("Removed element: " + queue.dequeue());
        System.out.println("Removed element: " + queue.dequeue());
    }
}
