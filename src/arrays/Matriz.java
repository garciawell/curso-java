package arrays;
import java.util.Arrays;
import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);

        System.out.print("Quantos alunos?: ");
        int qntStudents = entry.nextInt();

        System.out.print("Quantas notas por aluno?: ");
        int qntGrades = entry.nextInt();

        double[][] classGrades = new double[qntStudents][qntGrades];

        double total = 0;
        for (int a = 0; a < classGrades.length; a++) {
            for (int g = 0; g < classGrades[a].length; g++) {
                System.out.printf("Informe a nota  %d do aluno %d: ", g + 1, a + 1);
                classGrades[a][g] = entry.nextDouble();
               total += classGrades[a][g];
            }
        }

        for (double[] classGrade: classGrades){
            System.out.println("Array " +   Arrays.toString(classGrade));
        }

        System.out.println("Media da turma é " + total / (qntStudents * qntGrades));

        entry.close();

    }
}
