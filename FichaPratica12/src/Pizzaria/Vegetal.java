package Pizzaria;

import Pizzaria.Enums.OrigemIngrediente;
import Pizzaria.Enums.TipoVegetal;
import Pizzaria.Enums.UnidadeMedida;

public class Vegetal extends Topping{

    private TipoVegetal tipoVegetal;

    public Vegetal(int id, String nome, UnidadeMedida unidadeMedida, double calorias, OrigemIngrediente origemIngrediente, TipoVegetal tipoVegetal) {
        super(id, nome, unidadeMedida, calorias, origemIngrediente);
        this.tipoVegetal = tipoVegetal;
    }

    /**
     * Método para imprimir os detalhes de um Vegetal
     */
    public void imprimirDetalhesVegetal() {
        System.out.print("[ " + this.getId() + " | " + this.getNome() + " | " + this.getOrigemIngrediente() + " | " + this.tipoVegetal);
    }
}
