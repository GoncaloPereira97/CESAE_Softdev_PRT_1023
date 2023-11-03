package FichaPratica05;

import java.util.Scanner;

public class Ex_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);



        int [][]matriz = new int[4][4];
        int contCol, contLin, soma=0;

        for (contLin=0; contLin < matriz.length; contLin++) {
            for (contCol = 0; contCol < matriz[0].length; contCol++) {
                System.out.print("Insira um número: ");
                matriz[contLin][contCol] = input.nextInt();
            }
            soma = soma + matriz[contLin][contLin];
        }
        System.out.println("soma é: " + soma);

    }
}
