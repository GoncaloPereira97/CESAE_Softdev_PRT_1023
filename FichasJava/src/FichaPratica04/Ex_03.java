package FichaPratica04;

import java.util.Scanner;

public class Ex_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1, num2, cont = 0;

        System.out.print("Jogador 1, escolha um número de 0 a 100: ");
        num1 = input.nextInt();

        do {
            System.out.print("Jogador 2, tente adivinhar o número do Jogador 1: ");
            num2 = input.nextInt();
            cont++;

            if (num2 < num1) {
                System.out.println("Valor inferior ao do Jogador 1, tente novamente");
            } else if (num2 > num1) {
                System.out.println("Valor superior ao do Jogador 1, tente novamente");
            }
        } while (num2 != num1);
        System.out.println("Adivinhou com: " + cont + " tentativas");
    }
}
