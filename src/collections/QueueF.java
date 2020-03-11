package collections;

import java.util.LinkedList;
import java.util.Queue;

public class QueueF {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        queue.add("Ana");
        queue.offer("Boa");
        queue.add("Carlos");
        queue.offer("Daniel");
        queue.add("Rafa");
        queue.offer("Gui");

        System.out.println(queue.peek());
        System.out.println(queue.element());


        System.out.println(queue.poll());
        System.out.println(queue.poll());


    }
}
