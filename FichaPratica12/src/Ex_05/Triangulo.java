package Ex_05;

public class Triangulo extends FormaGeometrica{

    private double largura;

    private double altura;

    public Triangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }


    @Override
    public double calcularArea() {
        return (this.largura * this.altura) / 2;
    }
}
