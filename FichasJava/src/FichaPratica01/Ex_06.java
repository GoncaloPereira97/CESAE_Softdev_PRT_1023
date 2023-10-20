package FichaPratica01;

import java.util.Scanner;

public class Ex_06 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int valor1, valor2;

        System.out.print("Insira o primeiro valor: ");
        valor1 = input.nextInt();


        System.out.print("Insira o segundo valor: ");
        valor2 = input.nextInt();

        valor1 = valor2 + valor1;
        valor2 = valor1 - valor2;
        valor1 = valor1 - valor2;


        System.out.print("O primeiro valor é: " + valor1);
        System.out.print( " e o segundo valor é: "+ valor2);
    }
}
