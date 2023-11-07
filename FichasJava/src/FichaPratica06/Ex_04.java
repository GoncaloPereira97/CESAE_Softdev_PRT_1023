package FichaPratica06;

import java.util.Scanner;

import static FichaPratica06.Ex_03.*;

public class Ex_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int opcao, num;


        do {
            System.out.println("Digite um número: ");
            num = input.nextInt();
            System.out.println("Escolha uma opção:");
            System.out.println("1. Par ou Impar");
            System.out.println("2. Positivo ou Negativo");
            System.out.println("3. Primo ou Não Primo");
            System.out.println("4. Perfeito ou Não Perfeito");
            System.out.println("5. Tringular ou Não Triangular");
            System.out.println("6. Trocar de Número");
            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    if (par(num)){
                        System.out.println("Número par");
                    } else System.out.println("Impar");
                    break;
                case 2:
                    if (positivo(num)){
                        System.out.println("Número positivo");
                    } else System.out.println("Negativo");
                    break;
                case 3:
                    if (primo(num)){
                        System.out.println("Primo");
                    } else System.out.println("Não primo");
                    break;
                case 4:
                    if (perfeito(num)){
                        System.out.println("Número perfeito");
                    } else System.out.println("Não perfeito");
                    break;
                case 5:
                    if (triangular(num)){
                        System.out.println("Número triangular");
                    } else System.out.println("Não triangular");
                    break;
                case 6:
                    break;
            }
            System.out.println("7. Sair 8. Recomeçar");
            opcao = input.nextInt();
        } while (opcao != 7);
    }
}

