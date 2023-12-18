package Domain;

import Controllers.AtackStrategy;
import Controllers.CaracterCreation;

public class Heroi extends Entidade{

    private static Heroi instance;

    private AtackStrategy classType;

    private Heroi(String nome, int maxHP, int HP, int strength, int inteligence, int dexterity, int level, int gold, Item primaryWeapon, AtackStrategy classType) {
        super(nome, maxHP, HP, strength, inteligence, dexterity, level, gold, primaryWeapon);
        this.classType = classType;
    }

    public static Heroi getInstance() {
        if (instance == null){

        }


        return instance;
    }
}
