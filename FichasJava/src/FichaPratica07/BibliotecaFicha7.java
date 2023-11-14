package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BibliotecaFicha7 {
    /**
     * Método que lê ficheiros
     *
     * @param caminho Recebe o caminho do ficheiro
     * @throws FileNotFoundException lê o ficheiro e imprime o conteudo
     */

    public static void lerFicheiro(String caminho) throws FileNotFoundException {

        Scanner ficheiro = new Scanner(new File(caminho));


        while (ficheiro.hasNext()) {
            System.out.println(ficheiro.nextLine());
        }


    }

    public static int contarPalavras(String caminho) throws FileNotFoundException {
        Scanner ficheiro = new Scanner(new File(caminho));
        String linha;
        int linhas = 0, palavrasT = 0;

        while (ficheiro.hasNextLine()) {
            linha = ficheiro.nextLine();
            String[] palavras = linha.split(" ");

            linhas++;
            palavrasT += palavras.length;
        }

        return palavrasT;
    }

    public static int contarLinhas(String caminho) throws FileNotFoundException {
        Scanner ficheiro = new Scanner(new File(caminho));
        String linha;
        int linhas = 0, palavrasT = 0;

        while (ficheiro.hasNextLine()) {
            linha = ficheiro.nextLine();
            String[] palavras = linha.split(" ");

            linhas++;
            palavrasT += palavras.length;
        }

        return linhas;
    }


}
