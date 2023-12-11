package Ex_02;

public class Carro extends Veiculo{

    private int numPassageiros;

    public Carro(String marca, String modelo, int anoFabricro, int potencia, TipoCombustivel tipoCombustivel, int cilindrada, double litros100km, int numPassageiros) {
        super(marca, modelo, anoFabricro, potencia, tipoCombustivel, cilindrada, litros100km);
        this.numPassageiros = numPassageiros;
    }

    @Override
    public double calcularConsumo(int distancia) {

        double consumo = super.calcularConsumo(distancia);
        if (this.tipoCombustivel.equals(TipoCombustivel.DIESEL)){
            return (super.calcularConsumo(distancia) / 100) * 1.95;
        } else if (this.tipoCombustivel.equals(TipoCombustivel.GASOLINA)) {
            return (super.calcularConsumo(distancia) / 100) * 2.10;
        } else return (super.calcularConsumo(distancia) / 100) * 1.15;

    }
}
