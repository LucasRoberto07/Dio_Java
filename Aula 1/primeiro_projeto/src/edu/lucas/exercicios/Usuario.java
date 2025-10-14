package edu.lucas.exercicios;

public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();
        System.out.println("Tv ligada? " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);    
        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo status -> Tv ligada? " + smartTv.ligada);

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        System.out.println("Novo status -> Volume atual: " + smartTv.volume);

        smartTv.diminuirVolume();
        System.out.println("Novo status -> Volume atual: " + smartTv.volume);

        smartTv.mudarCanal(25);
        System.out.println("Novo status -> Canal atual: " + smartTv.canal);
        
    }
}
