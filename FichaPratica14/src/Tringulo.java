public class Tringulo extends FiguraGeometrica{

    private double altura;

    private double base;

    public Tringulo(String cor, double altura, double base) {
        super(cor);
        this.altura = altura;
        this.base = base;
    }


    @Override
    public double calcularArea() {
        return (this.base*this.altura)/2;
    }

    @Override
    public double calcularPerimetro() {
        return 3*this.base;
    }
}
