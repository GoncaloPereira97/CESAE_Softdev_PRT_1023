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
}
