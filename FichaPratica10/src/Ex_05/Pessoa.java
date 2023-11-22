package Ex_05;

public class Pessoa {
    private String nome;
    private int idade;
    private String email;
    private int numtel;

    public Pessoa(String nome, int idade, String email, int numtel) {
        this.nome = nome;
        this.idade = idade;
        this.email = email;
        this.numtel = numtel;
    }

    public void imprimirDetalhes(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Email: " + this.email);
        System.out.println("Telemovel: " + this.numtel);
        System.out.println("\n");


    }
}
