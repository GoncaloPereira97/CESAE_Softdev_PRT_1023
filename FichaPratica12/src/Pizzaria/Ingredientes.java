package Pizzaria;

import Pizzaria.Enums.TamanhoPizza;
import Pizzaria.Enums.UnidadeMedida;

import static Pizzaria.Enums.UnidadeMedida.*;

public class Ingredientes extends ConstruirPizza {

    private UnidadeMedida unidadeMedida;

    private double calorias;

    private double quantidade;


    public Ingredientes(int id, String nome, UnidadeMedida unidadeMedida, double calorias, double quantidade) {
        super(id, nome);
        this.unidadeMedida = unidadeMedida;
        this.calorias = calorias;
        this.quantidade = quantidade;
    }

    @Override
    public void imprimirDetalhes() {
        super.imprimirDetalhes();
        System.out.print(this.unidadeMedida  + " | " + this.calorias + "Kcal ] : ");
        if (this.unidadeMedida.equals(GRAMAS)){
            System.out.println(this.quantidade + " g.");
        } else if (this.unidadeMedida.equals(LITROS)) {
            System.out.println(this.quantidade + " L.");
        } else if (this.unidadeMedida.equals(UNIDADES)) {
            System.out.println(this.quantidade + " uni.");
        }
    }

    public double getCalorias() {
        return calorias;
    }

}
