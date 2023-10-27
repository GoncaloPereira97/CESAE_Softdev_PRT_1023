package FichaPratica03.FichaExtra;

public class Ex_05 {
    public static void main(String[] args) {
        int numberLimit=1;

        for (int lines = 0; lines <= 5; lines++) {

            for(int number =1 ; number < numberLimit; number++){
                System.out.print(lines);
            }
            System.out.println("");
            numberLimit++;
        }
    }
}
