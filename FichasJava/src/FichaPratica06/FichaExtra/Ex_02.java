package FichaPratica06.FichaExtra;

import java.util.Scanner;

import static FichaPratica06.FichaExtra.BibliotecaFichaExtra.media;

public class Ex_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1, num2, num3;

        System.out.print("Introduza um número: ");
        num1 = input.nextInt();

        System.out.print("Introduza um número: ");
        num2 = input.nextInt();

        System.out.print("Introduza um número: ");
        num3 = input.nextInt();

        System.out.println("Média de: " + media(num1, num2, num3));
    }
}
