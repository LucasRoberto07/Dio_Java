package ExemploInterface.Equipamento.MutiFuncional;

import ExemploInterface.Equipamento.Copiadora.Copiadora;
import ExemploInterface.Equipamento.Digitalizadora.Digitalizadora;
import ExemploInterface.Equipamento.Impressora.Impressora;

/**
 * Esta classe é um exemplo de como uma única classe pode implementar múltiplas interfaces.
 * Ao implementar Copiadora, Digitalizadora e Impressora, a classe EquipamentoMutifuncional
 * "herda" a obrigação de implementar os métodos de todas essas interfaces.
 * Isso permite que um objeto dessa classe se comporte como os três tipos de equipamento.
 */
public class EquipamentoMutifuncional implements Copiadora, Digitalizadora, Impressora{
    
    // Implementação do método da interface Copiadora
    @Override
    public void copiar(){
        System.out.println("Copiando por Equipamento Mutifuncional");
    }

    // Implementação do método da interface Digitalizadora
    @Override
    public void digitalizar(){
        System.out.println("Digitalizando por Equipamento Mutifuncional");
    }

    // Implementação do método da interface Impressora
    @Override
    public void imprimir(){
        System.out.println("Imprimindo por Equipamento Mutifuncional");
    }
}
