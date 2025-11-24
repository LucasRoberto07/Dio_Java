package ExemploCarro;

public class Carro extends Veiculo{
    
    public void ligar(){
        comfereCambio();
        comfereCombustivel();
        System.out.println("Carro Ligado");
    }

    private void comfereCambio(){
        System.err.println("Conferindo Câmbio em P");
    }

    private void comfereCombustivel(){
        System.err.println("Conferindo Combustível");
    }
}
