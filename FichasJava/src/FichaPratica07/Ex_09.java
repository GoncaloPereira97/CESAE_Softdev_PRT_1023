package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static FichaPratica07.BibliotecaFicha7.contarPalavras;

public class Ex_09 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner ficheiro = new Scanner(new File("FichasJava/Ficheiros/FichaPratica07/FichaPratica07/exercicio_09.txt"));

        int numPalavras, cont2 = 0, contadorPalavras = 0;
        String palavra1, palavra2, palavraF = "";

        numPalavras = contarPalavras("FichasJava/Ficheiros/FichaPratica07/FichaPratica07/exercicio_09.txt");
        String[] ficheiroTotal= new String[numPalavras];



        for (int cont = 0; ficheiro.hasNextLine(); cont++){
            String linha = ficheiro.nextLine();
            linha = linha.replace(",", "");
            linha = linha.replace(".", "");
            String[] vetorLinha = linha.split(" ");

            for (int i = 0; i < vetorLinha.length; i++){
                ficheiroTotal[cont2] = vetorLinha[i];
                cont2++;
            }

        }

        cont2=0;

        for (int cont = 0; cont < ficheiroTotal.length; cont++){
            palavra1 = ficheiroTotal[cont];

            for (int i = 0; i < ficheiroTotal.length; i++){

                palavra2 = ficheiroTotal[i];
                System.out.println(cont2);
                if (palavra1.equalsIgnoreCase(palavra2)){
                    cont2++;
                }
            }
            if (cont2 > contadorPalavras){
                palavraF = ficheiroTotal[cont];
                contadorPalavras = cont2;
            }
            cont2 = 0;

        }
        System.out.println("A palavra >"+ palavraF + "< Existe " + contadorPalavras + " vezes.");
    }
}
