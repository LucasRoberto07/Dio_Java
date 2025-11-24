package ExemploMensageiroPoli;


public class FacebookMensager extends Mensageiro {

    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Enviando mensagem pelo Facebook Mensager");
        salvarMensagem();
    }

    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo Facebook Mensager");
    }

}