package Pizzaria;

import Pizzaria.Enums.*;

import static Pizzaria.Enums.TamanhoPizza.*;
import static Pizzaria.Enums.UnidadeMedida.*;


public class Main {
    public static void main(String[] args) {
        Pizza pizza1 = new Pizza(1,"Pepperoni", GRANDE, 19.90, "Pizza gostosa de pepperoni");
        Queijo queijo = new Queijo(234, "Queijo", GRAMAS, 2.9, OrigemIngrediente.NACIONAL, TipoQueijo.SERRA);
        Carne carne = new Carne(435, "Carne", GRAMAS, 169, OrigemIngrediente.IMPORTADO, TipoCarne.VACA);
        FrutoMar frutoMar = new FrutoMar(894, "Peixe", GRAMAS, 123, OrigemIngrediente.NACIONAL, TipoFrutosMar.ATUM);
        Vegetal salsa = new Vegetal(394, "Fruta", UNIDADES, 30, OrigemIngrediente.NACIONAL, TipoVegetal.ANANAS);
        IngredienteBase massa = new IngredienteBase(40, "Massa", 32,MassaPizza.ALTA);

        pizza1.addIngrediente(new QuantidadeIngrediente(massa, 5));
        pizza1.addIngrediente(new QuantidadeIngrediente(carne, 200));
        pizza1.addIngrediente(new QuantidadeIngrediente(salsa, 100));
        pizza1.addIngrediente(new QuantidadeIngrediente(queijo, 200));
        pizza1.addIngrediente(new QuantidadeIngrediente(frutoMar,100));
        pizza1.tipoPizza();
        pizza1.imprimirDetalhes();
        System.out.println("Calorias: " + pizza1.caloriasPizza());
        pizza1.retirarIngredientes(234);
        pizza1.imprimirDetalhes();
    }
}
