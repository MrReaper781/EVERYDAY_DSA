import java.util.*;

public class StackImplementation {

    public static void pushAtBottom(Stack<Integer> s, int data) {
        if (s.isEmpty()) {
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        // for (int i = 0; i < stack.size(); i++) {
        // System.out.println(stack.get(i));
        // }
        // System.out.println("Top element: " + stack.peek());
        // System.out.println();
        // stack.pop();
        // for (int i = 0; i < stack.size(); i++) {
        // System.out.println(stack.get(i));
        // }
        // System.out.println("Top element: " + stack.peek());
        // System.out.println();
        // stack.pop();
        // for (int i = 0; i < stack.size(); i++) {
        // System.out.println(stack.get(i));
        // }
        System.out.print("Original list: ");
        for (int i = 0; i < stack.size(); i++) {
            System.out.print(stack.get(i) + " ");
        }
        System.out.println();
        pushAtBottom(stack, 40);
        System.out.print("After pushing an element in Bottom: ");
        for (int i = 0; i < stack.size(); i++) {
            System.out.print(stack.get(i) + " ");
        }
    }
}