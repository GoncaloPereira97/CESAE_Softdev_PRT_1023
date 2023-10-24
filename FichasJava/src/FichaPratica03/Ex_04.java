package FichaPratica03;

import java.util.Scanner;

public class Ex_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1, num2;

        System.out.print("Insira um numero inteiro: ");
        num1 = input.nextInt();

        num2 = 0;

        while (num2 <= num1) {
            System.out.println(num2);
            num2 = num2 + 1;
        }
    }
}
