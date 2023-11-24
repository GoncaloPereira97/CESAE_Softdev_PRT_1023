package AirplaneStore;

import javax.swing.plaf.PanelUI;
import java.util.ArrayList;

public class AvioesCombate extends Avioes{

    private String pais;

    private boolean camo;

    private ArrayList<Armas> armas;


    public AvioesCombate(int numSerie, String modelo, int anoFabrico, double compFuselagem, double compAsas, double alturaCauda, int numMotores, double autonomia, double velocidadeMax, double preco, String pais, boolean camo) {
        super(numSerie, modelo, anoFabrico, compFuselagem, compAsas, alturaCauda, numMotores, autonomia, velocidadeMax, preco);
        this.pais = pais;
        this.camo = camo;
        this.armas = new ArrayList<Armas>(3);
    }
    public void addArma(Armas arma){
        armas.add(arma);
    }

    @Override
    public void detalhesAviao() {
        super.detalhesAviao();
        System.out.print(this.pais);
        if (this.camo){
            System.out.print(" | com camoflagem");
        } else System.out.print(" | sem camoflagem");
        for (int cont = 0; cont < armas.size(); cont++) {
            System.out.print(" | " + armas.get(cont).toString());
        }
        System.out.println("\n");
    }
}
