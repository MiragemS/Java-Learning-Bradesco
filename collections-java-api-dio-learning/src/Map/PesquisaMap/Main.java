package Map.PesquisaMap;

public class Main {
    public static void main(String[] args) {
        EstoqueProdutos estoqueProdutos = new EstoqueProdutos();

        estoqueProdutos.adicionarProduto(1L, "prod1", 10.0, 12);
        estoqueProdutos.adicionarProduto(2L, "prod2", 12.0, 8);
        estoqueProdutos.adicionarProduto(3L, "prod3", 18.0, 10);
        estoqueProdutos.adicionarProduto(4L, "prod4", 22.0, 20);

        estoqueProdutos.exibirProdutos();

        System.out.println("O valor total do estoque: R$" + estoqueProdutos.calculaValorTotalEstoque());
        System.out.println("Produto mais caro: " + estoqueProdutos.obterProdutoMaisCaro());
    }
}
