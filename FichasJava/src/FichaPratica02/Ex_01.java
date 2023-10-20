package FichaPratica02;

import javax.swing.*;
import java.util.Scanner;

public class Ex_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1, num2;

        System.out.print("Insira um número: ");
        num1 = input.nextInt();

        System.out.print("Insira outro número: ");
        num2 = input.nextInt();

        if (num1 > num2) {
            System.out.print("Maior: " + num1);
        }
        if (num1 < num2) {
            System.out.print("Maior " + num2);
        }
        if (num1 == num2)
            System.out.println("Os números são iguais");
    }
}
