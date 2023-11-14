package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex_08 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(System.in);
        Scanner ficheiro = new Scanner(new File("FichasJava/Ficheiros/FichaPratica07/FichaPratica07/exercicio_08.txt"));

        String palavraTroca, linhaCopiar;
        System.out.println("Escolha a palavra a encontrar");
        palavraTroca = input.next();

        while (ficheiro.hasNextLine()) {
            String linha = ficheiro.nextLine();
            linha = linha.replace(",", "");
            linha = linha.replace(".", "");
            String[] vetorLinha = linha.split(" ");

            for (int cont = 0; cont < vetorLinha.length; cont++)
                if (vetorLinha[cont].equalsIgnoreCase(palavraTroca)){
                    System.out.println(linha);
            }
        }

    }
}
