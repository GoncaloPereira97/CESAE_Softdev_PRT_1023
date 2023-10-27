package FichaPratica03.FichaExtra;

public class Ex_04_2 {
    public static void main(String[] args) {

        int starLimit=1;

        for (int lines = 0; lines <= 5; lines++) {

            for(int star =1 ; star < starLimit; star++){
                System.out.print("*");
            }
            System.out.println("");
            starLimit++;
        }
    }
}
