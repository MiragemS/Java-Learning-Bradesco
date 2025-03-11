package Map.ExemploMap;

public class Main {
    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Pessoa 1", 12345);
        agendaContatos.adicionarContato("Pessoa 1 2", 56789);
        agendaContatos.adicionarContato("Pessoa 2", 34567);
        agendaContatos.adicionarContato("Pessoa 3", 45678);
        agendaContatos.adicionarContato("Pessoa 4", 56789);
        agendaContatos.adicionarContato("Pessoa 1 2 3", 67890);

        agendaContatos.exibirContatos();

        agendaContatos.removerContato("Pessoa 2");
        agendaContatos.exibirContatos();

        System.out.println("O numero de contatos é " + agendaContatos.pesquisarPorNome("Pessoa 4"));
    }

}
