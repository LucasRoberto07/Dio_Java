
public class operadores {
    public static void main(String[] args) {
        int numero = 5;
        System.out.println(numero);

        //Operador Aritméticos

        boolean variavel = true;
        System.out.println(variavel);

        //negação de valor
        variavel = !variavel;
        System.out.println(variavel);

        //Impremento de valor
        System.out.println(++numero);

        //Imcremento de valor apos imprimir o valor
        System.out.println(numero++);

        //Decremento de valor
        System.out.println(--numero);

        //Decremento de valor apos imprimir o valor
        System.out.println(numero--);

        //Operador ternario (Essa expressão é verdadeira? se sim, retorne o valor 1, se não, retorne o valor 2)
        int a, b;
        a = 5;
        b = 6;
        if(a==b) {
            System.out.println("verdadeiro");
        } else {
            System.out.println("falso");
        }


        //expressoes logicas
        int idade = 18;
        if(idade >= 18) {
            System.out.println("Maior de idade");
        } else {
            System.out.println("Menor de idade");
        }
    }

}
