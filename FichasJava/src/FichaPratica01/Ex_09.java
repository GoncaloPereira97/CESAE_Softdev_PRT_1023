package FichaPratica01;

import java.util.Scanner;

public class Ex_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int id;
        double IVA = 0.2375, IRS = 0.10, segS = 0.11, venc = 40, sub = 5, dias;

        System.out.print("Insira o codigo do funcionario: ");
        id = input.nextInt();

        System.out.print("Insira o número de dias que trabalhou: ");
        dias = input.nextDouble();

        venc = dias * venc;
        sub = dias * sub;

        System.out.println("O valor liquido a receber fruto do vencimento é: " + venc);
        System.out.println("Subsidio de alimentação: " + sub);
        System.out.println("IRS: " + (venc * IRS));
        System.out.println("Segurança Social: " + (venc * (segS + IVA)));

        venc = venc - (venc * (IVA + IRS + segS)) + sub;
        System.out.println("Valor liquido a receber: " + venc);



    }
}
