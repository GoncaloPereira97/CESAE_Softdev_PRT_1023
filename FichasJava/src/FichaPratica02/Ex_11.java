package FichaPratica02;

import java.util.Scanner;

public class Ex_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double sald, mont;

        System.out.println("Indique o seu saldo: ");
        sald = input.nextDouble();
        System.out.println("Indique o montante que deseja creditar/debitar: ");
        mont = input.nextDouble();

        if (mont > 0) {
            System.out.println("O seu novo saldo é: " + (sald + mont));
        } else if (mont < 0 && (sald + mont) > 0) {
            System.out.println("O seu novo saldo é: " + (sald + mont));
        } else {
            System.out.println("Ocorreu um erro por favor verifique se tem saldo suficiente");
        }

    }
}
