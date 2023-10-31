package FichaPratica05;

import java.util.Scanner;

public class Ex_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] total = new int[10];
        int cont;
        boolean crescente = true;


        for (cont = 0; cont < total.length; cont++) {
            System.out.println("Insira um número");
            total[cont] = input.nextInt();
        }
        for (cont = 1; cont < total.length; cont++)
            if (total[cont - 1] > total[cont]){
                crescente = false;
            }
        if (crescente){
            System.out.println("Crescente");
        } else System.out.println("Não crescente");
    }
}
