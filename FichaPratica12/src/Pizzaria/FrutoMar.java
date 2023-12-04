package Pizzaria;

import Pizzaria.Enums.OrigemIngrediente;
import Pizzaria.Enums.TipoFrutosMar;
import Pizzaria.Enums.UnidadeMedida;

public class FrutoMar extends Topping{

    private TipoFrutosMar tipoFrutosMar;

    public FrutoMar(int id, String nome, UnidadeMedida unidadeMedida, double calorias, OrigemIngrediente origemIngrediente, TipoFrutosMar tipoFrutosMar) {
        super(id, nome, unidadeMedida, calorias, origemIngrediente);
        this.tipoFrutosMar = tipoFrutosMar;
    }

    /**
     * Método para imprimir os detalhes de um Fruto do Mar
     */
    public void imprimirDetalhesFrutoMar() {
        System.out.print("[ " + this.getId() + " | " + this.getNome() + " | " + this.getOrigemIngrediente() + " | " + this.tipoFrutosMar);
    }
}
