package FichaPratica02;

import java.util.Scanner;

public class Ex_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double sal;

        System.out.print("Insira o salário : ");
        sal = input.nextInt();

        if (sal <= 15000) {
            System.out.println("Taxa : " + (sal * 0.20));
        } else System.out.println("Taxa : " + (sal * 0.30));

    }
}
