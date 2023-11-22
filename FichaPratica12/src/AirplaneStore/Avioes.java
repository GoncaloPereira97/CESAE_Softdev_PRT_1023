package AirplaneStore;

public class Avioes {
    private int numSerie;

    private String modelo;

    private int anoFabrico;
    private double compFuselagem;
    private double compAsas;

    private double alturaCauda;

    private int numMotores;
    private double autonomia;
    private double velocidadeMax;

    private double preco;

    public Avioes(int numSerie, String modelo, int anoFabrico, double compFuselagem, double compAsas, double alturaCauda, int numMotores, double autonomia, double velocidadeMax, double preco) {
        this.numSerie = numSerie;
        this.modelo = modelo;
        this.anoFabrico = anoFabrico;
        this.compFuselagem = compFuselagem;
        this.compAsas = compAsas;
        this.alturaCauda = alturaCauda;
        this.numMotores = numMotores;
        this.autonomia = autonomia;
        this.velocidadeMax = velocidadeMax;
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

    public void detalhesAviao(){
        System.out.print(this.numSerie + " | " + this.modelo + " | " + this.anoFabrico + " | " + this.compFuselagem + "m comprimento fuselagem | " + this.compAsas + "m comprimento asas | " + this.alturaCauda + "m de cauda | " + this.numMotores + " motores | " + this.autonomia + "km | " + this.velocidadeMax + "km/h\n");
    }
}
