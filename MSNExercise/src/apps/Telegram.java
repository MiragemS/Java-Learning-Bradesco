package apps;

public class Telegram extends ServicoMensagem {

    @Override
    public void enviarMensagem(){
        super.validarConectadpoInternet();
        System.out.println("Enviando mensagem pelo telegram");
    }

    @Override
    public void receberMensagem(){
        System.out.println("Recebendo mensagem");
    }
}
