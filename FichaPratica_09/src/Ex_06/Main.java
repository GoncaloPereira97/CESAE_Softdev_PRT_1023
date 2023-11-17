package Ex_06;

public class Main {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora(4,5);

        System.out.println(calculadora.somar());
        System.out.println(calculadora.subtrair());
        System.out.println(calculadora.multiplicar());
        System.out.println(calculadora.dividir());
    }
}
