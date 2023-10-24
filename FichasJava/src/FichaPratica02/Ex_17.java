package FichaPratica02;

import java.util.Scanner;

public class Ex_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double saldo;

        System.out.println("Introduza o seu saldo médio: ");
        saldo = input.nextDouble();

        if (saldo <= 2000) {
            System.out.println("Não tem direito a crédito.");
        } else if (saldo > 2000 && saldo <=4000) {
            System.out.println("Com " + saldo + "€ de saldo médio tem direito a: " + (saldo * 0.20) + "€ de crédito");
        } else if (saldo > 4000 && saldo <=6000) {
                System.out.println("Com " + saldo + "€ de saldo médio tem direito a: " + (saldo * 0.30) + "€ de crédito");
        } else if (saldo > 6000) {
            System.out.println("Com " + saldo + "€ de saldo médio tem direito a: " + (saldo * 0.40) + "€ de crédito");

        } else System.out.println("Ocorreu um erro por favor tente novamente");
    }
}
