package Pizzaria;

import Pizzaria.Enums.OrigemIngrediente;
import Pizzaria.Enums.TipoCarne;
import Pizzaria.Enums.UnidadeMedida;

public class Carne extends  Topping{

    private TipoCarne tipoCarne;

    public Carne(int id, String nome, UnidadeMedida unidadeMedida, double calorias, OrigemIngrediente origemIngrediente, TipoCarne tipoCarne) {
        super(id, nome, unidadeMedida, calorias, origemIngrediente);
        this.tipoCarne = tipoCarne;
    }

    /**
     * Método para imprimir os detalhes de uma Carne
     */
    public void imprimirDetalhesCarne() {
        System.out.print("[ " + this.getId() + " | " + this.getNome() + " | " + this.getOrigemIngrediente() + " | " + this.tipoCarne);
    }
}
