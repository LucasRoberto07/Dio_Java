package ExemploMensageiroAbstract;

public class ComputadorPedrinho {

    public static void main(String[] args) {
        NSNMensager nsn = new NSNMensager();
        Telegram telegram = new Telegram();
        FacebookMensager facebook = new FacebookMensager();

        nsn.enviarMensagem();
        nsn.receberMensagem();
        System.out.println("                           ");
        telegram.enviarMensagem();
        telegram.receberMensagem();
        System.out.println("                            ");
        facebook.enviarMensagem();
        facebook.receberMensagem();
        System.out.println("                            ");

    }
    
}
