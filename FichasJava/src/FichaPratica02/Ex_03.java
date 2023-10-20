package FichaPratica02;

import java.util.Scanner;

public class Ex_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sal;

        System.out.print("Insira o salário: ");
        sal = input.nextInt();

        if (sal <= 15000) {
            System.out.println("Taxa: " + (sal * 0.20));
        }
        if (sal > 15000 && sal <= 20000) {
            System.out.println("Taxa: " + (sal * 0.30));
        }
        if (sal > 20000 && sal <= 25000){
            System.out.println("Taxa: " + (sal * 0.35));
        }
        if (sal > 25000) {
            System.out.println("Taxa: " + (sal * 0.40));
        }
    }
}
