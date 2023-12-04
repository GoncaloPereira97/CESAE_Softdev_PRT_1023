package Pizzaria;

import Pizzaria.Enums.TamanhoPizza;
import Pizzaria.Enums.UnidadeMedida;

import static Pizzaria.Enums.UnidadeMedida.*;

public class Ingredientes{

    private int id;

    private String nome;

    private UnidadeMedida unidadeMedida;

    private double calorias;



    public Ingredientes(int id, String nome, UnidadeMedida unidadeMedida, double calorias) {
        this.id = id;
        this.nome = nome;
        this.unidadeMedida = unidadeMedida;
        this.calorias = calorias;
    }

    public int getId() {
        return id;
    }
    public String getNome() {
        return nome;
    }
    public double getCalorias() {
        return calorias;
    }
    public UnidadeMedida getUnidadeMedida() {
        return unidadeMedida;
    }


}
