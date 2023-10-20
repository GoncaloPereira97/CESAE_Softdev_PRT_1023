package FichaPratica01;

import java.util.Scanner;

public class Ex_05 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double num1, num2, num3, media, mediaPond;

        System.out.print("Insira um número: ");
        num1 = input.nextDouble();

        System.out.print("Insira um número: ");
        num2 = input.nextDouble();

        System.out.print("Insira um número: ");
        num3 = input.nextDouble();

        media = (num1 + num2 + num3) / 3;
        mediaPond = ((num1 * 0.2) + (num2 * 0.3) + (num3 * 0.5));

        System.out.println("A média aritemética é: " + media);
        System.out.println("A média ponderada é: " + mediaPond);


    }
}
