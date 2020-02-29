package classes;

public class ProductTest {
    public static void main(String[] args) {
       Product p1 = new Product("Notebook");
       p1.price = 4556.89;
       p1.discount = 0.25;

       Product p2 = new Product("Caneta Preta");
       p2.price = 12.56;
       p2.discount = 0.15;

        System.out.println(p1.name);
        System.out.println(p2.name);

        double finalPrice1 = p1.priceWithDiscount();
        double finalPrice2 = p2.priceWithDiscount();

        double averageCart = (finalPrice1 + finalPrice2) / 2;

        System.out.printf("Média do Carrinho = R$%.2f", averageCart );

    }
}
