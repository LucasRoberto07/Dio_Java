package ExemploMensageiroPoli;

public class ComputadorPedrinho {

    public static void main(String[] args) {
        Mensageiro mensageiro;

    String appEscolhido = "Telegram";

    if(appEscolhido.equals("Telegram")) {
        mensageiro = new Telegram();
    } else if(appEscolhido.equals("Facebook")) {
        mensageiro = new FacebookMensager();
    } else {
        mensageiro = new NSNMensager();
    }

    mensageiro.enviarMensagem();
    mensageiro.receberMensagem();

    }
    
}
