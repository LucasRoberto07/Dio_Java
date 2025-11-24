package ExemploCarro;

public class Autodromo {
    public static void main(String[] args) {
        Carro jeep = new Carro();
        jeep.setChassi(343453456);
        jeep.ligar();

        Moto bmw = new Moto();
        bmw.setChassi(23324534);
        bmw.ligar();
    }
}
