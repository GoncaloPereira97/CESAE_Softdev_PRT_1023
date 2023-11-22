package Ex_03;

public class Peixe {
    private String especie;
    private double peso;
    private double preco;

    public Peixe(String especie, double peso, double preco) {
        this.especie = especie;
        this.peso = peso;
        this.preco = preco;
    }

    public double getPeso() {
        return peso;
    }

    public double getPreco() {
        return preco;
    }
}
