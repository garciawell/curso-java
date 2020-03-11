package collections;

import java.util.HashSet;
import java.util.Set;

public class conjuntoHomo {
    public static void main(String[] args) {
        Set<String> list  = new HashSet<>() ;

        list.add("1");
        list.add("Ana");
        list.add("Carlos");
        System.out.println(list);

        for (String user: list) {
            System.out.println(user);
        }
    }
}
