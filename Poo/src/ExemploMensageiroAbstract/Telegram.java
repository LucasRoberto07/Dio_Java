package ExemploMensageiroAbstract;

public class Telegram extends Mensageiro{
    
    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Enviando mensagem pelo Telegram");
        salvarMensagem();
    }

    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo Telegram");
    }

}
