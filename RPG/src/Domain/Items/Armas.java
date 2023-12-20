package Domain.Items;

public class Armas extends ItemHeroi{
    private int ataque;

    private int ataqueEspecial;

    private int vida;

    private int primaryStat;

    public Armas(String tipo, String nome, int preco, int ataque, int ataqueEspecial,int vida ,int primaryStat) {
        super(tipo, nome, preco);
        this.ataque = ataque;
        this.ataqueEspecial = ataqueEspecial;
        this.vida = vida;
        this.primaryStat = primaryStat;
    }

    public int getAtaque() {
        return this.ataque;
    }

    public int getAtaqueEspecial() {
        return ataqueEspecial;
    }


    @Override
    public void itemDetails() {
        super.itemDetails();
        System.out.println("Ataque: " + this.ataque + " | Ataque Especial: " + this.ataqueEspecial + " | maxHP: +" + this.vida + " | Primary stat: +" + this.primaryStat);
    }
}
