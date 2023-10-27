package FichaPratica03.FichaExtra;

import jdk.jshell.spi.SPIResolutionException;

public class Ex_05_3 {
    public static void main(String[] args) {

        int numberLimit = 0, spaceLimit = 0, lineLimit =5;


        for (int lines = 1; lines <= lineLimit; lines++) {
            for (int space = lineLimit; space >= spaceLimit; space--) {
                System.out.print(" ");
            }
            spaceLimit++;
            for (int number = 0; number < 1; number++) {
                System.out.print(lines);
                for (int prench = lineLimit;prench <= lineLimit; prench--){
                    System.out.print(prench-1);
                    prench--;
                }

            }
            System.out.println("");
            numberLimit = numberLimit + 2;
        }
    }
    }

