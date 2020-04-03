package lambdas;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.List;

public class Foreach {
    public static void main(String[] args) {
        List<String> aprovados = Arrays.
                asList("Ana", "Bia", "Lia", "Gui");

        System.out.println("Foreach Comum....");
        for (String nome: aprovados) {
            System.out.println(nome);
        }

        System.out.println("\nLambda #01...");

        aprovados.forEach(nome -> {
            System.out.println(nome + "!!!");
        });


        System.out.println("\nMethod Reference...");
        aprovados.forEach(System.out::println);
    }
}
