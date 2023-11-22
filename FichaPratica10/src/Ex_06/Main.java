package Ex_06;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Atleta atleta1 = new Atleta("Goncalo", "Teclar", 1.82, 67, "Portugal");
        Atleta atleta2 = new Atleta("Vitor", "Teclar", 1.70, 65, "Portugal");
        Atleta atleta3 = new Atleta("Vladimir", "Beber", 2.10, 125, "Russia");
        Atleta atleta4 = new Atleta("Brian", "Beber", 1.50, 45, "Reino Unido");
        Atleta atleta5 = new Atleta("Daril", "Beber", 1.90, 96, "USA");
        Atleta atleta6 = new Atleta("Maikon", "teclar", 1.76, 85, "Brasil");
        Competicao beberMuito = new Competicao("Borracholas", "Russia");
        Competicao escreverMuito = new Competicao("Mega Escrita", "Portugal");

        beberMuito.addAtletas(atleta3);
        beberMuito.addAtletas(atleta4);
        beberMuito.addAtletas(atleta5);

        escreverMuito.addAtletas(atleta1);
        escreverMuito.addAtletas(atleta2);
        escreverMuito.addAtletas(atleta6);

        beberMuito.imprimirCompeticao();
        System.out.println("");
        escreverMuito.imprimirCompeticao();




    }
}
