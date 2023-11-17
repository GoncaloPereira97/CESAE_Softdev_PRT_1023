package Ex_08;

public class Aluno {

    private String nome;

    private int idade;

    private String curso;

    private double media;

    public Aluno(String nome, int idade, String curso, double media) {
        this.nome = nome;
        this.idade = idade;
        this.curso = curso;
        this.media = media;
    }

    public void aprovado(){
        if (this.media > 9.5){
            System.out.println(this.nome + ": Aprovado");
        } else System.out.println(this.nome + ": Reprovado");
    }
}
