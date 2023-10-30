package FichaPratica03.FichaExtra;

import java.util.Scanner;

public class Ex_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = 1,numAnt = 0, menor = 0, maior = 0;

        while (num != 0) {
            System.out.print("Insira um número: ");
            num = input.nextInt();

            if (num > numAnt && num > maior){
                maior = num;
            } else if (num < numAnt && num != 0){
                menor = num;
            }
            numAnt = num;
        }
        System.out.println("Menor: " + menor);
        System.out.println("Maior: " + maior);


    }
}
