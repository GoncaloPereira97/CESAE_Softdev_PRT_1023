package FichaPratica03;

import java.util.Scanner;

public class Ex_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int inicio, fim;

        System.out.print("Insira o inicio: ");
        inicio = input.nextInt();

        System.out.print("Insira o fim: ");
        fim = input.nextInt();

        while (inicio < fim) {
            inicio = inicio + 1;
            if ((inicio % 5) == 0) {
                System.out.println(inicio);
            }
        }

        }

}
