package FichaPratica04;

import java.util.Scanner;

public class Ex_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1, num2, result;
        String opcao;
        do {
            System.out.println("Insira um número");
            num1 = input.nextInt();
            System.out.println("Insira um número");
            num2 = input.nextInt();
            System.out.println("Escolha a operação que deseja: ");
            System.out.println("somar: +  |  subtrair: -  | multiplicar  *  | dividir:  /");
            opcao = input.next();

            switch (opcao){
                case "+":
                    System.out.println("Resultado: "num1 + num2);
                    break;
                case "-":
                    System.out.println("Resultado: "num1 - num2);                    break;
                case "*":
                    System.out.println("Resultado: "num1 * num2);                    break;
                case "/":
                    System.out.println("Resultado: "num1 / num2);                    break;
                default:
                    System.out.println("Operação invalida");
            }

        } while ( !opcao.equals("nao") );
    }
}
