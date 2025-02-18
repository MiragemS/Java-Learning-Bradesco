package apps;

public class MSNMessenger extends ServicoMensagem {
    @Override
    public void enviarMensagem(){
        super.validarConectadpoInternet();
        System.out.println("Enviando mensagem pelo msn");
    }

    @Override
    public void receberMensagem(){
        System.out.println("Recebendo mensagem");
    }
}
