package List.OrdenacaoLista;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa{
    private List<Pessoa> pessoaList;

    public OrdenacaoPessoa(){
        pessoaList = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura){
        pessoaList.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade(){
        List<Pessoa> ordenadoPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(ordenadoPorIdade);
        return ordenadoPorIdade;
    }

    public List<Pessoa> ordenarPorAltura() {
        List<Pessoa> ordenadoPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(ordenadoPorAltura, new ComparatorPorAltura());
        return ordenadoPorAltura;
    }
}
