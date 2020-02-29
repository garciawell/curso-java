package classes;

public class ValueVsReference {
    public static void main(String[] args) {
        double a = 2;
        double b = a; //atribuição por valor (Tipo Primitivo)

        System.out.println(a + " " + b);

        Data d1 = new Data(1, 6, 2022);
        Data d2 = d1;  // Atribuição por refeência (Objeto)
        d1.day = 31;
        d2.month = 12;

        System.out.println(d1);
    }
}
