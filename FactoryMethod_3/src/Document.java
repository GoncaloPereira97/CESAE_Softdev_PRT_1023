public abstract class Document {

    private String autor;

    private String nome;

    private String ext;

    public Document(String autor, String nome, String ext) {
        this.autor = autor;
        this.nome = nome;
        this.ext = ext;
    }

    public abstract void open();

    public abstract void escrever();

    public abstract void close();


}
