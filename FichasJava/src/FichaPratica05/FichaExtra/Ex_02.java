package FichaPratica05.FichaExtra;

import java.util.Scanner;

public class Ex_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int vetor[] = new int[10];

        for (int cont = 0; cont < vetor.length; cont++) {
            System.out.print("Insira um número: ");
            vetor[cont] = input.nextInt();
        }
        for (int cont = vetor.length-1; cont >= 0; cont--) {
            System.out.println(vetor[cont]);
        }
    }
}

