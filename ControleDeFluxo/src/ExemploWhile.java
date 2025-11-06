import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhile {
    public static void main(String[] args) {
        double mesada = 50.0;
        
        while (mesada > 0){
            double valorDoce = valorAleatorio();
            
            if(valorDoce > mesada){
                valorDoce = mesada;
            }
             
            System.err.println("Doce do valor: R$"+valorDoce+" Adicionado no Carrinho");
            mesada = mesada - valorDoce;
             
        }
        System.err.println("Mesada: "+ mesada);
        System.err.println("João Gastou tudo");
    }

    private static double  valorAleatorio (){
        return ThreadLocalRandom.current().nextDouble(2,8);
    }
    
}

