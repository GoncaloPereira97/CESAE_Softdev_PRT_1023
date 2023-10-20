package FichaPratica02;

import java.util.Scanner;

public class Ex_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String lugar;
        System.out.print("Em que lugar ficou? R: ");
        lugar = input.next();

        switch (lugar) {
            case "1":
                System.out.println("Ganhou 10 pontos");
                break;
            case "2":
                System.out.println("Ganhou 8 pontos");
                break;
            case "3":
                System.out.println("Ganhou 6 pontos");
                break;
            case "4":
                System.out.println("Ganhou 5 pontos");
                break;
            case "5":
                System.out.println("Ganhou 4 pontos");
                break;
            case "6":
                System.out.println("Ganhou 3 pontos");
                break;
            case "7":
                System.out.println("Ganhou 2 pontos");
                break;
            case "8":
                System.out.println("Ganhou 1 pontos");
                break;
            default:
                System.out.println("Não ganhou pontos");
        }
    }
}
