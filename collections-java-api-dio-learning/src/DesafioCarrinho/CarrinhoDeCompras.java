package DesafioCarrinho;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> carrinho;

    public CarrinhoDeCompras(){
        this.carrinho = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        this.carrinho.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome){
        List<Item> removerCarrinho = new ArrayList<>();
        for(Item item : carrinho){
            if(item.getNome().equalsIgnoreCase(nome)){
                removerCarrinho.add(item);
            }
        }
        carrinho.removeAll(removerCarrinho);
    }

    public void calcularValorTotal(){
        double valorTotal = 0;
        for(Item item : carrinho){
            valorTotal += (item.getPreco()* item.getQuantidade());
        }
        System.out.println("Valor total do carrinho: R$" + valorTotal);
    }

    public void exibirItens(){
        for(Item item : carrinho){
            System.out.println("Item: " + item.getNome() +
                    "\nPreço: " + item.getPreco() +
                    "\nQuantidade: " + item.getQuantidade() +
                    "\n----------------------\n");
        }
    }
}
