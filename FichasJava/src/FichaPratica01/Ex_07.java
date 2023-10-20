package FichaPratica01;

import java.util.Scanner;

public class Ex_07 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double precoFinal;

        System.out.print("Insira o primeiro preço: ");
        precoFinal = input.nextDouble();

        System.out.print("Insira o segundo preço: ");
        precoFinal = input.nextDouble() + precoFinal;

        System.out.print("Insira o terceiro preço: ");
        precoFinal = (input.nextDouble() + precoFinal) * 0.90;


        System.out.println("O preço é: " + precoFinal);


    }
}
