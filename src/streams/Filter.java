package streams;

import java.util.Arrays;
import java.util.List;

public class Filter {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Ana", 7.8);
        Aluno a2 = new Aluno("Bia", 9.8);
        Aluno a3 = new Aluno("Pedro", 3.8);
        Aluno a4 = new Aluno("Daniel", 2.8);
        Aluno a5 = new Aluno("Gui", 4.8);
        Aluno a6 = new Aluno("Rebeca", 8.8);

        List<Aluno> alunos = Arrays.asList(a1,a2,a3,a4,a5,a6);

        alunos.stream()
                .filter(n -> n.nota >= 7)
                .map(a -> "Parabnéns " + a.nome + " Você foi aprovado !")
                .forEach(System.out::println);
    }
}
