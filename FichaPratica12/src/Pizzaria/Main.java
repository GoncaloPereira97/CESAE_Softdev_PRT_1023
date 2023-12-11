package Pizzaria;

<<<<<<< HEAD
import Pizzaria.Enums.MassaPizza;
import Pizzaria.Enums.TamanhoPizza;
import Pizzaria.Enums.UnidadeMedida;
=======
import Pizzaria.Enums.*;

import static Pizzaria.Enums.TamanhoPizza.*;
import static Pizzaria.Enums.UnidadeMedida.*;
>>>>>>> 5a66311b46d91f0962494e198fa6884b4eb52513


public class Main {
    public static void main(String[] args) {
<<<<<<< HEAD
        ConstruirPizza pepperoni = new ConstruirPizza(1,"Pizza Pepperoni");
        Pizza nova = new Pizza(132, "Pizza Pepperoni", GRANDE, 19.90,"Pizza Tradicional de Pepperoni", MassaPizza.ALTA);

        Ingredientes pep = new Ingredientes(543, "Pepperoni", GRAMAS, 230,300);
        Ingredientes queijo = new Ingredientes(7652, "Queijo", GRAMAS, 134,200);
        Ingredientes tomate = new Ingredientes(2345, "Molho Tomate", LITROS, 30,0.09);
//        Ingredientes leok = new Pizza(21,"GRANDE",GRANDE, 1.1,"sdfsfsdfs", MassaPizza.ALTA );

        pepperoni.addIngredientes(pep);
        pepperoni.addIngredientes(queijo);
        pepperoni.addIngredientes(tomate);

        pepperoni.tipoPizza(nova);

        pepperoni.imprimirPizza();

        pepperoni.retirarIngredientes(7652);

        pepperoni.imprimirPizza();

=======
        Pizza pizza1 = new Pizza(1,"Pepperoni", GRANDE, 19.90, "Pizza gostosa de pepperoni");
        Queijo queijo = new Queijo(234, "Queijo", GRAMAS, 2.9, OrigemIngrediente.NACIONAL, TipoQueijo.SERRA);
        Carne carne = new Carne(435, "Carne", GRAMAS, 169, OrigemIngrediente.IMPORTADO, TipoCarne.VACA);
        FrutoMar frutoMar = new FrutoMar(894, "Peixe", GRAMAS, 123, OrigemIngrediente.NACIONAL, TipoFrutosMar.ATUM);
        Vegetal salsa = new Vegetal(394, "Fruta", UNIDADES, 30, OrigemIngrediente.NACIONAL, TipoVegetal.ANANAS);
        IngredienteBase massa = new IngredienteBase(40, "Massa", 32,MassaPizza.ALTA);
>>>>>>> 5a66311b46d91f0962494e198fa6884b4eb52513

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
