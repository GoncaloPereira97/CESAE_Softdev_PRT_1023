package Pizzaria;

import static Pizzaria.Enums.UnidadeMedida.*;

public class QuantidadeIngrediente {

    private Ingredientes ingrediente;

    private double quantidade;

    public QuantidadeIngrediente(Ingredientes ingrediente, double quantidade) {
        this.ingrediente = ingrediente;
        this.quantidade = quantidade;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public Ingredientes getIngrediente() {
        return ingrediente;
    }

    /**
     * Método para imprimir os detalhes de um ingrediente
     */
    public void imprimirDetalhes(){
            if (ingrediente instanceof IngredienteBase) {
                ((IngredienteBase) ingrediente).imprimirDetalhesBase();
            }
            if (ingrediente instanceof Queijo) {
                ((Queijo) ingrediente).imprimirDetalhesQueijo();
            }
            if (ingrediente instanceof Carne) {
                ((Carne) ingrediente).imprimirDetalhesCarne();
            }
            if (ingrediente instanceof Vegetal) {
                ((Vegetal) ingrediente).imprimirDetalhesVegetal();
            }
            if (ingrediente instanceof FrutoMar) {
                ((FrutoMar) ingrediente).imprimirDetalhesFrutoMar();
            }
        System.out.print(" | " + this.ingrediente.getUnidadeMedida()  + " | " + this.ingrediente.getCalorias() + "Kcal ] : ");
        if (this.ingrediente.getUnidadeMedida().equals(GRAMAS)){
            System.out.println(this.quantidade + " g.");
        } else if (this.ingrediente.getUnidadeMedida().equals(LITROS)) {
            System.out.println(this.quantidade + " L.");
        } else if (this.ingrediente.getUnidadeMedida().equals(UNIDADES)) {
            System.out.println(this.quantidade + " uni.");
        }

    }
}
