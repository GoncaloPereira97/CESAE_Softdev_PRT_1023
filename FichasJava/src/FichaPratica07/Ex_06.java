package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex_06 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner ficheiro = new Scanner(new File("FichasJava/Ficheiros/FichaPratica07/FichaPratica07/exercicio_06.txt"));
        String nome, sobrenome;
        int idade, comp = 0;

        String[] maisVelho = ficheiro.nextLine().split(" ");
        idade = Integer.parseInt(maisVelho[3]);


        while (ficheiro.hasNextLine()){
            String[] linha = ficheiro.nextLine().split(" ");
            comp = Integer.parseInt(linha[3]);
            if (comp > idade){
                idade = comp;
            }
        }


        for (int cont = 0; ficheiro.hasNextLine(); cont++){
            linha = ficheiro.nextLine();
            i
        }



    }
}
