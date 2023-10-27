package FichaPratica03.FichaExtra;

import java.util.Scanner;

public class Ex_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for (int cont = 1; cont <= 255; cont++) {
            if (cont % 3 == 0)
                System.out.println(cont);
        }
    }
}
