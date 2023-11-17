package Ex_05;

public class Carro {

    private String marca;

    private String modelo;

    private int anoFabricro;

    public Carro(String marca, String modelo, int anoFabricro) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricro = anoFabricro;
    }

    public void ligar(){
        System.out.println("O carro está ligado");
    }


}
