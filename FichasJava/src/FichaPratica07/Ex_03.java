package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

import static FichaPratica07.BibliotecaFicha7.lerFicheiro;

public class Ex_03 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner ficheiro = new Scanner(new File("FichasJava/Ficheiros/FichaPratica07/FichaPratica07/exercicio_03.txt"));


        File exercicio03 = new File("FichasJava/Ficheiros/FichaPratica07/FichaPratica07/exercicio_03_03.txt");
        PrintWriter printWriter = new PrintWriter(exercicio03);

        while (ficheiro.hasNextLine()){
           printWriter.println(ficheiro.nextLine());
        }



        printWriter.close();
    }
}
