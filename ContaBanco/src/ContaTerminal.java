import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite seu primeiro nome:");
        String nome = scanner.next();

        System.out.println("Agora, informe seu sobrenome: ");
        String sobreNome = scanner.next();

        String nomeCompleto = nome + " " +sobreNome;

        System.out.println("Por favor informe o numero da sua conta: ");
        int numero = scanner.nextInt();

        System.out.println("Informe o numero da sua Agencia? (OBS: O numero deve ser informado de maneira formatada seguindo o seguinte exemplo:111-1)");
        String agencia = scanner.next();

        System.out.println("Informe qual o valor voce deseja depositar:");
        double saldo = scanner.nextDouble();

        scanner.close();

        System.out.println("Olá, " + nomeCompleto + " Obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta:" + numero +" e seu saldo: R$" + saldo + " já esta disponível para saque.");




    }
}
