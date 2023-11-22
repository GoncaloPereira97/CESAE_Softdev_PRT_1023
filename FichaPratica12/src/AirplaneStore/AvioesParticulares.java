package AirplaneStore;

import java.util.ArrayList;

public class AvioesParticulares extends Avioes{

    private int lotacao;
    private double capacidadeCarga;

    private CategoriaParticulares categoriaParticulares;

    private ArrayList<Instalacoes> instalacoes;

    public AvioesParticulares(int numSerie, String modelo, int anoFabrico, double compFuselagem, double compAsas, double alturaCauda, int numMotores, double autonomia, double velocidadeMax, double preco, int lotacao, double capacidadeCarga, CategoriaParticulares categoriaParticulares) {
        super(numSerie, modelo, anoFabrico, compFuselagem, compAsas, alturaCauda, numMotores, autonomia, velocidadeMax, preco);
        this.lotacao = lotacao;
        this.capacidadeCarga = capacidadeCarga;
        this.categoriaParticulares = categoriaParticulares;
        this.instalacoes = new ArrayList<Instalacoes>();
    }
    public void addInstalacoes(Instalacoes instalacao){
        instalacoes.add(instalacao);
    }
}
