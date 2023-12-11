package Pizzaria;

import Pizzaria.Enums.OrigemIngrediente;
import Pizzaria.Enums.TipoQueijo;
import Pizzaria.Enums.UnidadeMedida;

public class Queijo extends Topping{

    private TipoQueijo tipoQueijo;

    public Queijo(int id, String nome, UnidadeMedida unidadeMedida, double calorias, OrigemIngrediente origemIngrediente, TipoQueijo tipoQueijo) {
        super(id, nome, unidadeMedida, calorias, origemIngrediente);
        this.tipoQueijo = tipoQueijo;
    }

    /**
     * Método para Imprimir os detalhes do Queijo
     */
    public void imprimirDetalhesQueijo() {
        System.out.print("[ " + this.getId() + " | " + this.getNome() + " | " + this.tipoQueijo + " | " + this.getOrigemIngrediente());
    }
}
