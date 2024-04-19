public class LinearQueue {
    private int[] queue;
    private int front, rear;

    public LinearQueue(int size) {
        queue = new int[size];
    }

    public void insert(int value) {
        if (rear == queue.length) {
            System.out.println("Queue is full.");
            return;
        }
        queue[rear++] = value;
    }

    public int remove() {
        if (front == rear) {
            System.out.println("Queue is empty.");
            return -1;
        }
        return queue[front++];
    }

    public static void main(String[] args) {
        LinearQueue q = new LinearQueue(5);
        q.insert(10);
        q.insert(20);
        q.insert(30);

        System.out.println("Removed element: " + q.remove());
        System.out.println("Removed element: " + q.remove());
        System.out.println("Removed element: " + q.remove());
        System.out.println("Removed element: " + q.remove());
    }
}
