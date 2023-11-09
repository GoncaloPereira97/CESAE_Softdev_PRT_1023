package FichaPratica06.FichaExtra;

import java.util.Scanner;

import static FichaPratica06.FichaExtra.BibliotecaFichaExtra.vogal;

public class Ex_08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String letra;

        System.out.print("Introduza uma letra: ");
        letra = input.next();

        if (vogal(letra)) {
            System.out.println("Vogal");
        } else System.out.println("Consoante");
    }
}
