package FichaPratica04;

import java.util.Scanner;

public class Ex_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        int num, num1, div = 2;

        System.out.println("Insira um número");
        num = input.nextInt();

        boolean primo = true;

        do {
            num1 = num % div;
            if (num1 == 0 && num != div) {
                primo = false;
            }
            div++;

        } while (div < num);

        if (primo) {
            System.out.println("Primo");
        } else System.out.println("Não é primo");

    }
}
