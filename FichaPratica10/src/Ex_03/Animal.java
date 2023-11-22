package Ex_03;

public class Animal {
    private String nome;
    private String especie;
    private String paisOrigem;
    private double peso;
    private String[] alimentacao;

    public Animal(String nome, String especie, String paisOrigem, double peso, String[] alimentacao) {
        this.nome = nome;
        this.especie = especie;
        this.paisOrigem = paisOrigem;
        this.peso = peso;
        this.alimentacao = alimentacao;
    }

    public double getPeso() {
        return peso;
    }

    public boolean comer(String comida, double pesoComida){
        double pesoComidaKG = pesoComida/1000;
        boolean comer = false;
        for (int cont = 0; cont < this.alimentacao.length; cont++){
            if (this.alimentacao[cont].equalsIgnoreCase(comida) && !comer){
                this.peso += pesoComidaKG;
                return true;
            }
        }
        return false;



    }
}
