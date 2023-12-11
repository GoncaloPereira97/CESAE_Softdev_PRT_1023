package Pizzaria;

import Pizzaria.Enums.MassaPizza;
import Pizzaria.Enums.UnidadeMedida;

public class IngredienteBase extends Ingredientes{
    
    private MassaPizza massaPizza;



    public IngredienteBase(int id, String nome, double calorias, MassaPizza massaPizza) {
        super(id, nome, UnidadeMedida.GRAMAS, calorias);
        this.massaPizza = massaPizza;
    }

    /**
     * Método para imprimir os detalhes de uma Massa
     */
    public void imprimirDetalhesBase() {
        System.out.print("[ " + this.getId() + " | " + this.getNome() + " | " + this.massaPizza);
    }
}
