package FichaPratica06.FichaExtra;

import java.util.Scanner;

import static FichaPratica06.FichaExtra.BibliotecaFichaExtra.imprimirTabuada;

public class Ex_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num;
        System.out.print("Introduza um número: ");
        num = input.nextInt();
        imprimirTabuada(num);
    }
}
