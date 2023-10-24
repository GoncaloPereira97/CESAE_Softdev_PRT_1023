package FichaPratica03;

import java.util.Scanner;

public class Ex_07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1, num2, num3;

        System.out.println("Insira um numero: ");
        num1 = input.nextInt();

        num2 = num1 - 5;
        num3 = num1 + 1;
        while (num2 < num1) {
            System.out.println(num2);
            num2 = num2 + 1;
        }
        while (num3 < (num1 + 6)) {
            System.out.println(num3);
            num3 = num3 + 1;
        }
    }
}
