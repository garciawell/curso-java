package arrays;

import java.util.Arrays;

public class Exercise {
    public static void main(String[] args) {
        double[] StudentGradesA = new double[4];

        StudentGradesA[0] = 7.9;
        StudentGradesA[1] = 8.9;
        StudentGradesA[2] = 3.9;
        StudentGradesA[3] = 6.9;


        System.out.println(Arrays.toString(StudentGradesA));

        double total = 0;
        for(int i=0; i < StudentGradesA.length; i++){
            total += StudentGradesA[i];
        }
        System.out.println(total / StudentGradesA.length);


        double[] StudentGradesB = {6.9, 8.9,5.9,10};
        double totalB = 0;
        for (double s : StudentGradesB) {
            totalB += s;
        }
        System.out.println(totalB / StudentGradesB.length);
    }
}
