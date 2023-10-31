package FichaPratica05;

import java.util.Scanner;

public class Ex_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] total = new int[10];
        int cont, numF;

        System.out.println("Insira um número");
        numF = input.nextInt();

        for (cont=0; cont < total.length; cont++){

            System.out.println("Insira um número");
            total[cont] = input.nextInt();

            if (total[cont] > numF){
                numF = total[cont];
            }
        }
        System.out.println(numF);

    }
}
