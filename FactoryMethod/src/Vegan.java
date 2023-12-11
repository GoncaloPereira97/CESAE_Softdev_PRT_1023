public class Vegan extends Taco{
    @Override
    public void prepare() {
        System.out.println("A preparar taco Vegan.");
    }

    @Override
    public void bake() {
        System.out.println("A cozinhar taco Vegan.");
    }

    @Override
    public void box() {
        System.out.println("A embalar taco Vegan.");
    }
}
