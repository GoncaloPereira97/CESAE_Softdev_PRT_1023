package Ex_02;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Mota extends Veiculo{
    private String mota;

    private String[][] imagemMota;

    public Mota(String marca, String modelo, int anoFabricro, int potencia, TipoCombustivel tipoCombustivel, int cilindrada, double litros100km, String mota) throws FileNotFoundException {
        super(marca, modelo, anoFabricro, potencia, tipoCombustivel, cilindrada, litros100km);
        this.mota = mota;
        this.imagemMota = criarMatriz(this.mota);
    }

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
        // Retirar a linha do cabeçalho
        String linha = ficheiro.nextLine();
        // Contar as linhas
        while (ficheiro.hasNextLine()) {
            linha = ficheiro.nextLine();
            linhas++;
        }
        return linhas;
    }

    /**
     * Método que conta o número de colunas no ficheiro
     *
     * @param caminho Caminho do ficheiro
     * @return Retorna o total de colunas do ficheiro
     * @throws FileNotFoundException
     */
    public static int contarColunas(String caminho) throws FileNotFoundException {
        Scanner ficheiro = new Scanner(new File(caminho));
        // Colar a primeira linha numa string
        String linha = ficheiro.nextLine();
        // Transformar num vetor
        String[] numeroColunas = linha.split(";");

        return numeroColunas.length;
    }

    /**
     * Método para criar uma matriz com os elementos de um ficheiro csv
     *
     * @param mota Caminho do ficheiro
     * @return Retorna uma matriz com todos os elementos do ficheiro
     * @throws FileNotFoundException
     */
    public String[][] criarMatriz(String mota) throws FileNotFoundException {
        Scanner ficheiro = new Scanner(new File(mota));

        int totalLinhas = contarLinhas(mota), totalColunas = contarColunas(mota);
        // Retirar a linha do cabeçalho
        String linha = ficheiro.nextLine();
        // Criar uma matriz com o tanho certo para o ficheiro
        String[][] matriz = new String[totalLinhas][totalColunas];
        // Copiar o ficheiro para a matriz retirando utilizando um vetor auxiliar para gravar cada linha
        for (int linhas = 0; linhas < matriz.length; linhas++) {
            linha = ficheiro.nextLine();
            String[] vetorLinha = linha.split(";");
            // Copiar a linha do vetor para a matriz
            for (int colunas = 0; colunas < matriz[0].length; colunas++) {
                matriz[linhas][colunas] = vetorLinha[colunas];
            }
        }
        return  imagemMota = matriz;
    }

    @Override
    public void imprimirCarro() {
        super.imprimirCarro();
        for (int linhas = 0; linhas < imagemMota.length; linhas++) {
            for (int colunas = 0; colunas < imagemMota[0].length; colunas++) {
                System.out.println(imagemMota[linhas][colunas]);
            }
        }
    }

    public void imprimirMota(){
        for (int linhas = 0; linhas < imagemMota.length; linhas++) {
            for (int colunas = 0; colunas < imagemMota[0].length; colunas++) {
                System.out.println(imagemMota[linhas][colunas]);
            }
        }
    }
}
