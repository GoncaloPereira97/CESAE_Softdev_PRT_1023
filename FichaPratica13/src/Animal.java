import Enums.Alimentacao;

public class Animal extends SerVivo{

    private boolean fome;

    private double peso;

    private double inteligencia;

    private Alimentacao alimentacao;

    private String barulho;

    public Animal(String nome, String especie, String pais, int idade, boolean fome, double peso, double inteligencia, Alimentacao alimentacao, String barulho) {
        super(nome, especie, pais, idade);
        this.fome = fome;
        this.peso = peso;
        if (inteligencia <= 100 && inteligencia >= 0) {
            this.inteligencia = inteligencia;
        } else System.out.println("Grau de inteligencia apenas pode ir até 100");
        this.alimentacao = alimentacao;
        this.barulho = barulho;
    }
}
