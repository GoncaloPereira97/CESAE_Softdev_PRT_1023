package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BibliotecaFicha7 {
    /**
     * Método que lê ficheiros
     * @param caminho Recebe o caminho do ficheiro
     * @throws FileNotFoundException lê o ficheiro e imprime o conteudo
     */

    public static void lerFicheiro(String caminho) throws FileNotFoundException {

        Scanner ficheiro = new Scanner(new File(caminho));


        while (ficheiro.hasNext()){
            System.out.println(ficheiro.nextLine());
        }




    }


}
