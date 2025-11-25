package TesteDeSistema;
import Aparelho.iPhone;

public class TesteSistema {

    public static void main(String[] args) {
        
        System.out.println("--- INICIANDO TESTE DO SISTEMA INTEGRADO ---");
        
        // Instancia a classe principal (o iPhone)
        iPhone meuIphone = new iPhone();
        System.out.println("✅ Dispositivo inicializado: " + meuIphone.getClass().getSimpleName());
        
        System.out.println("\n--- 1. Teste Reprodutor Musical (iPod) ---");
        // O iPhone é tratado como ReprodutorMusical
        meuIphone.selecionarMusica("Stairway to Heaven");
        meuIphone.tocar();
        meuIphone.pausar();

        System.out.println("\n--- 2. Teste Aparelho Telefônico ---");
        // O iPhone é tratado como AparelhoTelefonico
        meuIphone.ligar("5511987654321");
        meuIphone.atender();
        meuIphone.iniciarCorreioVoz();

        System.out.println("\n--- 3. Teste Navegador na Internet (Safari) ---");
        // O iPhone é tratado como NavegadorInternet
        meuIphone.exibirPagina("http://www.apple.com");
        meuIphone.adicionarNovaAba("http://www.google.com");
        meuIphone.atualizarPagina();
        
        System.out.println("\n--- TESTE FINALIZADO ---");
    }
}