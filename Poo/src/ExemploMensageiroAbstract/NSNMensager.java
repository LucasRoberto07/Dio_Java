package ExemploMensageiroAbstract;

public class NSNMensager extends Mensageiro{
    
    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Enviando mensagem pelo NSN Mensager");
        salvarMensagem();
    }

    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo NSN Mensager");
    }

}
