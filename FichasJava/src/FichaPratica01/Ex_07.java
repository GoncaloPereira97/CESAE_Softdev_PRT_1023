package FichaPratica01;

import java.util.Scanner;

public class Ex_07 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double preco1, preco2, preco3, precoFinal;

        System.out.print("Insira o primeiro preço: ");
        preco1 = input.nextDouble();
        System.out.print("Insira o segundo preço: ");
        preco2 = input.nextDouble();
        System.out.print("Insira o terceiro preço: ");
        preco3 = input.nextDouble();

        precoFinal = (preco1 + preco2 + preco3) * 0.90;

        System.out.println("O preço é: " + precoFinal);


    }
}
