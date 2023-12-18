package Domain.Items;

public class ItemCombate extends Consumivel{

    private int ataqueInstantaneo;

    public ItemCombate(String tipo, String nome, int preco,int ataqueInstantaneo) {
        super(tipo, nome, preco);
        this.ataqueInstantaneo = ataqueInstantaneo;
    }

    @Override
    public void itemDetails() {
        super.itemDetails();
        System.out.println("Damage: " + this.ataqueInstantaneo);
    }
}
