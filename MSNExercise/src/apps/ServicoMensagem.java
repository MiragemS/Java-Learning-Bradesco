package apps;

public abstract class ServicoMensagem {
    public abstract void enviarMensagem();
    public abstract void receberMensagem();

    protected void validarConectadpoInternet(){
        System.out.println("Verificando conexão...");
    }
}
