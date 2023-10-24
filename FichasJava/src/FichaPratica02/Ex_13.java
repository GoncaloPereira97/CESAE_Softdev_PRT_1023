package FichaPratica02;

import java.util.Scanner;

public class Ex_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int min, h;


        System.out.print("Introduza as horas: ");
        h = input.nextInt();
        System.out.print("Introduza os min: ");
        min = input.nextInt();

        if (min > 59) {
            System.out.println("Minutos inválidos");
        } else if (h > 23) {
            System.out.println("Horas inválidas");
        } else {
            switch (h) {
                case 12:
                    System.out.println("São: 12:" + min + "PM");
                    break;
                case 13:
                    System.out.println("São: 1:" + min + "PM");
                    break;
                case 14:
                    System.out.println("São: 2:" + min + "PM");
                    break;
                case 15:
                    System.out.println("São: 3:" + min + "PM");
                    break;
                case 16:
                    System.out.println("São: 4:" + min + "PM");
                    break;
                case 17:
                    System.out.println("São: 5:" + min + "PM");
                    break;
                case 18:
                    System.out.println("São: 6:" + min + "PM");
                    break;
                case 19:
                    System.out.println("São: 7:" + min + "PM");
                    break;
                case 20:
                    System.out.println("São: 8:" + min + "PM");
                    break;
                case 21:
                    System.out.println("São: 9:" + min + "PM");
                    break;
                case 22:
                    System.out.println("São: 10:" + min + "PM");
                    break;
                case 23:
                    System.out.println("São: 11:" + min + "PM");
                    break;
                default:
                    System.out.println("São: " + h + ":" + min + "AM");

            }
        }
    }
}
