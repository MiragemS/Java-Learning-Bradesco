package ExemploSet;

public class Main {
    public static void main(String[] args) {
        conjuntoConvidado conjuntoConvidado = new conjuntoConvidado();

        conjuntoConvidado.adicionarConvidado("Convidado 1", 1);
        conjuntoConvidado.adicionarConvidado("Convidado 2", 2);
        conjuntoConvidado.adicionarConvidado("Convidado 3", 3);
        conjuntoConvidado.adicionarConvidado("Convidado 4", 4);
        conjuntoConvidado.adicionarConvidado("Convidado 5", 5);

        System.out.println("Existem: " + conjuntoConvidado.contarConvidador() + " convidados");

        conjuntoConvidado.exibirConvidados();
    }
}
