package Controllers.CaracterCreation;

import Controllers.AtackStrategy.*;
import Domain.Entidades.Heroi;
import Domain.Items.Armas;
import Domain.Items.ItemHeroi;
import Repository.ItemRepository;

import java.util.Locale;
import java.util.Scanner;

public class MedievalStrategy implements CreationInterface{
    @Override
    public Heroi caracterCreator() {
        Scanner input = new Scanner(System.in);

        ItemRepository itemRepository = new ItemRepository();
        String classHeroi = "", nome;
        Heroi heroi = null;
        int maxHP,HP,strength,inteligence,dexterity;
        Armas primaryWeapon = null;


        System.out.println("\t***Caracter Creation***");
        System.out.println("Escolhe o nome do heroi: ");
        nome = input.next();
        do {
            System.out.println("Escolhe a classe do teu heroi: (BARBARIAN)(WIZARD)(RANGER)");
            classHeroi = input.next().toLowerCase(Locale.ROOT);

            switch (classHeroi){
                case "barbarian":
                    maxHP = 40;
                    HP = 40;
                    strength = 10;
                    inteligence = 5;
                    dexterity = 5;
                    primaryWeapon = (Armas) itemRepository.procurarItem("Chicote de Armas");
                    heroi= Heroi.getInstance(nome, maxHP, HP, strength, inteligence, dexterity, primaryWeapon,new BarbarianStrategy());
                    break;
                case "wizard":
                    maxHP = 40;
                    HP = 40;
                    strength = 5;
                    inteligence = 10;
                    dexterity = 5;
                    primaryWeapon = (Armas) itemRepository.procurarItem("Bastao de Madeira");
                    heroi= Heroi.getInstance(nome, maxHP, HP, strength, inteligence, dexterity, primaryWeapon,new WizardStrategy());
                    break;
                case "ranger":
                    maxHP = 40;
                    HP = 40;
                    strength = 5;
                    inteligence = 5;
                    dexterity = 10;
                    primaryWeapon = (Armas) itemRepository.procurarItem("Arco Longo");
                    heroi= Heroi.getInstance(nome, maxHP, HP, strength, inteligence, dexterity, primaryWeapon,new RangerStrategy());

                default:
                    System.out.println("Classe inválida.");
            }

        } while (heroi == null);

        return heroi;
    }
}
