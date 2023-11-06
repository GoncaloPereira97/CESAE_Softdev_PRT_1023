package FichaPratica05.FichaExtra;

import java.util.Scanner;

public class Ex_05 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] array= new int [12];

        for (int cont=0; cont < array.length; cont++) {
            System.out.print("Insira um número no array: ");
            array[cont] = input.nextInt();
        }

        for (int cont = 0; cont < array.length; cont++) {
            boolean duplicado = false;
            for (int comp = 0; comp < cont; comp++) {
                if (array[cont] == array[comp]) {
                    duplicado = true;
                }
            }
            if (!duplicado) {
                for (int dup = cont + 1; dup < array.length; dup++) {
                    if (array[cont] == array[dup]) {
                        System.out.println("Valor duplicado encontrado: " + array[cont]);
                        break;
                    }
                }
            }
        }

    }
}