package Ex_02;

public class Cao {
    private String nome;
    private String raca;
    private String latido;

    public void ladrar(){
        System.out.println(this.latido);
    }

    public Cao(String nome, String raca) {
        this.nome = nome;
        this.raca = raca;
        this.latido = "Au Au Au";
    }

    public void setLatido(String latido) {
        this.latido = latido;
    }
}
