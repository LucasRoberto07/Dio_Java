package Aparelho;

public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    private String modelo;

    // Construtor
    public iPhone() {
        this.modelo = "iPhone 2G (Original)";
        System.out.println("✅ Iniciando " + this.modelo + "...");
    }

    @Override
    public void tocar() {
        System.out.println("🎶 REPRODUTOR MUSICAL: Tocando música...");
    }

    @Override
    public void pausar() {
        System.out.println("⏸️ REPRODUTOR MUSICAL: Música pausada.");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("🎵 REPRODUTOR MUSICAL: Música selecionada: " + musica);
    }

    @Override
    public void ligar(String numero) {
        System.out.println("📞 TELEFONE: Ligando para " + numero + "...");
    }

    @Override
    public void atender() {
        System.out.println("✅ TELEFONE: Chamada atendida.");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("✉️ TELEFONE: Iniciando Correio de Voz Visual.");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("🌐 NAVEGADOR: Exibindo página: " + url);
    }

    @Override
    public void adicionarNovaAba(String url) {
        System.out.println("➕ NAVEGADOR: Adicionando nova aba com a página: " + url);
    }

    @Override
    public void atualizarPagina() {
        System.out.println("🔄 NAVEGADOR: Página atualizada.");
    }

    public static void main(String[] args) {
        // Cria uma instância do iPhone
        iPhone meuIphone = new iPhone();

        System.out.println("\n--- 1. Teste Reprodutor Musical (iPod) ---");
        meuIphone.selecionarMusica("Stairway to Heaven");
        meuIphone.tocar();
        meuIphone.pausar();

        System.out.println("\n--- 2. Teste Aparelho Telefônico ---");
        meuIphone.ligar("5511987654321");
        meuIphone.atender();
        meuIphone.iniciarCorreioVoz();

        System.out.println("\n--- 3. Teste Navegador na Internet (Safari) ---");
        meuIphone.exibirPagina("http://www.apple.com");
        meuIphone.adicionarNovaAba("http://www.google.com");
        meuIphone.atualizarPagina();
    }
}