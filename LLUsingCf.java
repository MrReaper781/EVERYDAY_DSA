import java.util.*;

public class LLUsingCf {
    public static void printlist(LinkedList<Integer> ll) {
        for (int num : ll) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(4);
        ll.add(2, 7);
        printlist(ll);
        ll.removeFirst();
        ll.removeLast();
        ll.remove(1);
        printlist(ll);
    }
}
