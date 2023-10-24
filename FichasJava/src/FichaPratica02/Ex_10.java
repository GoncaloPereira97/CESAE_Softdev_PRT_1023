package FichaPratica02;

import java.util.Scanner;

public class Ex_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double num1, num2;
        System.out.print("Insira um numero: ");
        num1= input.nextDouble();

        System.out.print("Insira outro numero: ");
        num2= input.nextDouble();

        String operacao;
        System.out.println("Escolha a operação aritemética que deseja realizar.");
        System.out.println("+ ou - ou  / ou  *");
        operacao = input.next();

        switch (operacao) {
            case "+":
                System.out.println(num1 + num2);
                break;
            case "-":
                System.out.println(num1 - num2);
                break;
            case "/":
                System.out.println(num1 / num2);
                break;
            case "*":
                System.out.println(num1 * num2);
                break;
            default:
                System.out.println("Escolheu uma operação incorreta");
        }


    }
}
