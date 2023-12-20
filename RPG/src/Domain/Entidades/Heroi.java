package Domain.Entidades;

import Controllers.AtackStrategy.FightStrategy;
import Domain.Items.Armas;
import Domain.Items.ItemHeroi;

public class Heroi extends Entidade{

    private static Heroi instance;

    private FightStrategy classType;

    private Heroi(String nome, int maxHP, int HP, int strength, int inteligence, int dexterity, Armas primaryWeapon, FightStrategy classType) {
        super(nome, maxHP, HP, strength, inteligence, dexterity, primaryWeapon);
        this.classType = classType;
    }

    public static Heroi getInstance(String nome, int maxHP, int HP, int strength, int inteligence, int dexterity, Armas primaryWeapon, FightStrategy classType) {
        if (instance == null){
        instance = new Heroi(nome, maxHP, HP, strength, inteligence, dexterity, primaryWeapon, classType);
        }

        return instance;
    }

    public FightStrategy getClassType() {
        return classType;
    }
}
