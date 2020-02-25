package fundaments;

import java.util.Scanner;

public class ConversionChallenge {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        System.out.print("Informe o Primeiro salário:");
        String value1 = entry.next().replace(",", ".");
        System.out.print("\nInforme o Segundo salário:");
        String value2 = entry.next().replace(",", ".");
        System.out.print("\nInforme o Terceiro salário:");
        String value3 = entry.next().replace(",", ".");

        double salary1 = Double.parseDouble(value1);
        double salary2 = Double.parseDouble(value2);
        double salary3 = Double.parseDouble(value3);

        double average = (salary1 + salary2 + salary3) /3;
        System.out.println("A média dos salário é " + average);

        entry.close();
    }
}
