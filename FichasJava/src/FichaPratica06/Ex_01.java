package FichaPratica06;

import java.util.Scanner;


public class Ex_01 {
    /**
     * Método que de acordo com o animal imprime o barulho
     * @param animal Especie do animal
     */
    public static void fazerBarulho(String animal) {

        switch (animal) {

            case "Cão":
                System.out.println("Au Au");
                break;
            case "Gato":
                System.out.println("Miau");
                break;
            case "Peixe":
                System.out.println("Glub Glub");
                break;
            case "Vaca":
                System.out.println("Muuuuuu");
                break;
            case "Porco":
                System.out.println("Oinc Oinc");
                break;
            default:
                System.out.println("Animal não reconhecido");
        }


    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Escolha um animal: Cão, Gato, Peixe, Vaca, Porco. ---> ");
        String animal = input.next();

        fazerBarulho(animal);





    }

}
