import apps.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ServicoMensagem smi = null;
        Scanner sc = new Scanner(System.in);
        String appEscolhido = sc.nextLine();

        if(appEscolhido.equals("msn"))
            smi = new MSNMessenger();
        else if(appEscolhido.equals("fcb"))
            smi = new FacebookMessenger();
        else if(appEscolhido.equals("tlg"))
            smi = new Telegram();
        else
            System.out.println("Não reconhecido");

        smi.enviarMensagem();
        smi.receberMensagem();

    }
}