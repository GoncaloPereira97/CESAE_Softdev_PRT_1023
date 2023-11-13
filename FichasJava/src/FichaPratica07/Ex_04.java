package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex_04 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner ficheiroCSV = new Scanner(new File("FichasJava/Ficheiros/FichaPratica07/FichaPratica07/exercicio_04.csv"));

        while (ficheiroCSV.hasNextLine()){
            System.out.println(ficheiroCSV.nextLine());
        }
    }
}
