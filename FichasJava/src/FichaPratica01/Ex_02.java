package FichaPratica01;

import java.util.Scanner;

public class Ex_02 {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

          int num1, num2, soma, subt, mult, div;

        System.out.print("Insira um número: ");
        num1 = input.nextInt();

        System.out.print("Insira um número: ");
        num2 = input.nextInt();

        soma = num1 + num2;
        subt = num1 - num2;
        mult = num1 * num2;
        div = num1 / num2;

        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subt);
        System.out.println("Multiplicação: " + mult);
        System.out.println("Divisão: " + div);

    }
}
