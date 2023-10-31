package FichaPratica05;

import java.util.Scanner;

public class Ex_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] meses = new int[12];
        int com, comTotal=0;
        for (com = 0; com < meses.length; com++){
            System.out.println("Insira a sua comição do mês: " + (com + 1));
            meses[com]= input.nextInt();
            comTotal = comTotal + meses[com];

        }
        System.out.println(comTotal);

    }
}
