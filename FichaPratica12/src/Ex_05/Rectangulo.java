package Ex_05;

public class Rectangulo extends FormaGeometrica{

    private double largura;

    private double comprimento;

    public Rectangulo(double largura, double altura) {
        this.largura = largura;
        this.comprimento = altura;
    }

    @Override
    public double calcularArea() {
        return this.largura * this.comprimento;
    }
}
