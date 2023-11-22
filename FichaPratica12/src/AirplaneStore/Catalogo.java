package AirplaneStore;

import java.util.ArrayList;

public class Catalogo {

    private ArrayList<Avioes> avioes = new ArrayList<Avioes>();

    public Catalogo() {
    }

    public void comprarAviao(Avioes aviao) {
        avioes.add(aviao);
    }

    public void venderAviao(Avioes aviao){
        System.out.println("O avião foi vendido por: " + aviao.getPreco()+"€.");
        avioes.remove(aviao);
    }

    public double valorCatalogo(){
        double valor = 0;
        for (int cont = 0; cont < avioes.size(); cont++) {
            valor += avioes.get(cont).getPreco();
        }
        return valor;
    }

    public void verCatalogo() {
        for (int cont = 0; cont < avioes.size(); cont++) {
            avioes.get(cont).detalhesAviao();
        }
    }
}
