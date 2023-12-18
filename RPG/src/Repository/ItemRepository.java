package Repository;

import Domain.Items.ItemHeroi;
import Tools.CSVItemReader;

import java.util.ArrayList;

public class ItemRepository {

    private ArrayList<ItemHeroi> arrayItemHerois;

    private String filePath = "Files/ItensHeroiRPG.csv";

    public ItemRepository() {
        CSVItemReader csvItemReader = new CSVItemReader(filePath);
        this.arrayItemHerois = csvItemReader.readCSVToRepository();
    }

    public ItemHeroi procurarItem(String nome){
        ItemHeroi itemHeroiFinal = null;
        for (ItemHeroi itemHeroi : arrayItemHerois){
            if (itemHeroi.getNome().equalsIgnoreCase(nome)){
                itemHeroiFinal = itemHeroi;
            } else {
                System.out.println("Item não encontrado");
            }
        }
        return itemHeroiFinal;
    }

    public ArrayList<ItemHeroi> getArrayItems() {
        return arrayItemHerois;
    }
}
