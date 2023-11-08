package FichaPratica06;

import java.util.Scanner;

public class Ex_08 {
    /**
     * Método que apresenta uma matriz com a soma com o resultado da soma de 2 Matrizes
     *
     * @param matriz1 Soma os elementos da primeira matriz com os da segunda
     */
    public static void somarMatrizes(int[][] matriz1, int[][] matriz2) {


        for (int linhas = 0; linhas < matriz1.length; linhas++) {
            for (int colunas = 0; colunas < matriz1[0].length; colunas++) {

                System.out.print(matriz1[linhas][colunas] + matriz2[linhas][colunas] + "\t");
            }
            System.out.println("");
        }

    }

    /**
     * Método que soma o total entre 2 matrizes.
     *
     * @param matrizes Soma todos os elementos das matrizes.
     */
    public static int somatorioMatrizes(int[][] matriz1, int[][] matriz2) {

        int soma = 0;

        for (int linhas = 0; linhas < matriz1.length; linhas++) {
            for (int colunas = 0; colunas < matriz1[0].length; colunas++) {
                soma = soma + matriz1[linhas][colunas] + matriz2[linhas][colunas];
            }
        }
        return soma;
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int linhas, colunas;


        System.out.print("Escolha o número de linhas das matriz: ");
        linhas = input.nextInt();
        System.out.print("Escolha o número de linhas das matriz: ");
        colunas = input.nextInt();

        int[][] matriz1 = new int[linhas][colunas];
        int[][] matriz2 = new int[linhas][colunas];

        for (int contL = 0; contL < matriz1.length; contL++) {
            for (int contC = 0; contC < matriz1[0].length; contC++) {
                System.out.print("Insira um número na matriz1: ");
                matriz1[contL][contC] = input.nextInt();
            }

        }
        for (int contL = 0; contL < matriz2.length; contL++) {
            for (int contC = 0; contC < matriz2[0].length; contC++) {
                System.out.print("Insira um número na matriz2: ");
                matriz2[contL][contC] = input.nextInt();
            }

        }

        System.out.println("Somar Matrizes");
        somarMatrizes(matriz1, matriz2);

        System.out.println("Somatório total das Matrizes = " + somatorioMatrizes(matriz1, matriz2));
    }
}


