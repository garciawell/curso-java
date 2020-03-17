package OO.composicao.desafio;

public class CartTeste {
    public static void main(String[] args) {
    Cliente cliente = new Cliente("Wellington Garcia");

    Compra compra1 = new Compra();
    compra1.adicionarItem("Caneta", 19.67, 100);
    compra1.adicionarItem(new Produto("Notebook", 1987.48), 2);


    Compra compra2 = new Compra();
    compra2.adicionarItem("Caderno", 10,10);
    compra2.adicionarItem(new Produto("Impressora", 998.45), 2);


    cliente.compras.add(compra1);
    cliente.compras.add(compra2);

        System.out.println(cliente.obterValorTotal());
    }
}
