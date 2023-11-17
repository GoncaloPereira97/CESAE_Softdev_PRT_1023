package Ex_03;

public class Retangulo {

    private int altura;

    private int largura;

    public Retangulo(int altura, int largura) {
        this.altura = altura;
        this.largura = largura;
    }

    public double area(){
        return this.altura*this.largura;
    }
    public double perimetro(){
        return (2*this.altura) + (2*this.largura);
    }
}
