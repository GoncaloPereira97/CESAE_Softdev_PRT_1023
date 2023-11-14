package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex_10 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner ficheiro = new Scanner(new File("FichasJava/Ficheiros/FichaPratica07/FichaPratica07/exercicio_10.csv"));
        String linha = ficheiro.nextLine();
        double  total = 0,quantidade, valor;

        while (ficheiro.hasNextLine()){
            linha = ficheiro.nextLine();
            linha = linha.replace(" ", "_");
            linha = linha.replace(",", " ");
            String[] linhaTotal = linha.split(" ");
            quantidade = Double.parseDouble(linhaTotal[2]);
            valor = Double.parseDouble(linhaTotal[3]);
            total += (quantidade * valor);
        }
        System.out.println("Valor total: " + total);
    }
}
