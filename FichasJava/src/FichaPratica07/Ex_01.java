package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static FichaPratica07.BibliotecaFicha7.lerFicheiro;

public class Ex_01 {
    public static void main(String[] args) throws FileNotFoundException {
        String caminho = "FichasJava/Ficheiros/FichaPratica07/FichaPratica07/exercicio_01.txt";

        lerFicheiro(caminho);


    }
}
