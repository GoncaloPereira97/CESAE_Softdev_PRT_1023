package Ex_05;

public class Main {
    public static void main(String[] args) {
        Rectangulo rectangulo = new Rectangulo(95,95);
        Triangulo triangulo = new Triangulo(4,7);
        Circulo circulo = new Circulo(4);

        System.out.println(circulo.calcularArea());
        System.out.println(rectangulo.calcularArea());
        System.out.println(triangulo.calcularArea());
    }
}
