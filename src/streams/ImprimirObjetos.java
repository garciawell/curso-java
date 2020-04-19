package streams;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimirObjetos {
    public static void main(String[] args) {

        List<String> aprovados = Arrays.asList("Lu", "Gui", "Luca", "Ana");

        for (int i = 0; i < aprovados.size(); i++) {
            System.out.println(aprovados.get(i));
        }
        System.out.println("Usando Foreach");
        for (String nome: aprovados
             ) {
            System.out.println(nome);
        }

        Iterator<String> it = aprovados.iterator();
        System.out.println("Usando ITERATOR");
        while (it.hasNext()){
            System.out.println(it.next());
        }


        System.out.println("Usando STREAM2");
        Stream<String> st = aprovados.stream();

        st.forEach(System.out::println);

    }
}
