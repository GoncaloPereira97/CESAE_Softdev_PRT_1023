package FichaPratica02;

import java.util.Scanner;

public class Ex_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1, num2, num3;
        String ordem;

        System.out.print("Insira um número: ");
        num1 = input.nextInt();

        System.out.print("Insira outro número: ");
        num2 = input.nextInt();

        System.out.print("Insira outro número: ");
        num3 = input.nextInt();

        System.out.print("Deseja os números por ordem C. Crescente ou D. Decrescente? : ");
        ordem = input.next();
        switch (ordem) {
            case "C":
                if (num1 > num2 && num2 > num3) {
                    System.out.println(num3 + "," + num2 + "," + num1);
                } else if (num1 > num3 && num3 > num2) {
                    System.out.println(num2 + "," + num3 + "," + num1);
                } else if (num2 > num1 && num1 > num3) {
                    System.out.println(num3 + "," + num1 + "," + num2);
                } else if (num2 > num3 && num3 > num1) {
                    System.out.println(num1 + "," + num3 + "," + num2);
                } else if (num3 > num2 && num2 > num1) {
                    System.out.println(num1 + "," + num2 + "," + num3);
                } else if (num3 > num1 && num1 > num2) {
                    System.out.println(num2 + "," + num1 + "," + num3);
                } else System.out.println("Contem números iguais");
                break;
            case "D":
                if (num1 > num2 && num2 > num3) {
                    System.out.println(num1 + "," + num2 + "," + num3);
                } else if (num1 > num3 && num3 > num2) {
                    System.out.println(num1 + "," + num3 + "," + num2);
                } else if (num2 > num1 && num1 > num3) {
                    System.out.println(num2 + "," + num1 + "," + num3);
                } else if (num2 > num3 && num3 > num1) {
                    System.out.println(num2 + "," + num3 + "," + num1);
                } else if (num3 > num2 && num2 > num1) {
                    System.out.println(num3 + "," + num2 + "," + num1);
                } else if (num3 > num1 && num1 > num2) {
                    System.out.println(num3 + "," + num1 + "," + num2);
                } else System.out.println("Contem números iguais");
                break;
            default:
                System.out.println("Ocorreu um erro");
        }
    }
}
