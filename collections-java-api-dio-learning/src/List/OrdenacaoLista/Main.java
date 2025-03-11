package List.OrdenacaoLista;

public class Main {
    public static void main(String[] args) {
        OrdenacaoPessoa ordena = new OrdenacaoPessoa();

        ordena.adicionarPessoa("Nome 1", 12, 1.45);
        ordena.adicionarPessoa("Nome 2", 18 , 1.85);
        ordena.adicionarPessoa("Nome 3", 7, 1.10);
        ordena.adicionarPessoa("Nome 4", 19, 1.70);

        System.out.println(ordena.ordenarPorAltura());
        System.out.println(ordena.ordenarPorIdade());
    }
}
