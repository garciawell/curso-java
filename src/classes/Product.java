package classes;

public class Product {
    String name;
    double price;
    double discount;

    Product (String nameInitial){
        name = nameInitial;
    }

    double priceWithDiscount() {
        return price * (1 - discount);
    }
}
