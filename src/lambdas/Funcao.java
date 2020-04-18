package lambdas;

import java.util.function.Function;

public class Funcao {
    public static void main(String[] args) {
        Function<Integer, String> parOuImpar =
                numero -> numero % 2 == 0 ? "Par" : "Impar";

        System.out.println(parOuImpar.apply(34));

        Function<String, String> oResultadoE =
                valor -> "O resultlado é:" + valor;

        Function<String, String> empolgado =
                valor -> valor + "!!!!";

        String resultadoFInal = parOuImpar.andThen(oResultadoE).andThen(empolgado).apply(32);
        System.out.println(resultadoFInal);


    }
}
