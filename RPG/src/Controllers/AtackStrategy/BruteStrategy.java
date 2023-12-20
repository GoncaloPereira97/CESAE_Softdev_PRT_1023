package Controllers.AtackStrategy;

import Domain.Entidades.Heroi;
import Domain.Entidades.Inimigo;
import Domain.Entidades.NPC;
import Domain.Items.ItemCombate;
import Domain.Items.ItemHeroi;

import java.util.Random;
import java.util.Scanner;

import static Controllers.AtackStrategy.AtaqueNPC.ataqueNPC;
import static Controllers.AtackStrategy.AtaqueNPC.diminuirStat;
import static Controllers.AtackStrategy.InventarioHeroi.imprimirConsumiveisCombate;

public class BruteStrategy implements FightStrategy{
    public BruteStrategy() {
    }

    @Override
    public void atacar(Inimigo inimigo, Heroi heroi) throws InterruptedException {
        Scanner input = new Scanner(System.in);
        System.out.println("Porque o " + heroi.getNome() + " é da class " + heroi.getClassType() + " o inimigo perde 80% do seu primary stat.");
        diminuirStat(inimigo);
        int opcao = 0;
        boolean ataqueEspecial = true;
        do {
            ataqueNPC(inimigo, heroi);
            System.out.println("O teu HP atual é : " + heroi.getHP());
            System.out.println("É a tua vez de atacar, escolhe o tipo de ataque que queres usar: ");
            System.out.println("1. Ataque Normal");
            System.out.println("2. Ataque Especial");
            System.out.println("3. Ataque Consumivel");
            System.out.println("4. Usar uma poção");
            opcao = input.nextInt();
            switch (opcao){
                case 1:
                    ataqueNormal(inimigo, heroi);
                    break;
                case 2:
                    if (ataqueEspecial) {
                        ataqueEspecial(inimigo, heroi);
                        ataqueEspecial=false;
                    } else System.out.println("Ataque especial em cooldown.");
                    break;
                case 3:
                    ataqueConsumivel(inimigo, heroi);
                    break;
                case 4:
                    pots(heroi);
                    break;
            }
        } while (inimigo.getHP()>0 && heroi.getHP()>0);
        heroi.setXp();
    }

    @Override
    public void ataqueNormal(Inimigo inimigo, Heroi heroi) {
    int damage = heroi.getPrimaryWeapon().getAtaque()  + heroi.getStrength();
        System.out.println(heroi.getNome() + " dá uma marretada no " + inimigo.getNome() + " e dá " + damage + " damage.");
        inimigo.setHP(inimigo.getHP() - damage);
    }

    @Override
    public void ataqueEspecial(Inimigo inimigo, Heroi heroi) throws InterruptedException {
        int damage = heroi.getPrimaryWeapon().getAtaqueEspecial() + heroi.getStrength(), damageTotal = 0;
        int random = new Random().nextInt(0,3);
        System.out.println(heroi.getNome() + " carrega o seu ataque especial rotativo.");
        if (random == 1){
            damage = damage + 2;
            System.out.println("O " + heroi.getNome() + " ficou enraivecido, o ataque será critico!");
        }
        for (int i = 0; i < 4; i++) {
            System.out.println(damage + " damage");
            Thread.sleep(2000);
            damageTotal+=damage;
        }
        System.out.print("O teu ataque especial deu " + damageTotal + " damage e deixou o inimigo com ");
        inimigo.setHP(inimigo.getHP() - (damageTotal));
        System.out.println(inimigo.getHP() + " HP");
    }

    @Override
    public void ataqueConsumivel(Inimigo inimigo, Heroi heroi) {
        Scanner input = new Scanner(System.in);
        String opcao = "";
        do {
            System.out.println("Escolhe um dos teus consumiveis.");
            imprimirConsumiveisCombate(heroi);
            opcao = input.nextLine().toLowerCase();

            switch (opcao){
                case "granada":
                    break;
                default:
                    System.out.println("Consumivel não encontrado.");
            }
        } while (true);
    }

    @Override
    public void pots(Heroi heroi) {

    }


}

