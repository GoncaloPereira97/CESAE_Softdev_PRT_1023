package FichaPratica03;

import java.util.Scanner;

public class Ex_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int quant, num = 0, num1, num2;


        System.out.print("Quantos números deseja inserir: ");
        quant = input.nextInt();


        while (num < quant) {
            num = num + 1;

            System.out.print("Introduza um número: ");
            num1 = input.nextInt();
            if (num2 < num1) {
                num2 = num1 + num2;
            } 

        }
}
