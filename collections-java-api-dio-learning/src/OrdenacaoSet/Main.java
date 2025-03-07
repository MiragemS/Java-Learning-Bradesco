package OrdenacaoSet;

public class Main {
    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();

        cadastroProdutos.adicionarProduto(123, "Produto 1", 12.33, 30);
        cadastroProdutos.adicionarProduto(123, "Produto 2", 12.80, 30);
        cadastroProdutos.adicionarProduto(123, "Produto 3", 10.30, 30);
        cadastroProdutos.adicionarProduto(123, "Produto 4", 6.99, 30);

        System.out.println(cadastroProdutos.exibirProdutoPorPreco());
        System.out.println(cadastroProdutos.exibirProdutosNome());
    }
}
