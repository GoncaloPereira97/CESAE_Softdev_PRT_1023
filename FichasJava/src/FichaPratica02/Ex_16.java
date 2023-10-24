package FichaPratica02;

import java.util.Scanner;

public class Ex_16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int valorEuros, n200, n100, n50, n20, n10, n5;

        System.out.print("Insira um valor (múltiplo de 5): ");
        valorEuros = input.nextInt();


        if (valorEuros % 5 != 0) {
            System.out.println("O valor inserido não é um múltiplo de 5.");
        } else {
            n200 = valorEuros / 200;
            n100 = (valorEuros % 200) / 100;
            n50 = ((valorEuros % 200) % 100) / 50;
            n20 = (((valorEuros % 200) % 100) % 50) / 20;
            n10 = ((((valorEuros % 200) % 100) % 50) % 20) / 10;
            n5 = (((((valorEuros % 200) % 100) % 50) % 20) % 10) / 5;


            System.out.println("Valor lido: " + valorEuros + " euros");
            System.out.println("Notas de 200 euros: " + n200);
            System.out.println("Notas de 100 euros: " + n100);
            System.out.println("Notas de 50 euros: " + n50);
            System.out.println("Notas de 20 euros: " + n20);
            System.out.println("Notas de 10 euros: " + n10);
            System.out.println("Notas de 5 euros: " + n5);
        }
    }
}
