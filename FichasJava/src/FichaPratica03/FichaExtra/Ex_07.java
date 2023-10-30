package FichaPratica03.FichaExtra;

import java.util.Scanner;

public class Ex_07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = 1, negativo = 0, positivo = 0;

        while (num != 0) {
            System.out.print("Insira um número: ");
            num = input.nextInt();
            if (num > 0) {
                positivo++;
            } else if (num < 0){
                negativo++;
            }
        }
        System.out.println("Positivo: "+ positivo);
        System.out.println("Negativo: "+ negativo);
    }
}
