package Pizzaria;

import Pizzaria.Enums.TamanhoPizza;
import Pizzaria.Enums.UnidadeMedida;

import static Pizzaria.Enums.UnidadeMedida.*;

public class Ingredientes{

    private int id;

    private String nome;

    private UnidadeMedida unidadeMedida;

    private double calorias;



<<<<<<< HEAD
    public Ingredientes(int id, String nome, UnidadeMedida unidadeMedida, double calorias, double quantidade) {
        super(id, nome);
=======
    public Ingredientes(int id, String nome, UnidadeMedida unidadeMedida, double calorias) {
        this.id = id;
        this.nome = nome;
>>>>>>> 5a66311b46d91f0962494e198fa6884b4eb52513
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
