package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MinMax {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Ana", 7.1);
        Aluno a2 = new Aluno("Luna", 6.1);
        Aluno a3 = new Aluno("Gui", 8.1);
        Aluno a4 = new Aluno("Gabi", 9.1);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);

        Comparator<Aluno> verifyNota = (ao1, ao2) -> {
            if(ao1.nota > ao2.nota) return 1;
            if(ao1.nota < ao2.nota) return - 1;
            return 0;
        };

        System.out.println(alunos.stream().max(verifyNota).get());
        System.out.println(alunos.stream().min(verifyNota).get());
    }

}
