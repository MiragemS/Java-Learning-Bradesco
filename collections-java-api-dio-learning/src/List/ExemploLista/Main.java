package List.ExemploLista;

public class Main {
    public static void main(String[] args) {

        ListaTarefa listat = new ListaTarefa();
        listat.adicionarTrefa("Tarefa 1");
        listat.adicionarTrefa("Tarefa 2");
        listat.adicionarTrefa("Tarefa 3");

        listat.removeTarefa("Tarefa 1");
        System.out.println(listat.obterNumeroTotalTarefas());
        listat.obterDescricoesTarefa();
    }
}