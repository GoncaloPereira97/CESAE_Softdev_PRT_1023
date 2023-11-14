package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex_07 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner ficheiro = new Scanner(new File("FichasJava/Ficheiros/FichaPratica07/FichaPratica07/exercicio_07.txt"));
        String linha;
        int linhas = 0, palavrasT = 0;

        while (ficheiro.hasNextLine()){
            linha = ficheiro.nextLine();
            String[] palavras = linha.split(" ");

            linhas++;
            palavrasT += palavras.length;
        }
        System.out.println("O ficheiro tem " + linhas + " linhas e " + palavrasT + " palavras");
    }
}
