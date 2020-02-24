package fundaments;

import java.util.Scanner;

public class Console {
    public static void main(String[] args) {
        System.out.println("BOM");

        Scanner entry = new Scanner(System.in);
        System.out.print("Digite o seu nome: ");
        String name = entry.nextLine();

        System.out.println("Nome = " + name);
        entry.close();
    }
}
