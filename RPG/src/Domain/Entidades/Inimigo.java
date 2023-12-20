package Domain.Entidades;

import Domain.Items.Armas;
import Domain.Items.ArmasLendarias;
import Domain.Items.ItemHeroi;
import Repository.ItemRepository;

import java.util.ArrayList;
import java.util.Random;

public class Inimigo extends NPC{

    private String classNPC;


    public Inimigo(String tipoNPC, String nome, int maxHP, int HP, int strength, int inteligence, int dexterity, Armas primaryWeapon, String classNPC) {
        super(tipoNPC, nome, maxHP, HP, strength, inteligence, dexterity, primaryWeapon);
        this.classNPC = classNPC;
        equiparNPC();
    }

    public void equiparNPC(){
        ArrayList<ItemHeroi> arrayInventario = new ItemRepository().getArrayItems();
        int random = new Random().nextInt(0,arrayInventario.size());
        while (arrayInventario.get(random) instanceof ArmasLendarias) {
            random = new Random().nextInt(0, arrayInventario.size());
        }
        addItemInventario(arrayInventario.get(random));
        while (!(arrayInventario.get(random).getTipo().equalsIgnoreCase("ArmaPrincipal")) && !arrayInventario.get(random).getHeroisPermitidos().contains(this.classNPC)) {
            random = new Random().nextInt(0, arrayInventario.size());
        }
        this.primaryWeapon = (Armas) arrayInventario.get(random);
    }

    public String getClassNPC() {
        return classNPC;
    }
}
