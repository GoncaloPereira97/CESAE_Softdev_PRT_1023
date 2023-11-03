package FichaPratica05;

import java.util.Scanner;

public class Ex_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        int [][]matriz = new int[5][5];
        int contCol, contLin, soma=0;

        for (contLin=0; contLin < matriz.length; contLin++) {
            for (contCol = 0; contCol < matriz[0].length; contCol++) {

                System.out.print("Insira um número: ");
                matriz[contLin][contCol] = input.nextInt();
                soma = soma + matriz[contLin][contCol];
            }
        }
        System.out.println("soma é: " + soma);

    }
}
