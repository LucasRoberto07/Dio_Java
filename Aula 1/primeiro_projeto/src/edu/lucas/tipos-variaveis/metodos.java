public class metodos {
    public static void main(String[] args) {
        String primeironome = "Gustavo";
        String sobrenome = "Santos";
        String nomeCompleto = imprimeNomeCompleto(primeironome, sobrenome);
        System.out.println(nomeCompleto);
    }
    public static String imprimeNomeCompleto(String primeiroNome, String sobrenome) {
        return primeiroNome.concat(" ").concat(sobrenome);
    }
}
