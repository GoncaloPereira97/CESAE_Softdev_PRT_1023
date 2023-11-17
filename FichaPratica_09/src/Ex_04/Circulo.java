package Ex_04;

public class Circulo {

    private int raio;


    public Circulo(int raio) {
        this.raio = raio;
    }

    public double areaCirculo(){
        return Math.PI*(this.raio*this.raio);
    }

    public double circunferencia(){
        return (2*Math.PI)*this.raio;
    }
}
