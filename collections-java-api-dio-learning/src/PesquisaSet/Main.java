package PesquisaSet;

public class Main {
    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Contato 1", 123);
        agendaContatos.adicionarContato("Contato 2", 234);
        agendaContatos.adicionarContato("Contato 3", 345);
        agendaContatos.adicionarContato("Contato 4", 456);
        agendaContatos.adicionarContato("Contato 5", 567);

        agendaContatos.exibirContato();
        System.out.println(agendaContatos.pesquisarPorNome("Contato 2"));

        System.out.println(agendaContatos.pesquisarPorNome("Contato "));

        System.out.println(agendaContatos.atualizarNumeroContato("Contato 3", 44444));
    }
}
