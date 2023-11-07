package FichaPratica06;

import java.sql.SQLOutput;
import java.util.Scanner;

import static FichaPratica06.Ex_05.*;

public class Ex_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int tamanho, opcao;

        System.out.print("Que tamanho deseja para o array: ");
        tamanho= input.nextInt();

       int[] array = new int[tamanho];

       for (int cont= 0; cont < tamanho; cont++){
           System.out.print("Insira um número no array: ");
           array[cont] = input.nextInt();
       }

       do {
           System.out.println("Escolha uma das seguintes opções:");
           System.out.println("7. Maior Elemento");
           System.out.println("8. Menor Elemento");
           System.out.println("9. Crescente ou Não Crescente");
           opcao = input.nextInt();
           System.out.println();

           switch (opcao){
               case 7:
                   System.out.println(maior(array) + " é o maior elemento");
                   break;
               case 8:
                   System.out.println(menor(array) + " é o menor elemento");
                   break;
               case 9:
                   if (crescente(array)) System.out.println("Crescente");
                   else System.out.println("Não crescente");
                   break;
               default:
                   System.out.println("Opção inválida");
           }
           System.out.println();
           System.out.println("0. Sair  1. Continuar");
           opcao = input.nextInt();
       } while (opcao != 0);

    }
}
