package ExemploMensageiro;

public class Mensageiro {
    
    public void enviarMensagem() {
        validarConectadoInternet();
        consultarSaldo();
        System.out.println("Mensagem Enviada");
        salvarMensagem();
    }

    public void receberMensagem() {
        System.out.println("Mensagem Recebida");
    }

    private void validarConectadoInternet() {
        System.out.println("Validando se está conectado a internet");
    }

    private void salvarMensagem() {
        System.out.println("Salvando Mensagem");
    }

    private void consultarSaldo() {
        System.out.println("Consultando Saldo");
    }


}
