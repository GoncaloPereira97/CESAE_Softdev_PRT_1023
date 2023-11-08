package FichaPratica06.FichaExtra;

import java.util.Scanner;

import static FichaPratica06.FichaExtra.BibliotecaFichaExtra.calcularAreaRetangulo;

public class Ex_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int base, altura;

        System.out.print("Introduza a base do rectangulo: ");
        base = input.nextInt();

        System.out.print("Introduza a altura do rectangulo: ");
        altura = input.nextInt();

        System.out.println("Area do rectangulo: "+calcularAreaRetangulo(base, altura));
    }
}
