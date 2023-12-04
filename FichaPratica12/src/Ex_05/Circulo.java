package Ex_05;

public class Circulo extends FormaGeometrica{
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return (this.raio * this.raio) * Math.PI;
    }
}
