package FichaPratica05.FichaExtra;

import java.util.Scanner;

public class Ex_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int vetor[] = new int[10];
        int comp;
        boolean existe = false;
        for (int cont = 0; cont < vetor.length; cont++) {
            System.out.print("Insira um número: ");
            vetor[cont] = input.nextInt();
        }
        System.out.print("Insira o numero que pretende pesquisar: ");
        comp = input.nextInt();

        for (int cont = 0; cont < vetor.length; cont++) {
            if (vetor[cont] == comp) {
                System.out.println("Array[" + cont + "]");
            }
        }
    }
}
