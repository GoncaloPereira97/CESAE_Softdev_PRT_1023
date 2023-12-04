public class Inseto extends SerVivo{
    private boolean venenoso;

    public Inseto(String nome, String especie, String pais, int idade, boolean venenoso) {
        super(nome, especie, pais, idade);
        this.venenoso = venenoso;
    }
}
