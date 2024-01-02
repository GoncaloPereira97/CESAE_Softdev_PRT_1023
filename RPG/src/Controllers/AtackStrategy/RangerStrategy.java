package Controllers.AtackStrategy;

import Domain.Entidades.Heroi;
import Domain.Entidades.Inimigo;

import java.util.Random;
import java.util.Scanner;

import static Controllers.AtackStrategy.AtaqueNPC.ataqueNPC;
import static Controllers.AtackStrategy.AtaqueStrategy.ataqueConsumivel;
import static Controllers.AtackStrategy.AtaqueStrategy.pots;
import static Tools.Impressora.*;

public class RangerStrategy implements FightStrategy {
    public RangerStrategy() {
    }

    /**
     * Menu de ataque do heroi, prende um heroi e um inimigo dentro deste menu até que um morra, se morrer o npc o heroi recebe tudo a que tem direito
     * @param inimigo recebe o inimigo que vai ser atacado
     * @param heroi recebe o heroi que vai atacar
     * @throws InterruptedException
     */
    @Override
    public void atacar(Inimigo inimigo, Heroi heroi) throws InterruptedException {
        Scanner input = new Scanner(System.in);
        imprimirTextoLento(inimigo.getNome() + " prepara-se para te atacar!");
        Thread.sleep(1000);
        System.out.println("Porque o " + heroi.getNome() + " é da class Ranger tem menos proteção e leva 10% mais dano.\n");
        Thread.sleep(1000);
        int opcao = 0;
        boolean ataqueEspecial = true;
        do {

            System.out.println("O teu HP atual é : " + heroi.getHP() + "\n");
            if (heroi.getHP()>0){
                System.out.println("É a tua vez de atacar, escolhe o tipo de ataque que queres usar: ");
                System.out.println("1. Ataque Normal");
                System.out.println("2. Ataque Especial");
                System.out.println("3. Ataque Consumivel");
                System.out.println("4. Usar uma poção");
                opcao = input.nextInt();
                System.out.println("\n");
                switch (opcao){
                    case 1:
                        ataqueNormal(inimigo, heroi);
                        Thread.sleep(1000);
                        if (inimigo.getHP()>0){
                            System.out.println("\n");
                            ataqueNPC(inimigo, heroi);
                        }

                        break;
                    case 2:
                        if (ataqueEspecial) {
                            ataqueEspecial(inimigo, heroi);
                            Thread.sleep(1000);
                            ataqueEspecial=false;
                            if (inimigo.getHP()>0){
                                System.out.println("\n");
                                ataqueNPC(inimigo, heroi);
                            }
                        } else System.out.println("Ataque especial em cooldown!");
                        break;
                    case 3:
                        if (inimigo.getHP()>0 && ataqueConsumivel(inimigo, heroi)){
                            System.out.println("\n");
                            ataqueNPC(inimigo, heroi);
                        }
                        break;
                    case 4:
                        pots(heroi);
                        break;
                }
            }
            System.out.println("\n");
        } while (inimigo.getHP()>0 && heroi.getHP()>0);
        System.out.println("\n");
        if (inimigo.getHP() <= 0) {
            System.out.println(inimigo.getNome() + " derrotado!\n");
            int random = new Random().nextInt(5,10);
            heroi.setGold(heroi.getGold() + random);
            System.out.println("Ganhas-te " + textoAmarelo + random + " ouro" + pararCor);
            heroi.setXp();
        }
    }

    /**
     * Metodo para executar um ataque normal no inimigo
     * @param inimigo recebe o inimigo que vai ser atacado
     * @param heroi recebe o heroi que vai atacar
     */
    @Override
    public void ataqueNormal(Inimigo inimigo, Heroi heroi) {
        int damage = heroi.getPrimaryWeapon().getAtaque() + heroi.getDexterity();
        System.out.println(heroi.getNome() + " lança uma flecha de fogo contra " + inimigo.getNome() + " e dá "+ textoVermelho+ damage + " damage." + pararCor);
        inimigo.levarDMG(damage);
        System.out.println(inimigo.getNome() + " ficou com "+ textoVermelho + inimigo.getHP()  + " HP" + pararCor);
    }

    /**
     * Metodo para executar um ataque especial no inimigo
     * @param inimigo recebe o inimigo que vai ser atacado
     * @param heroi recebe o heroi que vai atacar
     */
    @Override
    public void ataqueEspecial(Inimigo inimigo, Heroi heroi) throws InterruptedException {
        int damage = heroi.getPrimaryWeapon().getAtaqueEspecial() + heroi.getDexterity();
        int random = new Random().nextInt(0, 3);
        System.out.println(heroi.getNome() + " lança 5 flechas de uma só vez");
        if (random == 1) {
            damage += 5;
            System.out.println("O " + heroi.getNome() + " acendeu também as flechas com fogo! Ataque critico!");
        }
        System.out.print("O teu ataque especial deu " + textoVermelho + damage + pararCor +" damage e deixou o inimigo com ");
        inimigo.levarDMG(damage);
        System.out.println(inimigo.getNome() + " ficou com " + textoVermelho + inimigo.getHP()  + " HP" + pararCor);
    }

}
