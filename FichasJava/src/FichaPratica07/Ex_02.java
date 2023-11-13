package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Ex_02 {
    public static void main(String[] args) throws FileNotFoundException {

        String texto = "Hello Hello";
        File exercicio02 = new File("FichasJava/Ficheiros/FichaPratica07/FichaPratica07/exercicio_02.txt");
        PrintWriter printWriter = new PrintWriter(exercicio02);

        printWriter.println(texto);

        printWriter.close();


    }
}
