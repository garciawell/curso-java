package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Foreach {
    public static void main(String[] args) {
//        double[] grades = {9.9, 5.5, 7.2, 9.4};
//
//        for (double grade: grades) {
//            System.out.println(grade);
//        }
//
//


        Scanner entry = new Scanner(System.in);

        System.out.print("Quantidade Notas A: ");
        int qntGrades = entry.nextInt();
        double[] grades = new double[qntGrades];




        for (int i = 0; i < grades.length; i++ ) {
            System.out.print("Informe Nota" + ( i + 1 ) + ":");
            grades[i] +=  entry.nextDouble();
        }


        System.out.println("Quantidade Notas" + Arrays.toString(grades));


        entry.close();

    }
}
