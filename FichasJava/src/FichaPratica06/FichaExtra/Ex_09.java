package FichaPratica06.FichaExtra;

import java.util.Scanner;

import static FichaPratica06.FichaExtra.BibliotecaFichaExtra.mes;

public class Ex_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int mes;

        // Recebe um número do utilizador para descobrir a que mês corresponde
        System.out.print("Insira um número correspondente a um mês: ");
        mes = input.nextInt();

        // Acebe á funçao "mes" em (BibliotecaFichaExtra) onde passa num switch(case) e corresponde o número ao seu respetivo mês
        System.out.println("Mês: " + mes(mes));
    }
}
