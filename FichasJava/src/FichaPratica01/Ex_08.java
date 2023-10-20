package FichaPratica01;

import java.util.Scanner;

public class Ex_08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int mus1seg, mus2seg, mus3seg, mus4seg, mus5seg ,mus1min, mus2min, mus3min, mus4min, mus5min , albS, albM, albH, resto;

        System.out.print("Introduza minutos da musica 1: ");
        mus1min = input.nextInt();
        System.out.print("Introduza segundos da musica 1: ");
        mus1seg = input.nextInt();

        System.out.print("Introduza minutos da musica 2: ");
        mus2min = input.nextInt();
        System.out.print("Introduza segundos da musica 2: ");
        mus2seg = input.nextInt();

        System.out.print("Introduza minutos da musica 3: ");
        mus3min = input.nextInt();
        System.out.print("Introduza segundos da musica 3: ");
        mus3seg = input.nextInt();

        System.out.print("Introduza minutos da musica 4: ");
        mus4min = input.nextInt();
        System.out.print("Introduza segundos da musica 4: ");
        mus4seg = input.nextInt();

        System.out.print("Introduza minutos da musica 5: ");
        mus5min = input.nextInt();
        System.out.print("Introduza segundos da musica 5: ");
        mus5seg = input.nextInt();

        albS = ((mus1min + mus2min + mus3min + mus4min + mus5min) * 60) + (mus1seg + mus2seg + mus3seg + mus4seg + mus5seg);
        albH = albS / 3600;
        resto = albS % 3600;
        albM = resto / 60;
        albS = albS - ((albH * 3600) + (albM * 60));
        System.out.print("o album tem : " + albH + "h:" + albM + "m:" + albS + "s:");




    }
}
