package FichaPratica03.FichaExtra;

import java.util.Scanner;

public class Ex_08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num, resul=0, elev;

        System.out.println("Insira um numero: ");
        num = input.nextInt();
        System.out.println("Insira o elevado: ");
        elev= input.nextInt();
        resul=num;
        while (elev > 1){
            resul = resul * num;
            elev--;
        }
        System.out.println("Resultado = "+ resul);


    }
}
