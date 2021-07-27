import java.util.LinkedList;
import java.util.Stack;

public class QueuePractice <D> {
    //Creating a new LinkedList
    LinkedList<D> queue = new LinkedList();

    // Making a queue instance
    public QueuePractice() {
        queue = new LinkedList();
    }

    // Is our queue empty
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    // What is the size of our queue
    public int size() {
        return queue.size();
    }

    // Enqueueing an item
    public void enqueue(D n) {
        queue.addLast(n);
    }

    // Dequeueing an item
    public D dequeue() {
        return queue.remove(0);
    }

    // Peek at the first item
    public D peek() {
        return queue.get(0);
    }

    public static void main(String[] args) {
        // Creating A Stack. Only strings can be in this stack, but other data types can be added to stacks with proper notation/syntax
        Stack<String> StackPractice = new Stack<>();
        StackPractice.push("there");
        StackPractice.push("hi");
        System.out.println(StackPractice.pop() + " ");
        System.out.println("Peek:" + StackPractice.peek());
        System.out.println(StackPractice.pop() + "! ");
        System.out.println("Size:" + StackPractice.size());

        // Queues in the Main Method
        QueuePractice numberQueue = new QueuePractice();
        numberQueue.enqueue(5);
        numberQueue.enqueue(7);
        numberQueue.enqueue(6);
        System.out.println("First out: " + numberQueue.dequeue());
        System.out.println("Peek at second item: " + numberQueue.peek());
        System.out.println("Second out: " + numberQueue.dequeue());
        System.out.println("Third out: " + numberQueue.dequeue());
    }
}
