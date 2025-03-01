package ExemploPesquisa;

public class Main {
    public static void main(String[] args) {
        CatalogoLivros ct = new CatalogoLivros();
        ct.adicionarLivros("livro 1", "autor 1", 2020);
        ct.adicionarLivros("livro 2", "autor 2", 2021);
        ct.adicionarLivros("livro 3", "autor 4", 2004);
        ct.adicionarLivros("livro 4", "autor 4", 2024);
        ct.adicionarLivros("livro 5", "autor 1", 2014);
        ct.adicionarLivros("livro 6", "autor 3", 2011);
        ct.adicionarLivros("livro 7", "autor 2", 2018);
        ct.adicionarLivros("livro 8", "autor 4", 2021);

        System.out.println(ct.pesquisaPorIntervaloDeAno(2000, 2015));
        System.out.println(ct.pesquisaPorTitulo("livro 3"));
        System.out.println(ct.pesquisarAutor("autor 4"));


    }
}
