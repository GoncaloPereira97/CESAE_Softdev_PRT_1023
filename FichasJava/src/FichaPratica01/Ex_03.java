package FichaPratica01;

import java.util.Scanner;

public class Ex_03 {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        int num1, num2, area, per;

        System.out.print("Insira a medida de uma face: ");
        num1 = input.nextInt();

        System.out.print("Insira a medida da face adjacente: ");
        num2 = input.nextInt();

        per = 2 * (num1 + num2);
        area = num1 * num2;

        System.out.println("O perimetro do rectangulo é: " + per);
        System.out.println("A area do rectangulo é: " + area);
    }
}
