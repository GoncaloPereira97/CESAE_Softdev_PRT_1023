package Pizzaria;

import Pizzaria.Enums.TamanhoPizza;

import java.util.ArrayList;

public class ConstruirPizza {

    private int id;

    private String nome;

    private ArrayList<Ingredientes> ingredientes;

    private Pizza detalhesPizza;


    public ConstruirPizza(int id, String nome) {
        this.id = id;
        this.nome = nome;
        this.ingredientes = new ArrayList<Ingredientes>();
    }

    public void tipoPizza(Pizza pizza){
        detalhesPizza = pizza;
    }
    public void addIngredientes(Ingredientes ingrediente){
        ingredientes.add(ingrediente);
    }

    public int getId() {
        return id;
    }

    public void imprimirPizza(){
        System.out.println("Código: " + this.id);
        detalhesPizza.imprimirDetalhes();
        for (int cont = 0; cont < ingredientes.size(); cont++) {
            System.out.print("Ingrediente " +  (cont + 1) + ":");
            ingredientes.get(cont).imprimirDetalhes();
        }
    }

    public void retirarIngredientes(int id){
        for (int cont = 0; cont < ingredientes.size(); cont++) {
            if (ingredientes.get(cont).getId() == id){
                ingredientes.remove(cont);
            }
        }
    }

    public void imprimirDetalhes(){
        System.out.print("[ " + this.id + " | " + this.nome + " | ");
    }

    public double caloriasPizza(){
        double totalCalorias=0;
        for (int cont = 0; cont < ingredientes.size(); cont++) {
            totalCalorias += ingredientes.get(cont).getCalorias();
        }
        return totalCalorias;
    }

}
