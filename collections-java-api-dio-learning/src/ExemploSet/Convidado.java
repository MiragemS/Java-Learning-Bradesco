package ExemploSet;

import java.util.Objects;

public class Convidado {
    private String nome;
    private int cofigoConvite;

    public Convidado(String nome, int cofigoConvite) {
        this.nome = nome;
        this.cofigoConvite = cofigoConvite;
    }

    public String getNome() {
        return nome;
    }

    public int getCofigoConvite() {
        return cofigoConvite;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Convidado convidado = (Convidado) o;
        return cofigoConvite == convidado.cofigoConvite;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(cofigoConvite);
    }

    @Override
    public String toString() {
        return "Convidado{" +
                "nome='" + nome + '\'' +
                ", cofigoConvite=" + cofigoConvite +
                '}';
    }
}
