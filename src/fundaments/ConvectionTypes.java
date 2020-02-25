package fundaments;

import javax.swing.*;

public class ConvectionTypes {
    public static void main(String[] args) {
        Integer num1 = 10000;
        System.out.println(num1.toString());

        int num2 = 100000;
        System.out.println(Integer.toString(num2));

        String value1 = JOptionPane.showInputDialog("Digite o primeiro numero");
        String value2 = JOptionPane.showInputDialog("Digite o segundo numero");

        System.out.println(value1 + value2);

        double number1 = Double.parseDouble(value1);
        double number2 = Double.parseDouble(value2);

        double sum = number1 + number2;
        System.out.println("Soma é " + sum);
        System.out.println("Média é " + sum / 2);
    }
}
