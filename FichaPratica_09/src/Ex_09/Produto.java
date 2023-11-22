package Ex_09;

public class Produto {

    private String Nome;
    private double preco;
    private int stock;

    public Produto(String nome, double preco) {
        Nome = nome;
        this.preco = preco;
        this.stock = 0;
    }

    public String getNome() {
        return Nome;
    }

    public int getStock() {
        return stock;
    }

    public int comprar(int quantidade) {
        this.stock += quantidade;
        System.out.println("Compra efectuada com sucesso.");
        return this.stock;
    }

    public int vender(int quantidade) {
        if (quantidade > this.stock) {
            System.out.println("Pedimos desculpa mas não temos unidades suficientes de stock.");

        } else {
            System.out.println("Venda efectuada com sucesso.");
            this.stock -= quantidade;
        }
        return this.stock;
    }
}
