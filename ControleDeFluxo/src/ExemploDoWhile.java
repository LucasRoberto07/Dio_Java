import java.util.Random;

public class ExemploDoWhile {
    public static void main(String[] args) {
        System.err.println("Discando...");
        do{
            System.err.println("Telefone tocando");
        }while (tocando());
            System.err.println("Alô!!!");
            
        
    }
    private static boolean tocando(){
        boolean atendeu = new Random().nextInt(3)==1;
        System.err.println("Atendeu? " + atendeu);
        //negando o ato de continuar tocando
        return ! atendeu;
    }
}
