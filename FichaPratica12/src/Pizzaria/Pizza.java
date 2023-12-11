package Pizzaria;

import Pizzaria.Enums.MassaPizza;
import Pizzaria.Enums.TamanhoPizza;

import java.util.ArrayList;
import java.util.Collections;

public class Pizza {

    private int id;

    private String nome;

    private ArrayList<QuantidadeIngrediente> ingredientes;


    private TamanhoPizza tamanhoPizza;

    private double preco;
    private String descricao;

    private String tipoPizza;


    public Pizza(int id, String nome, TamanhoPizza tamanhoPizza, double preco, String descricao) {
        this.id = id;
        this.nome = nome;
        this.ingredientes = new ArrayList<>(5);
        this.tamanhoPizza = tamanhoPizza;
        this.preco = preco;
        this.descricao = descricao;
        this.tipoPizza = "Ainda não foi avaliada.";
    }

    /**
     * Método para adicionar ingredientes na pizza
     * @param ingrediente Recebe o ingrediente que pretende adicionar
     */
    public void addIngrediente(QuantidadeIngrediente ingrediente) {
        boolean ingredienteBase = false;
        for (QuantidadeIngrediente quantidadeIngrediente : ingredientes) {
            if (quantidadeIngrediente.getIngrediente() instanceof IngredienteBase) {
                ingredienteBase = true;
                break;
            }
        }
        if (ingredienteBase && ingrediente.getIngrediente() instanceof Topping) {
            ingredientes.add(ingrediente);
            System.out.println("Ingrediente adicionado com sucesso.\n");
        } else if (!ingredienteBase && ingrediente.getIngrediente() instanceof IngredienteBase) {
            ingredientes.add(ingrediente);
            System.out.println("Massa adicionada com sucesso.\n");
        } else if (ingredienteBase && ingrediente.getIngrediente() instanceof IngredienteBase) {
            System.out.println("Não foi possivel adicionar o ingrediente porque a pizza ja tem base\n");
        } else System.out.println("Não foi possivel adicionar o ingrediente porque a pizza ainda não tem base\n");
    }

    /**
     * Método para retirar ingredientes da pizza
     * @param id Recebe o id do ingrediente que pretende retirar
     */
    public void retirarIngredientes ( int id){
            for (int cont = 0; cont < ingredientes.size(); cont++) {
                if (ingredientes.get(cont).getIngrediente() instanceof IngredienteBase && ingredientes.get(cont).getIngrediente().getId() == id){
                    System.out.println("Não é possivel retirar a massa da pizza.");
                    return;
                } else  if (ingredientes.get(cont).getIngrediente().getId() == id) {
                    ingredientes.remove(cont);
                    System.out.println("Ingrediente retirado com sucesso.");
                    return;
                }
            }
        System.out.println("A operação não é válida, não encontrámos o ingrediente que pretende retirar");
        }

    /**
     * Método para calcular o total de calorias da pizza
     * @return Retorna o total de calorias da pizza
     */
    public double caloriasPizza () {
            double totalCalorias = 0;
        for (QuantidadeIngrediente ingrediente : ingredientes) {
            totalCalorias += (ingrediente.getIngrediente().getCalorias() * ingrediente.getQuantidade());
        }
            return totalCalorias;
        }

    /**
     * Método para imprimir todos os detalhes da pizza
     */
    public void imprimirDetalhes () {
        int cont = 1;
            System.out.println("Código: " + this.id);
            System.out.println("Descrição: " + this.descricao);
            System.out.println("Preço: " + this.preco);
            System.out.println("Tamanho: " + this.tamanhoPizza);
            for (QuantidadeIngrediente ingredienteAtual : this.ingredientes) {
                System.out.print("Ingrediente " + cont + ":");
                ingredienteAtual.imprimirDetalhes();
                cont++;
            }
            System.out.println("Tipo de Pizza: " + this.tipoPizza + "\n");
        }

    /**
     * Método para avaliar o tipo de pizza e gravar nos seus detalhes
     */
    public void tipoPizza () {
            boolean carne = false, vegetal = false, frutoMar = false, queijo = false;

            for (QuantidadeIngrediente ingrediente : ingredientes) {
                if (ingrediente.getIngrediente() instanceof Queijo) {
                    queijo = true;
                }
                if (ingrediente.getIngrediente() instanceof Carne) {
                    carne = true;
                }
                if (ingrediente.getIngrediente() instanceof FrutoMar) {
                    frutoMar = true;
                }
                if (ingrediente.getIngrediente() instanceof Vegetal) {
                    vegetal = true;
                }
            }

            if (carne && !vegetal && !frutoMar && !queijo) {
                this.tipoPizza = "Pizza de Carne";
            } else if (!carne && vegetal && !frutoMar && !queijo) {
                this.tipoPizza = "Pizza de Vegetais";
            } else if (!carne && !vegetal && frutoMar && !queijo) {
                this.tipoPizza = "Pizza de Frutos do Mar";
            } else if (!carne && !vegetal && !frutoMar && queijo) {
                this.tipoPizza = "Pizza de Queijo";
            } else if (carne && vegetal && frutoMar && queijo) {
                this.tipoPizza = "Pizza Completa";
            } else this.tipoPizza = "Pizza Mista";

        }

    }
