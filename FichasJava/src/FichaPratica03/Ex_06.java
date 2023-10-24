package FichaPratica03;

import java.util.Scanner;

public class Ex_06 {
    public static void main(String[] args) {

        int num1, som;

        num1=1;
        som=0;

        while(num1 <= 100) {
            System.out.println(num1);
            som = num1 + som;
            num1 = num1 + 1;

        }
        System.out.println("Somatório: " + som);
    }
}
