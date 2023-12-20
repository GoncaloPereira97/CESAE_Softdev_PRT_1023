package Domain.Entidades;

import Domain.Items.Armas;
import Domain.Items.ArmasLendarias;
import Domain.Items.ItemHeroi;
import Repository.ItemRepository;

import java.util.ArrayList;
import java.util.Random;

public class NPC extends Entidade{

    private String tipoNPC;
    public NPC(String tipoNPC, String nome, int maxHP, int HP, int strength, int inteligence, int dexterity, Armas primaryWeapon) {
        super(nome, maxHP, HP, strength, inteligence, dexterity, primaryWeapon);
        this.tipoNPC = tipoNPC;
        if (tipoNPC.equalsIgnoreCase("vendedor")) {
            inventarioVendedor();
        } else inventarioInimigo();
    }

    private void inventarioVendedor(){
        ArrayList<ItemHeroi> arrayInventario = new ItemRepository().getArrayItems();
        for (ItemHeroi itemHeroi : arrayInventario) {
            if (!(itemHeroi instanceof ArmasLendarias)) {
                addItemInventario(itemHeroi);
            }
        }
    }

    private void inventarioInimigo(){

    }

}
