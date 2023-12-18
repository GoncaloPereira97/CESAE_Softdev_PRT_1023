package Tools;

import Domain.Items.Armas;
import Domain.Items.ItemCombate;
import Domain.Items.ItemHeroi;
import Domain.Items.Pocao;

import java.util.ArrayList;
import java.util.Scanner;

public class CSVItemReader {

    private String filePath;

    public CSVItemReader(String filePath) {
        this.filePath = filePath;
    }

    public ArrayList<ItemHeroi> readCSVToRepository(){
        Scanner file = new Scanner(this.filePath);
        ItemHeroi currentItemHeroi = null;
        ArrayList<ItemHeroi> arrayItemHerois = new ArrayList<>();
        String linha = file.nextLine();

        while (file.hasNextLine()){
            linha = file.nextLine();
            String[] splitLinha = linha.split(";");
            String tipo = splitLinha[0];
            String nome = splitLinha[1];
            int preco = Integer.parseInt(splitLinha[2]);
            String heroisPermitidos = splitLinha[3].replace("[", "");
            heroisPermitidos.replace("]", "");
            String[] splitHeroisPermitidos = heroisPermitidos.split(",");
            int ataque = Integer.parseInt(splitLinha[4]);
            int ataqueEspecial = Integer.parseInt(splitLinha[5]);
            int ataqueInstantaneo = Integer.parseInt(splitLinha[6]);
            int vida = Integer.parseInt(splitLinha[7]);
            int primaryStat = Integer.parseInt(splitLinha[8]);

            if (tipo.equalsIgnoreCase("ArmaPrincipal")){
                currentItemHeroi = new Armas(tipo, nome, preco, ataque, ataqueEspecial,vida, primaryStat);
            } else if (tipo.equalsIgnoreCase(("ConsumivelCombate"))) {
                currentItemHeroi = new ItemCombate(tipo, nome, preco, ataqueInstantaneo);
            } else if (tipo.equalsIgnoreCase("Pocao")) {
                currentItemHeroi = new Pocao(tipo, nome, preco,vida,primaryStat);
            }

            for (String heroiAtual: splitHeroisPermitidos) {
                currentItemHeroi.addHeroiPermitido(heroiAtual);
            }
            arrayItemHerois.add(currentItemHeroi);
        }
        return arrayItemHerois;
    }
}
