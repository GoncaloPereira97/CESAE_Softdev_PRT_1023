package Pizzaria;

import Pizzaria.Enums.MassaPizza;
import Pizzaria.Enums.TamanhoPizza;

import java.util.ArrayList;

public class Pizza extends ConstruirPizza{

    private TamanhoPizza tamanhoPizza;

    private double preco;
    private String descricao;

    private MassaPizza massaPizza;

    public Pizza(int id, String nome, TamanhoPizza tamanhoPizza, double preco, String descricao, MassaPizza massaPizza) {
        super(id, nome);
        this.tamanhoPizza = tamanhoPizza;
        this.preco = preco;
        this.descricao = descricao;
        this.massaPizza = massaPizza;
    }

    public void imprimirDetalhes(){
        System.out.println("Descrição: " + this.descricao);
        System.out.println("Preço: " + this.preco);
        System.out.println("Tamanho: " + this.tamanhoPizza);
    }
}
