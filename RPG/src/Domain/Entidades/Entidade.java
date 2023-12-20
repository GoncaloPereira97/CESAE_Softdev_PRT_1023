package Domain.Entidades;

import Domain.Items.Armas;
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

    protected Armas primaryWeapon;

    protected int xp;

    protected ArrayList<ItemHeroi> inventario;

    public Entidade(String nome, int maxHP, int HP, int strength, int inteligence, int dexterity, int level, int gold, Armas primaryWeapon, int xp) {
        this.nome = nome;
        this.maxHP = maxHP;
        this.HP = HP;
        this.strength = strength;
        this.inteligence = inteligence;
        this.dexterity = dexterity;
        this.level = level;
        this.gold = gold;
        this.xp = 0;
        this.primaryWeapon = primaryWeapon;
        this.inventario = new ArrayList<ItemHeroi>();
    }

    public Entidade(String nome, int maxHP, int HP, int strength, int inteligence, int dexterity, Armas primaryWeapon) {
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
            this.maxHP += 10;
        }
    }

    public void addItemInventario(ItemHeroi item){
        this.inventario.add(item);
    }

    public String getNome() {
        return nome;
    }

    public int getMaxHP() {
        return maxHP;
    }

    public int getHP() {
        return HP;
    }

    public int getStrength() {
        return strength;
    }

    public int getInteligence() {
        return inteligence;
    }

    public int getDexterity() {
        return dexterity;
    }

    public int getLevel() {
        return level;
    }

    public int getGold() {
        return gold;
    }

    public int getXp() {return xp;}
    public Armas getPrimaryWeapon() {
        return primaryWeapon;
    }
    public void setMaxHP(int maxHP) {
        this.maxHP = maxHP;
    }

    public void receberHeal(int heal) {
        if (this.HP + heal > this.maxHP) {
            this.HP = this.maxHP;
        } else {
            this.HP += heal;
        }
    }

    public void levarDMG(int dmg){
        if (this.HP - dmg <= 0){
            // TODO: 20/12/2023 PROGRAMAR A MORTE!
            this.HP = 0;
            System.out.println(" ");
        } else {
            this.HP -= dmg;
        }
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void setInteligence(int inteligence) {
        this.inteligence = inteligence;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public void setPrimaryWeapon(Armas primaryWeapon) {
        this.primaryWeapon = primaryWeapon;
    }

    public void setInventario(ArrayList<ItemHeroi> inventario) {
        this.inventario = inventario;
    }





    public ArrayList<ItemHeroi> getInventario() {
        return inventario;
    }
}
