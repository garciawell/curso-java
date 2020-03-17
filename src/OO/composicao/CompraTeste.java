package OO.composicao;

public class CompraTeste {
    public static void main(String[] args) {
        Compra c1 = new Compra();

        c1.cliente = "João Pedro";
        c1.adicionarItem(new Item("Caneta Azul", 20, 7.45));
        c1.adicionarItem(new Item("Azul Caneta", 4, 12.45));
        c1.adicionarItem(new Item("Borracha", 5, 18.45));

        System.out.println(c1.itens.size());
        System.out.println(c1.getValorTotal());
    }
}
