package exceptions.personalizadaB;

import exceptions.Aluno;

public class TesteValidacoes {

    public static void main(String[] args) {

        try {
            Aluno aluno = new Aluno("Ana", 7);
            Validar.usuario(aluno);
        } catch (StringVaziaException | NumeroNegativoException | IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("FIM >>");
    }
}
