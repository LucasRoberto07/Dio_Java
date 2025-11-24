package ExemploInterface.Estabelecimento;

import ExemploInterface.Equipamento.Copiadora.Copiadora;
import ExemploInterface.Equipamento.Digitalizadora.Digitalizadora;
//import ExemploInterface.Equipamento.Impressora.DeskJet;
import ExemploInterface.Equipamento.Impressora.Impressora;
//import ExemploInterface.Equipamento.Impressora.LaserJet;
import ExemploInterface.Equipamento.MutiFuncional.EquipamentoMutifuncional;

public class Fabrica {
    
    /**
     * O método main demonstra o polimorfismo através de interfaces.
     * Um único objeto (EquipamentoMutifuncional) pode ser referenciado por
     * diferentes tipos de interface (Impressora, Digitalizadora, Copiadora).
     */
    public static void main(String[] args) {
        // Criamos uma instância da classe concreta que implementa as interfaces.
        EquipamentoMutifuncional equipamento = new EquipamentoMutifuncional();
        
        // Aqui ocorre o polimorfismo. A variável 'impressora' é do tipo da interface,
        // mas aponta para um objeto 'EquipamentoMutifuncional'.
        // Isso nos permite acessar apenas os métodos definidos na interface Impressora.
        Impressora  impressora = equipamento;
        Digitalizadora digitalizadora = equipamento;
        Copiadora copiadora = equipamento;

        // Mesmo que a variável seja do tipo 'Impressora', o método executado
        // será o da classe 'EquipamentoMutifuncional', pois é a implementação real.
        impressora.imprimir();
        digitalizadora.digitalizar();
        copiadora.copiar();
        
        // Nota: Se tentássemos chamar `impressora.copiar()`, o código não compilaria,
        // pois a interface `Impressora` não define o método `copiar()`.

    }
}
