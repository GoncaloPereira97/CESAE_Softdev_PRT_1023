package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static FichaPratica07.BibliotecaFicha7.contarLinhas;

public class Ex_11 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(System.in);
        Scanner ficheiro = new Scanner(new File("FichasJava/Ficheiros/FichaPratica07/FichaPratica07/exercicio_11.csv"));
        String linha = ficheiro.nextLine();
        String musica, artista, genero, opcaoMenu;
        int minutos, segundos, opcao;
        int linhasMatriz = contarLinhas("FichasJava/Ficheiros/FichaPratica07/FichaPratica07/exercicio_11.csv");

        String[][] matriz = new String[linhasMatriz - 1][4];

        for (int linhas = 0; linhas < matriz.length; linhas++) {
            linha = ficheiro.nextLine();
            linha = linha.replace(" ", "_");
            linha = linha.replace(",", " ");
            linha = linha.replace(":", ".");
            String[] vetorLinha = linha.split(" ");

            for (int colunas = 0; colunas < matriz[0].length; colunas++) {

                matriz[linhas][colunas] = vetorLinha[colunas];
            }
        }

        do {
            System.out.println("Escolha uma das seguintes opções.\n");
            System.out.println("1. Pesquisar músicas por genero.");
            System.out.println("2. Pesquisar músicas de um determinado artista.");
            System.out.println("3. Pesquisar a maior musica.");
            System.out.println("4. Pesquisar pesquisar musicas a cima de um valor especifico.");
            System.out.println("5. Pesquisar o total de músicas.");
            System.out.println("6. Sair.\n");
            opcao = input.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("Escolha um genero de musica.");
                    opcaoMenu = input.next();

                    for (int linhas = 0; linhas < matriz.length; linhas++){
                        if (matriz[linhas][2].equalsIgnoreCase(opcaoMenu)){
                            System.out.println(matriz[linhas][0].replace("_", " ") + "\n");
                        }
                    }
                    break;
                case 2:
                    System.out.println("Escolha o artista.");
                    opcaoMenu = input.next();

                    for (int linhas = 0; linhas < matriz.length; linhas++){
                        if (matriz[linhas][1].equalsIgnoreCase(opcaoMenu)){
                            System.out.println(matriz[linhas][0].replace("_", " ") + "\n");
                        }
                    }
                    break;
                case 3:
                    double maior = Double.parseDouble(matriz[0][3]), comp;
                    String musicaMaior = "";
                    for (int linhas = 0; linhas < matriz.length; linhas++){
                        comp = Double.parseDouble(matriz[linhas][3]);
                        if (comp > maior){
                            maior = comp;
                            musicaMaior = matriz[linhas][0];
                        }
                    }
                    System.out.println(musicaMaior.replace("_", " ") + " é a maior música no disco.\n");
                    break;
                case 4:
                    int tamanhoMusica;
                    System.out.println("Escolha o tamanho da música.");
                    tamanhoMusica = input.nextInt();
                    for (int linhas = 0; linhas < matriz.length; linhas++){
                        comp = Double.parseDouble(matriz[linhas][3]);
                        if (comp > tamanhoMusica){
                            System.out.println(matriz[linhas][0].replace("_", " ") + "tem mais do que " + tamanhoMusica + " minutos\n");
                        }
                    }
                    break;
                case 5:
                    System.out.println("Existem " + (linhasMatriz - 1) + " musicas no disco.\n");
                    break;
            }


        } while (opcao != 6);
    }
}
