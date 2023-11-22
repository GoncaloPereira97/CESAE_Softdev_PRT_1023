package Ex_03;

import java.util.ArrayList;

public class BarcoPesca {
    private String nome;

    private int tripulantes;
    private double capacidade;

    private Marca marca;

    private ArrayList<Peixe> peixesPescados = new ArrayList<Peixe>();

    private ArrayList<Marisco> mariscoPescado = new ArrayList<Marisco>();

    public BarcoPesca(String nome, int tripulantes, double capacidade, Marca marca) {
        this.nome = nome;
        this.tripulantes = tripulantes;
        this.capacidade = capacidade;
        this.marca = marca;
    }

    public void pescarPeixe(Peixe peixe){
        if (capacidade > peixe.getPeso()){
            peixesPescados.add(peixe);
            capacidade -= peixe.getPeso();
        } else System.out.println("Sem capacidade para carregar o peixe.");

    }
    public void apanharMarisco(Marisco marisco){
        if (capacidade > marisco.getPeso()){
            mariscoPescado.add(marisco);
            capacidade -= marisco.getPeso();
        } else System.out.println("Sem capacidade para carregar o marisco.");

    }

    public void largarPeixe(int indice){
        peixesPescados.remove(indice);
    }
    public void largarMarisco(int indice){
        mariscoPescado.remove(indice);
    }

    public double calcularTotal(){
        double total=0;
        for (int cont = 0; cont < peixesPescados.size(); cont++) {
            total += peixesPescados.get(cont).getPreco();
        }
        for (int cont = 0; cont < mariscoPescado.size(); cont++) {
            total += mariscoPescado.get(cont).getPreco();
        }
        return total;
    }

    public double calcularSalarios(){
        double dinheiro = calcularTotal() - (calcularTotal()*0.40);
        return dinheiro / (tripulantes - 1);
    }
}
