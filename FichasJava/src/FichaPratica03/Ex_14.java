package FichaPratica03;

import java.util.Scanner;

public class Ex_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num, fatorial;

        System.out.print("Escolha um número positivo: ");
        num = input.nextInt();

        fatorial=num--;

        while (num > 0) {
            fatorial*=(num--);
        }
        System.out.println(fatorial);


    }
}
