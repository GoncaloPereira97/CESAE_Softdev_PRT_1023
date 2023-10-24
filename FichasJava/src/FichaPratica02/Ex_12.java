package FichaPratica02;

import java.util.Scanner;

public class Ex_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String op;
        System.out.println("1. Criar");
        System.out.println("2. Atualizar");
        System.out.println("3. Eliminar");
        System.out.println("4. Sair");
        System.out.print("Escolha se deseja : ");
        op = input.next();

        switch (op) {
            case "1":
                System.out.println("Criar");
                break;
            case "2":
                System.out.println("Actualizar");
                break;
            case "3":
                System.out.println("Eliminar");
                break;
            case "4":
                break;
            default:
                System.out.println("Opção invalida");
        }
    }
}
