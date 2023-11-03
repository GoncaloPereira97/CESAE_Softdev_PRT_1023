package FichaPratica05;

import java.util.Scanner;

public class Ex_11 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        int[][] matriz = new int[3][3];
        int contCol, contLin, menor = 0, maior = 0;

        for (contLin = 0; contLin < matriz.length; contLin++) {
            for (contCol = 0; contCol < matriz[0].length; contCol++) {

                System.out.print("Insira um número: ");
                matriz[contLin][contCol] = input.nextInt();
            }
        }
        menor = matriz[0][0];

        for (contLin = 1; contLin < matriz.length; contLin++) {
            for (contCol = 1; contCol < matriz[0].length; contCol++) {
                if (matriz[contLin][contCol] > matriz[contLin - 1][contCol - 1]) {
                    maior = matriz[contLin][contCol];
                }
                if (matriz[contLin][contCol] < menor) {
                    menor = matriz[contLin][contCol];
                }
            }
        }


        for (contLin = 0; contLin < matriz.length; contLin++) {
            for (contCol = 0; contCol < matriz[0].length; contCol++) {
                System.out.print(matriz[contLin][contCol] + " ");
            }
            System.out.println("");
        }
        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
    }
}

