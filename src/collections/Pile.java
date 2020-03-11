package collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pile {
    public static void main(String[] args) {
        Deque<String> books = new ArrayDeque<>();

        books.add("O pequeno principe");
        books.push("O pequeno principe2");
        books.push("Dom Quixote");

        System.out.println(books.peek());
        System.out.println(books.element());

        System.out.println(books.pop());
        System.out.println(books.poll());
        System.out.println(books.poll());
        System.out.println(books.poll());
    }
}
