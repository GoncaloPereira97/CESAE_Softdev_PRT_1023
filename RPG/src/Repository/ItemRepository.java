package Repository;

import Domain.Item;
import Tools.CSVItemReader;

import java.util.ArrayList;

public class ItemRepository {

    private ArrayList<Item> arrayItems;

    public ItemRepository(String filePath) {
        CSVItemReader csvItemReader = new CSVItemReader("Files/ItensHeroiRPG.csv");
        this.arrayItems = csvItemReader.readCSVToRepository();
    }

    public ArrayList<Item> getArrayItems() {
        return arrayItems;
    }
}
