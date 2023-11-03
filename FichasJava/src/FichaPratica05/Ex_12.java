package FichaPratica05;

import java.util.Scanner;

public class Ex_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] matriz = new int[10][2];
        int vetor1[] = new int[10];
        int vetor2[] = new int[10];


        for (int cont = 0; cont < vetor1.length; cont++) {
            System.out.print("Insira um número: ");
            vetor1[cont] = input.nextInt();
        }
        for (int cont = 0; cont < vetor2.length; cont++) {
            System.out.print("Insira um número: ");
            vetor2[cont] = input.nextInt();
        }

        for (int colunas = 0; colunas < matriz[0].length; colunas++) {
            for (int linhas = 0; linhas < matriz.length; linhas++) {
                if (colunas == 0) {
                    matriz[linhas][colunas] = vetor1[linhas];
                } else matriz[linhas][colunas] = vetor2[linhas];
            }
        }

            for (int linhas = 0; linhas < matriz.length; linhas++){
                for (int colunas = 0; colunas < matriz[0].length; colunas++){
                System.out.print(matriz[linhas][colunas] + " ");
            }
            System.out.println("");
        }
    }
}
