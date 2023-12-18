package Tools;

import Controllers.AtackStrategy;
import Domain.Item;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class CSVItemReader {

    private String filePath;

    public CSVItemReader(String filePath) {
        this.filePath = filePath;
    }

    public ArrayList<Item> readCSVToRepository(){
        Scanner file = new Scanner(this.filePath);

        ArrayList<Item> arrayItems = new ArrayList<>();
        String linha = file.nextLine();

        while (file.hasNextLine()){
            linha = file.nextLine();
            String[] splitLinha = linha.split(";");
            String tipo = splitLinha[0];
            String nome = splitLinha[1];
            int preco = Integer.parseInt(splitLinha[2]);
            String[] splitHeroisPermitidos = splitLinha[3].split(",");
            int ataque = Integer.parseInt(splitLinha[4]);
            int ataqueEspecial = Integer.parseInt(splitLinha[5]);
            int ataqueInstantaneo = Integer.parseInt(splitLinha[6]);
            int vida = Integer.parseInt(splitLinha[7]);
            int primaryStat = Integer.parseInt(splitLinha[8]);

            Item currentItem = new Item(tipo, nome, preco, ataque, ataqueEspecial, ataqueInstantaneo, vida, primaryStat);
            for (String heroiAtual: splitHeroisPermitidos) {
                currentItem.addHeroiPermitido(heroiAtual);
            }
            arrayItems.add(currentItem);
        }
        return arrayItems;
    }
}
