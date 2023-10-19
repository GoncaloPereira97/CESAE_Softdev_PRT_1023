package FichaPratica01;

import java.util.Scanner;

public class Ex_01 {
    public static void main(String[] args) {

        // Instanciar o Scanner (obrigatório para todos os exercicios)
        Scanner input = new Scanner(System.in);

        // Declarar variaveis
        int num1, num2, soma;

        // ler num1
        System.out.print("Insira um número: ");
        num1= input.nextInt();

        // ler num2
        System.out.print("Insira um número: ");
        num2= input.nextInt();

        // Calcular a soma de num1+num2
        soma= num1 + num2;

        // Apresentar a soma
        System.out.print("A soma é: " + soma);
    }
}
