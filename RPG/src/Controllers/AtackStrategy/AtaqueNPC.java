package Controllers.AtackStrategy;

import Domain.Entidades.Heroi;
import Domain.Entidades.Inimigo;
import Domain.Entidades.NPC;

import java.util.Random;

public class AtaqueNPC {

    public static void ataqueNPC(Inimigo npc, Heroi heroi) throws InterruptedException {
      String classNPC = npc.getClassNPC().toLowerCase();
      int damage = 0;
      int random = new Random().nextInt(0,15);
        switch (classNPC){
            case "brute":
                damage = npc.getPrimaryWeapon().getAtaque() + npc.getStrength();

                if (random == 1){
                    damage = (npc.getPrimaryWeapon().getAtaqueEspecial() * 2) + npc.getStrength();
                    System.out.println(npc.getNome() + " prepara um ataque especial!!");
                    System.out.println("Ativa o modo turbo do seu " + npc.getPrimaryWeapon().getNome() + "!");
                    System.out.println("Ergue o martelo e bate com ele no chão com maxima força causando uma onda de choque!");
                    System.out.println(damage + " damage.");
                } else {
                    System.out.println(npc.getNome() + " da swing com o " + npc.getPrimaryWeapon().getNome() + "!");
                    System.out.println(damage + " damage.");

                }
                heroi.setHP(heroi.getHP() - damage);
                break;

            case "techie":
                damage = npc.getPrimaryWeapon().getAtaque() + npc.getInteligence();
                if (random == 1){
                    damage =  npc.getPrimaryWeapon().getAtaqueEspecial() + npc.getInteligence();
                    System.out.println(npc.getNome() + " prepara um ataque especial!!");
                    System.out.println("Dispara  " + npc.getPrimaryWeapon().getNome() + " usando como um missil!");
                    System.out.println(damage + " damage.");
                } else {
                    System.out.println(npc.getNome() + " executa um uppercut intenso com " + npc.getPrimaryWeapon().getNome() + "!");
                    System.out.println(damage + " damage.");
                }
                heroi.setHP(heroi.getHP() - damage);
                break;

            case "soldier":
                damage = npc.getPrimaryWeapon().getAtaque() + npc.getDexterity();

                if (random == 1){
                    damage =  npc.getPrimaryWeapon().getAtaqueEspecial() + npc.getDexterity();
                    System.out.println(npc.getNome() + " prepara um ataque especial!!");
                    System.out.println("A " + npc.getPrimaryWeapon().getNome() +" ganha uma luz intensa e começa a disparar balas explosivas!");
                    System.out.println(damage + " damage");
                } else {
                    System.out.println(npc.getNome() + " Faz mira e descarrega um carregador mas apenas algumas balas te acertam!");
                    System.out.println(damage + " damage.");
                }
                heroi.setHP(heroi.getHP() - damage);
                break;

            case "barbarian":
                damage = npc.getPrimaryWeapon().getAtaque() + npc.getStrength();

                if (random == 1){
                    damage = npc.getPrimaryWeapon().getAtaqueEspecial() + npc.getStrength();
                    System.out.println(npc.getNome() + " prepara um ataque especial!!");
                    System.out.println("Entra em frenzy e dá umá serie de ataques consecutivos!");
                    for (int i = 0; i < 4; i++) {
                        System.out.println(damage + " damage!");
                        Thread.sleep(1000);
                    }
                } else {
                    System.out.println(npc.getNome() + " da swing com " + npc.getPrimaryWeapon().getNome() + "!");
                }
                heroi.setHP(heroi.getHP() - damage);
                break;

            case "wizard":
                damage = npc.getPrimaryWeapon().getAtaque() + npc.getInteligence();
                if (random == 1){
                    damage = npc.getPrimaryWeapon().getAtaqueEspecial() + npc.getInteligence();
                    System.out.println(npc.getNome() + " prepara um ataque especial!!");
                    System.out.println("Aponta " + npc.getPrimaryWeapon().getNome() + " para o ceu e um raio cai em ti!");
                    System.out.println(damage + " damage.");
                } else {
                    System.out.println(npc.getNome() + " aponta o seu bastão e lança um raio!" + damage + " damage.");
                    System.out.println(damage + " damage.");
                }
                heroi.setHP(heroi.getHP() - damage);
                break;
            case "ranger":
                damage = npc.getPrimaryWeapon().getAtaque() + npc.getDexterity();
                if (random == 1){
                    damage = npc.getPrimaryWeapon().getAtaqueEspecial() + npc.getDexterity();
                    System.out.println(npc.getNome() + " prepara um ataque especial!!");
                    System.out.println("Vai lançar 3 flechas de uma vez!");
                    System.out.println(damage + " damage.");
                } else {
                    System.out.println("Faz a sua flecha pegar fogo e dispara em ti!");
                    System.out.println(damage + " damage.");                }
                heroi.setHP(heroi.getHP() - damage);
                break;

            default:
                System.out.println("ERRO NA CLASS DO NPC");
        }
    }

    public static void diminuirStat(Inimigo npc){
       String classNPC = npc.getClassNPC().toLowerCase();
        switch (npc.getClassNPC()){
            case "brute":
            case "barbarian":
                npc.setStrength((int) (npc.getStrength() * 0.80));
                break;
            case "techie":
            case "wizard":
                npc.setInteligence((int) (npc.getInteligence() * 0.80));
                break;
            case "ranger":
            case "soldier":
                npc.setDexterity((int)(npc.getDexterity() * 0.80));
                break;
        }
    }
}
