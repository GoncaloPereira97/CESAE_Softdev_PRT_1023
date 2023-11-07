package FichaPratica06;

import java.util.Random;
import java.util.Scanner;

public class Ex_07 {

    public static String criarQuadrado(String caracter) {


        Scanner input = new Scanner(System.in);


        int linhas, colunas;


        System.out.print("Introduza número de linhas: ");
        linhas = input.nextInt();

        System.out.print("Introduza número de linhas: ");
        colunas = input.nextInt();

        for (int linhasT = 1; linhasT <= linhas; linhasT++) {

            for (int colunasT = 0; colunasT < colunas; colunasT++) {


                if (colunasT > 0 && colunasT < colunas - 1 && linhasT > 1 && linhasT < linhas) {
                    System.out.print(" ");
                } else System.out.print(caracter);;

            }
            System.out.println(" ");
        }
        return caracter;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String carater;

        System.out.print("Introduza um caracter: ");
        carater = input.next();

        criarQuadrado(carater);
    }
}
