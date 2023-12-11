public class OvernightShippingStrategy implements ShippingStrategy{
    @Override
    public double calcularCusto(double peso) {
        return peso*15;
    }
}
