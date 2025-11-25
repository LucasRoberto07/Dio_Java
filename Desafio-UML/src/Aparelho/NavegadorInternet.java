package Aparelho;
// Interface que define o papel de Navegador na Internet
public interface NavegadorInternet {

    public void exibirPagina(String url);

    // Representa a capacidade de abrir novas janelas ou abas.
    public void adicionarNovaAba(String url);

    public void atualizarPagina();
}