import java.util.Stack;

public class LinearQueueUsingStacks {
    private Stack<Integer> inbox = new Stack<>();
    private Stack<Integer> outbox = new Stack<>();

    public void enqueue(int value) {
        inbox.push(value);
    }

    public int dequeue() {
        if (outbox.isEmpty()) {
            while (!inbox.isEmpty()) {
                outbox.push(inbox.pop());
            }
        }
        return outbox.isEmpty() ? -1 : outbox.pop();
    }

    public static void main(String[] args) {
        LinearQueueUsingStacks queue = new LinearQueueUsingStacks();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        System.out.println("Removed element: " + queue.dequeue());
        System.out.println("Removed element: " + queue.dequeue());
        System.out.println("Removed element: " + queue.dequeue());
        System.out.println("Removed element: " + queue.dequeue());
    }
}
