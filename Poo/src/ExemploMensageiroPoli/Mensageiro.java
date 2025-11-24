package ExemploMensageiroPoli;


public abstract class Mensageiro {
    
    public abstract void enviarMensagem();
    public abstract void receberMensagem();

    protected void validarConectadoInternet() {
        System.out.println("Validando se está conectado a internet");
    }

    protected void salvarMensagem() {
        System.out.println("Salvando Mensagem");
    }

    protected void consultarSaldo() {
        System.out.println("Consultando Saldo");
    }
}
