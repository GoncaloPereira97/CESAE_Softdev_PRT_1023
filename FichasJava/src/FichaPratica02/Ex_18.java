package FichaPratica02;

import java.util.Scanner;

public class Ex_18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String cargo;
        int id;
        double venc, sub, dias, irs;


        System.out.print("Insira o codigo do funcionario: ");
        id = input.nextInt();

        System.out.print("Insira o cargo do trabalhador: E. Empregado C. Chefe A. Administrador  ");
        cargo = input.next();

        System.out.print("Insira o número de dias que trabalhou: ");
        dias = input.nextDouble();

        irs = 0;



        switch (cargo) {

        case "E":
            venc = dias * 40;
            sub = dias * 5;
        System.out.println("O valor liquido a receber fruto do vencimento é: " + venc);

        System.out.println("Subsidio de alimentação: " + sub);

        if (venc < 1000) {
            irs = venc * 0.10;
            System.out.println("IRS: " + irs);
        } else if (venc > 1000) {
            irs = venc * 0.20;
            System.out.println("IRS: " + irs);
        }

            System.out.println("Segurança Social: " + ( (venc * 0.11) + (venc * 0.2375) ) );
            venc = venc - (irs + (venc * 0.11) + (venc * 0.2375)) + sub;

        System.out.println("Valor liquido a receber: " + venc);
        break;

        case "C":
            venc = dias * 60;
            sub = dias * 7.5;
            System.out.println("O valor liquido a receber fruto do vencimento é: " + venc);

            System.out.println("Subsidio de alimentação: " + sub);

            if (venc < 1000) {
                irs = venc * 0.10;
                System.out.println("IRS: " + irs);
            } else if (venc > 1000) {
                irs = venc * 0.20;
                System.out.println("IRS: " + irs);
            }

            System.out.println("Segurança Social: " + ( (venc * 0.11) + (venc * 0.2375) ) );
            venc = venc - (irs + (venc * 0.11) + (venc * 0.2375)) + sub;

            System.out.println("Valor liquido a receber: " + venc);
            break;

        case "A":
            venc = dias * 80;
            sub = dias * 7.5;
            System.out.println("O valor liquido a receber fruto do vencimento é: " + venc);

            System.out.println("Subsidio de alimentação: " + sub);

            if (venc < 1000) {
                irs = venc * 0.10;
                System.out.println("IRS: " + irs);
            } else if (venc > 1000) {
                irs = venc * 0.20;
                System.out.println("IRS: " + irs);
            }

            System.out.println("Segurança Social: " + ( (venc * 0.09) + (venc * 0.21) ) );
            venc = venc - (irs + (venc * 0.09) + (venc * 0.21)) + sub;

            System.out.println("Valor liquido a receber: " + venc);

            break;
        default:
        System.out.println("Ocorreu um erro");
        }
    }
}
