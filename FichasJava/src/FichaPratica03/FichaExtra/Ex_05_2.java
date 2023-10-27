package FichaPratica03.FichaExtra;

public class Ex_05_2 {
    public static void main(String[] args) {
        int numberLimit = 0, spaceLimit = 0, lineLimit =5;

        for (int lines = 0; lines <= lineLimit; lines++) {
            for (int space = lineLimit; space >= spaceLimit; space--) {
                System.out.print(" ");
            }
            spaceLimit++;
            for (int number = 1; number < numberLimit; number = number + 1) {
                System.out.print(lines);
            }
            for (int space = lineLimit; space >= spaceLimit; space--) {
                System.out.print(" ");
            }
            System.out.println("");
            numberLimit = numberLimit + 2;
        }
    }
}
