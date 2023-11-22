package AirplaneStore;

import java.util.ArrayList;

import static AirplaneStore.Armas.*;
import static AirplaneStore.Instalacoes.*;

public class Main {
    public static void main(String[] args) {


        AvioesCombate aviao1 = new AvioesCombate(123456, "F-16", 2006, 4, 3, 1, 2, 270, 600, 1500000, "Portugal", true);
        AvioesParticulares aviao2 = new AvioesParticulares(53673, "Boeing", 2010, 6, 28, 3,2, 1970, 450, 2700000, 123,740,CategoriaParticulares.HEAVY);
        aviao1.addArma(METRELHADORAS);
        aviao1.addArma(MISSEIS);
        aviao2.addInstalacoes(WC);
        aviao2.addInstalacoes(CINEMA);
        aviao2.addInstalacoes(CHUVEIRO);
        Catalogo listaAvioes = new Catalogo();


        listaAvioes.comprarAviao(aviao1);
        listaAvioes.comprarAviao(aviao2);


        listaAvioes.verCatalogo();
        System.out.println("Valor do catálogo: " + listaAvioes.valorCatalogo());
//        listaAvioes.venderAviao(aviao1);

//        aviao2.detalhesAviao();


    }
}
