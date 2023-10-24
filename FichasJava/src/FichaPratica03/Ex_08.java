package FichaPratica03;

import java.util.Scanner;

public class Ex_08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int media, num, total;
        media = 0;
        total = -1;
        num = 0;

        while (num != -1){
            media = num + media;
            System.out.println("insira um numero: ");
            num = input.nextInt();
            total = total + 1;

        }
        media = media / total;
        System.out.println("media: " + media);
    }
}
