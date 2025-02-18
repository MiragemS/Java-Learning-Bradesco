package apps;

public class FacebookMessenger extends ServicoMensagem {
    @Override
    public void enviarMensagem(){
        super.validarConectadpoInternet();
        System.out.println("Enviando mensagem pelo Facebook");
    }

    @Override
    public void receberMensagem(){
        System.out.println("Recebendo mensagem");
    }
}
