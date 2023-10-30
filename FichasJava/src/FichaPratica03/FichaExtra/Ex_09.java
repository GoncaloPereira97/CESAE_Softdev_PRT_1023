package FichaPratica03.FichaExtra;

import java.util.Scanner;

public class Ex_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num, cont=0, numIn, result=1, soma=0, resto=0, div=0;

        System.out.println("Insira um numero: ");
        num= input.nextInt();
        numIn = num;

        while (num >= 10){
            num = num / 10;
            cont++;
        }
        System.out.println(cont);

        while(cont > 0){
            result = result * 10;
            cont--;
        }
        System.out.println(result);
        resto = numIn;

        while (result > 0){
            div = resto / result;
            soma = div + soma;
            resto = numIn % result;
            result = result/10;
        }
        System.out.println(soma);
    }
}
