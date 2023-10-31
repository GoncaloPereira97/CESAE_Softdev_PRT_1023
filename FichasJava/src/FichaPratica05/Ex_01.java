package FichaPratica05;

import java.util.Scanner;

public class Ex_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numeros = new int[10];
        int quant;
        for (quant=0; quant < numeros.length; quant++) {
            System.out.print("Insira um número no array: ");
            numeros[quant] = input.nextInt();
        }
        quant =0;


        while (quant < numeros.length){
            System.out.println(numeros[quant]);
            quant++;
        }

    }
}
