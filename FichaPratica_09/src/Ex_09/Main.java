package Ex_09;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Produto bolachas = new Produto("Bolacha Maria", 5.89);

        bolachas.comprar(5);
        System.out.println("\n");

        System.out.println("Temos agora " + bolachas.vender(2) + " " + bolachas.getNome() + " em stock");
        System.out.println("\n");
        bolachas.comprar(10);
        System.out.println("\n");
        bolachas.vender(35);
        System.out.println("Temos agora " + bolachas.getStock() + " " + bolachas.getNome() + " em stock");

    }
}
