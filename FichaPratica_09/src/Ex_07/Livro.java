package Ex_07;

public class Livro {

    private String titulo;
    private String autor;
    private String categoria;
    private int numPaginas;
    private String isbn;

    public Livro(String titulo, String autos, String categoria, int numPaginas, String isbn) {
        this.titulo = titulo;
        this.autor = autos;
        this.categoria = categoria;
        this.numPaginas = numPaginas;
        this.isbn = isbn;
    }

    public void exibirDetalhes(){
        System.out.println("Titulo: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("Categoria: " +this.categoria);
        System.out.println("Paginas: " +this.numPaginas);
        System.out.println("ISBN: " +this.isbn + "\n");

    }
}
