package FichaPratica05.FichaExtra;

import java.util.Scanner;

public class Ex_07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int tamanho, remover = 0, quant = 0, quant2 = 0, quant3 = 0;

        System.out.print("Insira o tamanho do Array: ");
        tamanho = input.nextInt();

        int[] array = new int[tamanho];

        for (int cont = 0; cont < tamanho; cont++) {
            System.out.print("Insira u número no array[" + cont + "]:");
            array[cont] = input.nextInt();

        }

        System.out.print("Insira o número que pretende remover: ");
        remover = input.nextInt();

        for (int cont = 0; cont < tamanho; cont++) {
            if (array[cont] == remover) {
                quant++;
            }
        }

        int[] arrayF = new int[tamanho - quant];

        for (int cont = 0; cont < array.length; cont++) {


            if (array[cont] == remover) {
                quant2 = cont;
                System.out.println("Aqui está a quant2: " + quant2);
                while (array[quant2] == remover) {
                    quant2++;
                }
                arrayF[cont] = array[cont + quant2];
                quant2 = cont;

            } else if (array[cont] != remover) {

                arrayF[cont - quant2] = array[cont];

            }

        }

        for (int cont = 0; cont < arrayF.length; cont++) {
            System.out.println(arrayF[cont]);
        }
    }
}