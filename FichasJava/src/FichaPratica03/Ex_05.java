package FichaPratica03;

import java.util.Scanner;

public class Ex_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1, num2;

        System.out.print("insira o valor inicial: ");
        num1 = input.nextInt();

        System.out.print("insira o valor final: ");
        num2 = input.nextInt();

        while (num1 <= num2) {
            System.out.println(num1);
            num1 = num1 +1;
        }
    }
}
