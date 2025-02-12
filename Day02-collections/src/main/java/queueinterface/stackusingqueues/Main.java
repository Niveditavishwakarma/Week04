package queueinterface.stackusingqueues;

public class Main {
    public static void main(String[] args) {
        StackUsingQueues stack = new StackUsingQueues();

        System.out.println("Pushing 1, 2, 3...");
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Top element: " + stack.top());
        System.out.println("Popping: " + stack.pop());
        System.out.println("Is stack empty? " + stack.isEmpty());
        System.out.println("Popping: " + stack.pop());
        System.out.println("Is stack empty? " + stack.isEmpty());
        System.out.println("Top element: " + stack.top());
    }
}
