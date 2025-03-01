package ExemploPesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> livros;

    public CatalogoLivros(){
        this.livros = new ArrayList<>();
    }

    public void adicionarLivros(String nome, String autor, int ano){
        livros.add(new Livro(nome, autor, ano));
    }

    public List<Livro> pesquisarAutor(String autor){
        List<Livro> livrosAutor = new ArrayList<>();
        if(!livros.isEmpty()){
            for(Livro l : livros){
                if(l.getAutor().equalsIgnoreCase(autor)){
                    livrosAutor.add(l);
                }
            }
        }

        return livrosAutor;
    }

    public List<Livro> pesquisaPorIntervaloDeAno(int anoInicial, int anoFinal){
        List<Livro>  livrosPorIntervalo = new ArrayList<>();
        for(Livro l : livros){
            if(l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal){
                livrosPorIntervalo.add(l);
            }
        }
        return livrosPorIntervalo;
    }

    public Livro pesquisaPorTitulo(String titulo){
        Livro livroPortTitulo = null;
        if(!livros.isEmpty()){
            for(Livro l : livros){
                if(l.getTitulo().equalsIgnoreCase(titulo)){
                    livroPortTitulo = l;
                    break;
                }
            }
        }
        return livroPortTitulo;
    }
}
