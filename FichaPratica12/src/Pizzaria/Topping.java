package Pizzaria;

import Pizzaria.Enums.OrigemIngrediente;
import Pizzaria.Enums.UnidadeMedida;

public class Topping extends Ingredientes{

    private OrigemIngrediente origemIngrediente;

    public Topping(int id, String nome, UnidadeMedida unidadeMedida, double calorias, OrigemIngrediente origemIngrediente) {
        super(id, nome, unidadeMedida, calorias);
        this.origemIngrediente = origemIngrediente;
    }

    public OrigemIngrediente getOrigemIngrediente() {
        return origemIngrediente;
    }

}
