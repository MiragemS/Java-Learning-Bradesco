package DesafioCarrinho;

public class Main {
    public static void main(String[] args) {
        CarrinhoDeCompras c1 = new CarrinhoDeCompras();

        c1.adicionarItem("Molho de tomate", 8.5, 3);
        c1.adicionarItem("Guaraviton", 4.5, 7);
        c1.adicionarItem("Macarrão", 12.5, 2);
        c1.adicionarItem("Espinafre", 2.5, 1);

        c1.exibirItens();
        c1.calcularValorTotal();

        c1.removerItem("Espinafre");

        c1.exibirItens();
        c1.calcularValorTotal();

    }
}
