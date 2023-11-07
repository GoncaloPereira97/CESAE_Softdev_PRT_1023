package FichaPratica06;

import java.util.Scanner;

public class Ex_02 {
    /**
     * Método para imprimir estrelas
     * @param estrelas Número de estrelas
     */
  public static void estrela(int estrelas) {



      for (int cont = 1; cont < estrelas; cont++){
          System.out.print("*");
      }


  }

    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);


        System.out.print("Escolha um número inteiro positivo: ");
        int estrelas = input.nextInt();

        estrela(estrelas);
    }
}
