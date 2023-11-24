package Pizzaria;

import Pizzaria.Enums.TamanhoPizza;
import Pizzaria.Enums.UnidadeMedida;

import static Pizzaria.Enums.TamanhoPizza.GRANDE;
import static Pizzaria.Enums.UnidadeMedida.GRAMAS;
import static Pizzaria.Enums.UnidadeMedida.LITROS;

public class Main {
    public static void main(String[] args) {
        ConstruirPizza pepperoni = new ConstruirPizza(1,"Pizza Pepperoni");
        Pizza nova = new Pizza(132, "Pizza Pepperoni", GRANDE, 19.90,"Pizza Tradicional de Pepperoni");

        Ingredientes pep = new Ingredientes(543, "Pepperoni", GRAMAS, 230,300);
        Ingredientes queijo = new Ingredientes(7652, "Queijo", GRAMAS, 134,200);
        Ingredientes tomate = new Ingredientes(2345, "Molho Tomate", LITROS, 30,0.09);


        pepperoni.addIngredientes(pep);
        pepperoni.addIngredientes(queijo);
        pepperoni.addIngredientes(tomate);

        pepperoni.tipoPizza(nova);

        pepperoni.imprimirPizza();

        pepperoni.retirarIngredientes(7652);

        pepperoni.imprimirPizza();


    }
}
