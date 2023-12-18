package Domain.Items;

import java.util.ArrayList;

public abstract class ItemHeroi {

    private String tipo;
    private String nome;
    private int preco;
    private ArrayList <String> heroisPermitidos;

    public ItemHeroi(String tipo, String nome, int preco) {
        this.tipo = tipo;
        this.nome = nome;
        this.preco = preco;
        this.heroisPermitidos = new ArrayList<>();
    }

    public void addHeroiPermitido(String atackStrategy){
        heroisPermitidos.add(atackStrategy);
    }

    public String getTipo() {
        return tipo;
    }

    public String getNome() {
        return nome;
    }

    public int getPreco() {
        return preco;
    }

    public ArrayList<String> getHeroisPermitidos() {
        return heroisPermitidos;
    }




    public void itemDetails(){
        System.out.print(this.tipo + "\t | " + this.nome + " | " + this.preco + " | ");
        for (String heroiAtual: heroisPermitidos) {
            System.out.println(heroiAtual + " | ");
        }
    }
}
