package FichaPratica02;

import java.util.Scanner;

public class Ex_07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double num;
        System.out.print("Insira um numero: ");
        num = input.nextDouble();

        if ((num % 2) == 0) {
            System.out.println("Numero par");
        } else System.out.println("Numero impar");
    }
}
