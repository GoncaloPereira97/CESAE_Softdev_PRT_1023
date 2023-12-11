public class StandardShippingStrategy implements ShippingStrategy{

    @Override
    public double calcularCusto(double peso) {
        return peso*5;
    }
}
