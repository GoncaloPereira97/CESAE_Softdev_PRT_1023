package FichaPratica06.FichaExtra;

import java.util.Scanner;

import static FichaPratica06.FichaExtra.BibliotecaFichaExtra.somatorio;

public class Ex_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num;

        System.out.println("Insira um número: ");
        num = input.nextInt();

        System.out.println("Somatório: " + somatorio(num));
    }
}
