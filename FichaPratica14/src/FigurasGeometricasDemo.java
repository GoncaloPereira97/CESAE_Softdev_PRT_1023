public class FigurasGeometricasDemo {
    public static void main(String[] args) {

        Circulo circulo = new Circulo("Preto", 4);
        Retangulo retangulo = new Retangulo("Branco", 4,7);
        Tringulo tringulo = new Tringulo("Rosa", 4,3);

        retangulo.mostrarCor();

        System.out.println(retangulo.calcularArea());
        System.out.println(retangulo.calcularPerimetro());
        System.out.println(tringulo.calcularArea());
        System.out.println(tringulo.calcularPerimetro());
        System.out.println(circulo.calcularArea());
        System.out.println(circulo.calcularPerimetro());
    }
}
