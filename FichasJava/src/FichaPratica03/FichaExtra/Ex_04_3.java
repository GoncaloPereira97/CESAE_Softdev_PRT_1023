package FichaPratica03.FichaExtra;

public class Ex_04_3 {
    public static void main(String[] args) {

        int starLimit = 0, spaceLimit = 0, lineLimit = 100;

        for (int lines = 0; lines <= lineLimit; lines++) {
            for (int space = lineLimit; space >= spaceLimit; space--) {
                System.out.print(" ");
            }
            spaceLimit++;
            for (int star = 1; star < starLimit; star = star + 1) {
                System.out.print("*");
            }

            System.out.println("");
            starLimit = starLimit + 2;
        }

    }
}

