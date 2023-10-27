package FichaPratica03;

import java.util.Scanner;

public class Ex_14Diabo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double num1, num2 = 0, num3 = 0, num4 = 0;

        System.out.print("Escolha um número positivo: ");
        num1 = input.nextDouble();
        num4 = num1;
        num3 = num1;

        while (num2 < num4) {
            if (num3 > 1) {
                num3 = num3 - 1;
                num1 = num1 / (1/num3);
            }
            num2++;
        }
        System.out.println(num1);
    }

}
