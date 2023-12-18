package Domain;

import Controllers.AtackStrategy;

import java.util.ArrayList;

public class Item {

    private String tipo;
    private String nome;
    private int preco;
    private ArrayList <String> heroisPermitidos;
    private int ataque;
    private int ataqueEspecial;
    private int ataqueInstantaneo;
    private int vida;
    private int primaryStat;


    public Item(String tipo, String nome, int preco, int ataque, int ataqueEspecial, int ataqueInstantaneo, int vida, int primaryStat) {
        this.tipo = tipo;
        this.nome = nome;
        this.preco = preco;
        this.heroisPermitidos = new ArrayList<>();
        this.ataque = ataque;
        this.ataqueEspecial = ataqueEspecial;
        this.ataqueInstantaneo = ataqueInstantaneo;
        this.vida = vida;
        this.primaryStat = primaryStat;
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

    public int getAtaque() {
        return ataque;
    }

    public int getAtaqueEspecial() {
        return ataqueEspecial;
    }

    public int getAtaqueInstantaneo() {
        return ataqueInstantaneo;
    }

    public int getVida() {
        return vida;
    }

    public int getPrimaryStat() {
        return primaryStat;
    }

    public void itemDetails(){
        System.out.print(this.tipo + "\t | " + this.nome + " | " + this.preco + " | ");
        for (String heroiAtual: heroisPermitidos) {
            System.out.println(heroiAtual + " | ");
        }
        System.out.println(this.ataque + " | " + this.ataqueEspecial + " | " + this.ataqueInstantaneo + " | " + this.vida + " | " + this.primaryStat);
    }
}
