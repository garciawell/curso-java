package exceptions;

public class Basico {
    public static void main(String[] args) {
    Aluno a1 = null;


    try{
        imprimirAluno(a1);
    } catch (Exception err) {
        System.out.println("Ocorreu um erro no momento de executar");
    }

//    System.out.println(7/0);
    }

    public static void imprimirAluno(Aluno aluno) {
        System.out.println(aluno.nome);
    }
}

