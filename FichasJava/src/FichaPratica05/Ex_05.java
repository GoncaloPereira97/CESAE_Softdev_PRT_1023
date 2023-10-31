package FichaPratica05;

import java.util.Scanner;

public class Ex_05 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] total = new int[10];
        int cont, media=0;


        for (cont = 0; cont < total.length; cont++) {
            System.out.println("Insira um número");
            total[cont] = input.nextInt();
        }

        for (cont=0; cont< total.length;cont++){
            media = media + total[cont];
            System.out.println(media);
        }

        System.out.println(cont);
        media = media / cont;

        System.out.println(media);
    }
}
