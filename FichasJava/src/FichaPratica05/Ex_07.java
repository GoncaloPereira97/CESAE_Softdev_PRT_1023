package FichaPratica05;

import java.util.Scanner;

public class Ex_07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] total = new int[10];
        int cont = 0, par =0;

        for (cont = 0; cont < total.length; cont++) {

            System.out.println("Insira um número");
            total[cont] = input.nextInt();

            if ((total[cont] % 2) == 0 && total[cont] > par) {
                par = total[cont];
            }
        }

        
        if (par != 0) {
            System.out.println("Maior numero par: " + par);
        } else System.out.println("nenhum numero par");

    }
}
