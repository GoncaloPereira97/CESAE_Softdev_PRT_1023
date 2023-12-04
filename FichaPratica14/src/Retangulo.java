public class Retangulo extends FiguraGeometrica{

    private double comprimento;

    private double altura;

    public Retangulo(String cor, double comprimento, double altura) {
        super(cor);
        this.comprimento = comprimento;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return this.comprimento*this.altura;
    }

    @Override
    public double calcularPerimetro() {
        return 2*(this.comprimento+this.altura);
    }

}
