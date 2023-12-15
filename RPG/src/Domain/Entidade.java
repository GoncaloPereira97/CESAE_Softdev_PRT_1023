package Domain;

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

    protected Item primaryWeapon;

    protected int xp = 0;

    protected ArrayList<Item> inventario;

    public Entidade(String nome, int maxHP, int HP, int strength, int inteligence, int dexterity, int level, int gold, Item primaryWeapon) {
        this.nome = nome;
        this.maxHP = maxHP;
        this.HP = HP;
        this.strength = strength;
        this.inteligence = inteligence;
        this.dexterity = dexterity;
        this.level = level;
        this.gold = gold;
        this.primaryWeapon = primaryWeapon;
        this.inventario = new ArrayList<Item>();
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
}
