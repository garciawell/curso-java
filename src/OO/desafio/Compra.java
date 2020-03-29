package OO.desafio;

import java.util.List;
import java.util.ArrayList;

public class Compra {
    final List<Item> itens = new ArrayList<>();

    void adicionarItem(Produto p, int qntde) {
        this.itens.add(new Item(p, qntde));
    }


    void adicionarItem(String nome, double preco, int qtde) {
        this.itens.add(new Item(new Produto(nome, preco), qtde));
    }

    double obterValorTotal() {
        double total = 0;

        for(Item item: itens) {
            total += item.quantidade * item.produto.preco;
        }

        return total;
    }
}
