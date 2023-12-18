package Domain.Entidades;

import Domain.Items.ItemHeroi;

import java.util.ArrayList;

public abstract class Entidade {

    protected String nome;

    protected int maxHP;

    protected int HP;

    protected int strength;

    protected int inteligence;

    protected int dexterity;

    protected int level;

    protected int gold;

    protected ItemHeroi primaryWeapon;

    protected int xp = 0;

    protected ArrayList<ItemHeroi> inventario;

    public Entidade(String nome, int maxHP, int HP, int strength, int inteligence, int dexterity, int level, int gold, ItemHeroi primaryWeapon, int xp) {
        this.nome = nome;
        this.maxHP = maxHP;
        this.HP = HP;
        this.strength = strength;
        this.inteligence = inteligence;
        this.dexterity = dexterity;
        this.level = level;
        this.gold = gold;
        this.xp = xp;
        this.primaryWeapon = primaryWeapon;
        this.inventario = new ArrayList<ItemHeroi>();
    }

    public Entidade(String nome, int maxHP, int HP, int strength, int inteligence, int dexterity, ItemHeroi primaryWeapon) {
        this.nome = nome;
        this.maxHP = maxHP;
        this.HP = HP;
        this.strength = strength;
        this.inteligence = inteligence;
        this.dexterity = dexterity;
        this.level = 1;
        this.gold = 10;
        this.primaryWeapon = primaryWeapon;
        this.xp = 1;
        this.inventario = new ArrayList<>();
    }

    public void setXp(int xp) {
        this.xp++;
        if (xp == 5){
            this.level++;
            this.strength += 2;
            this.dexterity += 2;
            this.inteligence += 2;
        }
    }

    public void addItemInventario(ItemHeroi item){
        this.inventario.add(item);
    }
}
