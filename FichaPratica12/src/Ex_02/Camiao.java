package Ex_02;

public class Camiao extends Veiculo {

    private double capacidadeCarga;

    public Camiao(String marca, String modelo, int anoFabricro, int potencia, TipoCombustivel tipoCombustivel, int cilindrada, double litros100km, double capacidadeCarga) {
        super(marca, modelo, anoFabricro, potencia, tipoCombustivel, cilindrada, litros100km);
        this.capacidadeCarga = capacidadeCarga;
    }

    public double calcularConsumo(int distancia, double carga) {
        double consumo=0;
        if (capacidadeCarga > carga) {
            carga /= 1000;

            setLitros100km(carga + this.getLitros100km());

            consumo = (super.calcularConsumo(distancia)/ 100) * 1.95;

            setLitros100km(this.getLitros100km() - carga);
            return consumo;
        } else return 0;


    }
}

