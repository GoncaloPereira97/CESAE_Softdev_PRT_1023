package FichaPratica02;

import java.util.Scanner;

public class Ex_08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double media;

        System.out.print("Insira a primeira nota: ");
        media = (input.nextDouble() * 0.25);

        System.out.print("Insira a segunda nota: ");
        media = (input.nextDouble() * 0.35) + media;

        System.out.print("Insira a terceira nota: ");
        media = (input.nextDouble() * 0.40) + media;

        if (media > 9.5) {
            System.out.println("O aluno está aprovado");
        } else System.out.println("O aluno reprovou");
    }
}
