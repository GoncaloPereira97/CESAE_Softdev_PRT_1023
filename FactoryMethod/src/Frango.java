public class Frango extends Taco{
    @Override
    public void prepare() {
        System.out.println("A preparar taco de carne de frango.");
    }

    @Override
    public void bake() {
        System.out.println("A cozinhar taco de carne de frango.");

    }

    @Override
    public void box() {
        System.out.println("A embalar taco de carne de frango.");

    }
}
