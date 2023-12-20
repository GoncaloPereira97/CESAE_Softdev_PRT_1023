package Controllers.AtackStrategy;

import Domain.Entidades.Heroi;
import Domain.Items.ItemCombate;
import Domain.Items.ItemHeroi;

public class InventarioHeroi {
    public static void imprimirConsumiveisCombate(Heroi heroi){
        for (ItemHeroi itemAtual : heroi.getInventario()) {
            if (itemAtual instanceof ItemCombate){
                itemAtual.itemDetails();
            }
        }
    }
}
