package FichaPratica05;

import java.util.Scanner;

public class Ex_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        int [][]matriz = new int[3][5];
        int contCol, contLin, comp, total=0;

        for (contLin=0; contLin < matriz.length; contLin++) {
            for (contCol = 0; contCol < matriz[0].length; contCol++) {

                System.out.print("Insira um número: ");
                matriz[contLin][contCol] = input.nextInt();
            }
        }
        System.out.println("Indique o número que quer comparar: ");
        comp = input.nextInt();

        for (contLin=0; contLin < matriz.length; contLin++){
            for (contCol=0; contCol < matriz[0].length; contCol++){
                if (matriz[contLin][contCol] == comp){
                    total++;
                }
            }

        }
        System.out.println("Existem " + total + " numeros iguais na matriz");
    }
}
