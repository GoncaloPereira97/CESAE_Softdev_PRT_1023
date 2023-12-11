public class ExpressShippingStrategy implements ShippingStrategy{
    @Override
    public double calcularCusto(double peso) {
        return peso*10;
    }
}
