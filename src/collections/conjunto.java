package collections;

import java.util.HashSet;
import java.util.Set;

public class conjunto {
    public static void main(String[] args) {
        HashSet conjunto = new HashSet();

        conjunto.add(1.2);
        conjunto.add(true);
        conjunto.add("Teste");
        conjunto.add(1);
        conjunto.add("x");

        System.out.println(conjunto.size());
        System.out.println(conjunto.remove("Teste"));
        System.out.println(conjunto.size());

        System.out.println(conjunto.contains(1));

        Set nums = new HashSet();

        nums.add(1);
        nums.add(2);
        nums.add(3);

        System.out.println(nums);

        conjunto.addAll(nums); // UNIAO CONJUNTOS

        System.out.println(conjunto);

        conjunto.retainAll(nums); // INTERSECAO
        System.out.println(conjunto);

        conjunto.clear();
        System.out.println(conjunto);

    }
}
