package FichaPratica05.FichaExtra;

import java.util.Scanner;

public class Ex_06 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int tamanho;

        System.out.println("Insira o tamanho do array: ");
        tamanho = input.nextInt();

        int[] array = new int[tamanho];

        for (int cont = 0; cont < tamanho; cont++) {
            System.out.print("Insira um número no array[" + cont + "]:");
            array[cont] = input.nextInt();
        }
    }
}
