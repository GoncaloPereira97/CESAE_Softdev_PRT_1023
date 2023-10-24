package FichaPratica03;

import java.util.Scanner;

public class Ex_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num=0, m25=0, m50=0, m75=0, m100=0;


        while (num >= 0) {
            System.out.print("Insira um numero: ");
            num = input.nextInt();
            if (num > 0 && num <= 25) {
                m25 = m25 + 1;
            } else if (num > 25 && num <= 50) {
                m50 = m50 + 1;
            } else if (num > 50 && num <= 75) {
                m75 = m75 + 1;
            } else if (num > 75 && num <= 100) {
                m100 = m100 + 1;
            }
        }
        System.out.println("[00,25]: " + m25);
        System.out.println("[26,50]: " + m50);
        System.out.println("[51,75]: " + m75);
        System.out.println("[76,100]: " + m100);
        }
}
