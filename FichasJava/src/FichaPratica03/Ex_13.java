package FichaPratica03;

import java.util.Scanner;

public class Ex_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int quant, num = 0, num1 = 0, num2 = 0;
        boolean crescente = true;


        System.out.print("Quantos números deseja inserir: ");
        quant = input.nextInt();


        while (num < quant) {
            num++;
            System.out.print("Introduza um número: ");
            num1 = input.nextInt();
            if (num2 < num1) {
                System.out.println("Entrei 1 if");
                num2 = num1 + num2;
                num1 = num2 - num1;
                num2 = num2 - num1;

            } else {
                crescente = false;
            }
        }
        if (crescente == true) {
            System.out.println("Número Crescente");
        } else System.out.println("Número não crescente");
    }
}
