package FichaPratica06.FichaExtra;

import java.util.Scanner;

import static FichaPratica06.FichaExtra.BibliotecaFichaExtra.contarPiada;

public class Ex_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int piada;

        System.out.print("Introduza um número para receber uma piada: ");
        piada = input.nextInt();

        System.out.println(contarPiada(piada));
    }
}
