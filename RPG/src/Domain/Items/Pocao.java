package Domain.Items;

public class Pocao extends Consumivel{

    private int vida;

    private int primaryStat;
    public Pocao(String tipo, String nome, int preco, int vida, int primaryStat) {
        super(tipo, nome, preco);
        this.vida = vida;
        this.primaryStat = primaryStat;
    }

    @Override
    public void itemDetails() {
        super.itemDetails();
        System.out.println("heal: +" + this.vida + " | Primary Stat: +" + this.primaryStat);
    }
}
