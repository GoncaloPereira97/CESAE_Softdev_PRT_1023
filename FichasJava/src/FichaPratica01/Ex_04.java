package FichaPratica01;

import java.util.Scanner;

public class Ex_04 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double pi, raio, area;

        pi= 3.14159265359;

        System.out.print("Insira o raio da circunferência: ");
        raio = input.nextDouble();

        area = 2 * (pi * raio);

        System.out.println("A area da circunferência é: " + area);

    }
}
