package Aparelho;
// Interface que define o papel de Aparelho Telefônico
public interface AparelhoTelefonico {

    public void ligar(String numero);

    public void atender();

    // Método que faz referência ao "Visual Voicemail" destacado no vídeo de lançamento.
    public void iniciarCorreioVoz();
}