package FichaPratica04;

import java.util.Scanner;

public class Ex_04_SemCiclo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        int num;


        System.out.println("Insira um número");
        num = input.nextInt();

        if ((num % 2) == 0 && num != 2){
            System.out.println("Não é primo");
        } else if ((num % 3) == 0 && num != 3) {
            System.out.println("Não é primo");
        } else if ((num % 5) == 0 && num != 5) {
            System.out.println("Não é primo");
        } else System.out.println("Primo");
    }
}
