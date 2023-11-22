package Ex_01;

public class Carro {

    private String marca;

    private String modelo;

    private int anoFabricro;

    private int potencia;

    private TipoCombustivel tipoCombustivel;

    private int cilindrada;

    private double litros100km;

    public Carro(String marca, String modelo, int anoFabricro, int potencia, TipoCombustivel tipoCombustivel, int cilindrada, double litros100km) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricro = anoFabricro;
        this.potencia = potencia;
        this.tipoCombustivel = tipoCombustivel;
        this.cilindrada = cilindrada;
        this.litros100km = litros100km;
    }

    public void imprimirCarro(){
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: "+ this.modelo);
        System.out.println("Ano: " + this.anoFabricro);
        System.out.println("Potencia: " + this.potencia);
        System.out.println("Tipo Combustivel: " + this.tipoCombustivel);
        System.out.println("Cilindrada: " + this.cilindrada);
        System.out.println("Consumo: " + this.litros100km);
    }

    public void ligar() {
        if (this.anoFabricro < 2023 - 30) {
            if (this.tipoCombustivel.equals(TipoCombustivel.DIESEL)) {
                System.out.println("Deita um pouco de fumo... Custa a pegar... O carro está lidado!");
                System.out.println("Vrum-vrum-vrum");
            } else {
                System.out.println("Custa a pegar... O carro está ligado!");
                System.out.println("Vrum-vrum-vrum");
            }
        } else {
            if (this.potencia < 250) {
                System.out.println("O carro está ligado!");
                System.out.println("Vruummmmmmmmmmm");
            } else {
                System.out.println("O carro está ligado!");
                System.out.println("VRUUUUMMMMMM, PÁ, PÁ");
            }
        }

    }

    public Carro corrida(Carro carro) {


        if (this.potencia > carro.potencia) {
            return this;

        } else if (this.potencia < carro.potencia) {
            return carro;

        } else {

            if (this.cilindrada > carro.cilindrada) {
                return this;

            } else if (this.cilindrada < carro.cilindrada) {
                return carro;

            } else {

                if (this.anoFabricro < carro.anoFabricro) {
                    return this;

                } else if (this.anoFabricro > carro.anoFabricro){
                    return carro;
                }

            }

        }


        return null;

    }

    public double viagem(int distancia) {
        return this.litros100km * distancia;
    }
}
