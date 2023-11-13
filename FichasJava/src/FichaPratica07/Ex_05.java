package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex_05 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner ficheiro = new Scanner(new File("FichasJava/Ficheiros/FichaPratica07/FichaPratica07/exercicio_05_31.txt"));

        int soma = 0;

        while (ficheiro.hasNext()){
            soma += ficheiro.nextInt();
        }

        System.out.println("Soma = " + soma);
    }
}
