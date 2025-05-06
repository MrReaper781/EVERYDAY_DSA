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
        // Collections.reverse(ll); // java collections is one of the collection
        // framework
        reverseList(ll);
        printlist(ll);
    }

    public static void reverseList(LinkedList<Integer> ll) {
        int start = 0;
        int end = ll.size() - 1;
        while (start < end) {
            Integer temp = ll.get(start);
            ll.set(start, ll.get(end));
            ll.set(end, temp);
            start++;
            end--;
        }
    }
}
