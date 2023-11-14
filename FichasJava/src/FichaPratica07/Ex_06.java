package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex_06 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner ficheiro = new Scanner(new File("FichasJava/Ficheiros/FichaPratica07/FichaPratica07/exercicio_06.txt"));
        String nomeF = " ";
        int idade, comp = 0;

        String[] maisVelho = ficheiro.nextLine().split(",");
        idade = Integer.parseInt(maisVelho[1]);

        while (ficheiro.hasNextLine()){
            String linha = ficheiro.nextLine();
            String[] nome = linha.split(",");
            comp = Integer.parseInt(nome[1]);


            if (comp > idade){
                idade = comp;
                nomeF = nome[0];
            }
        }
        System.out.println(nomeF + " " + idade);









    }
}
