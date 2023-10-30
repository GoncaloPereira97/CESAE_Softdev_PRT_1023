package FichaPratica03.FichaExtra;

import java.util.Scanner;

public class Ex_10 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numIn, div=0, num, cont=0, num0=1, ordNum, numFinal = 0;

        System.out.println("Insira um número: ");
        numIn= input.nextInt();

        num = numIn;

        while (num >= 10){
            num = num / 10;
            cont++;
        }

        while(cont > 0){
            num0 = num0 * 10;
            cont--;
        }
        System.out.println(num0);

        while (numIn>0){
            ordNum = numIn % 10;
            ordNum = ordNum * num0;
            num0 = num0 / 10;
            numIn = numIn / 10;
            numFinal = ordNum + numFinal;

        }
        System.out.println("Numero final: " + numFinal);
    }
}
