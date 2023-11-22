package Ex_01;

public class Musica {

    private String titulo;
    private String genero;
    private String artista;
    private int duracao;

    public Musica(String titulo, String genero, String artista, int duracao) {
        this.titulo = titulo;
        this.genero = genero;
        this.artista = artista;
        this.duracao = duracao;
    }

    public int getDuracao() {
        return duracao;
    }

    public void detalhesMusica(){
        System.out.println("Titulo: " + this.titulo);
        System.out.println("Genero: " + this.genero);
        System.out.println("Artista: " + this.artista);
        System.out.println("Duração: " + this.duracao);
    }
}
