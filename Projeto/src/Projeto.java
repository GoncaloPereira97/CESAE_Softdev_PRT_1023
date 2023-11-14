import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Projeto {
    /**
     * Método que conta o número de linhas do ficheiro
     *
     * @param caminho Caminho do ficheiro
     * @return Retorna o total de linhas do ficheiro
     * @throws FileNotFoundException
     */
    public static int contarLinhas(String caminho) throws FileNotFoundException {
        Scanner ficheiro = new Scanner(new File(caminho));

        int linhas = 0;

        while (ficheiro.hasNextLine()) {
            String linha = ficheiro.nextLine();
            linhas++;
        }
        return linhas;
    }

    /**
     * Método que conta o número de colunas no ficheiro
     * @param caminho Caminho do ficheiro
     * @return Retorna o total de colunas do ficheiro
     * @throws FileNotFoundException
     */
    public static int contarColunas(String caminho) throws FileNotFoundException {
        Scanner ficheiro = new Scanner(new File(caminho));
        String linha = ficheiro.nextLine();
        String[] numeroColunas = linha.split(";");
        return numeroColunas.length;
    }

    /**
     * Método para criar uma matriz com os elementos de um ficheiro csv
     * @param caminho Caminho do ficheiro
     * @return Retorna uma matriz com todos os elementos do ficheiro
     * @throws FileNotFoundException
     */
    public static String[][] criarMatriz(String caminho) throws FileNotFoundException {
        Scanner ficheiro = new Scanner(new File(caminho));

        int totalLinhas = contarLinhas(caminho), totalColunas = contarColunas(caminho);

        String[][] matriz = new String[totalLinhas][totalColunas];

        for (int linhas = 0; linhas < matriz.length; linhas++){
            String linha = ficheiro.nextLine();
            String[] vetorLinha = linha.split(";");

            for (int colunas = 0; colunas < matriz[0].length; colunas++){

                matriz[linhas][colunas] = vetorLinha[colunas];
            }
        }
        return matriz;
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner ficheiro = new Scanner(new File("Projeto/Ficheiros/GameStart_V2.csv"));

        String[][] matriz = criarMatriz("Projeto/Ficheiros/GameStart_V2.csv");

        for (int linhas = 0; linhas < matriz.length; linhas++){
            for (int colunas = 0; colunas < matriz[0].length; colunas++){

                System.out.print(matriz[linhas][colunas] + " ");
            }
            System.out.println("");
        }
    }
}