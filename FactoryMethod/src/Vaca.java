public class Vaca extends Taco {
    @Override
    public void prepare() {
        System.out.println("A preparar taco de carne de vaca.");
    }

    @Override
    public void bake() {
        System.out.println("A cozinhar taco de carne de vaca.");

    }

    @Override
    public void box() {
        System.out.println("A embalar taco de carne de vaca.");

    }
}
