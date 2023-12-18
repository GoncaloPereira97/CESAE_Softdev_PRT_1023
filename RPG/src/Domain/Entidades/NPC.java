package Domain.Entidades;

import Domain.Items.ItemHeroi;
import Repository.ItemRepository;

public class NPC extends Entidade{

    private String tipoNPC;
    public NPC(String tipoNPC, String nome, int maxHP, int HP, int strength, int inteligence, int dexterity, ItemHeroi primaryWeapon) {
        super(nome, maxHP, HP, strength, inteligence, dexterity, primaryWeapon);
        this.tipoNPC = tipoNPC;
        ItemRepository itemRepository = new ItemRepository();
        this.inventario = itemRepository.getArrayItems();
    }


}
