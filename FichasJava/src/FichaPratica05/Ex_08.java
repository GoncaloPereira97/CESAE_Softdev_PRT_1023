package FichaPratica05;

import java.util.Scanner;

public class Ex_08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        int [][]matriz = new int[3][3];
        int contCol, contLin;

        for (contLin=0; contLin < matriz.length; contLin++) {
            for (contCol = 0; contCol < matriz[0].length; contCol++) {

                System.out.print("Insira um número: ");
                matriz[contLin][contCol] = input.nextInt();
            }
        }


        for (contLin=0; contLin < matriz.length; contLin++){
            for (contCol=0; contCol < matriz[0].length; contCol++){
                System.out.print(matriz[contLin][contCol] + " ");
            }
            System.out.println("");
        }
    }
}
