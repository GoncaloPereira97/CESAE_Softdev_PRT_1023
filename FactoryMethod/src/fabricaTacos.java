public class fabricaTacos {

    public static Taco criarTaco(String tipoTaco) {



        switch (tipoTaco) {
            case "vegan":
                return new Vegan();
            case "frango":
                return new Frango();
            case "vaca":
                return new Vaca();
            default:
                throw new IllegalArgumentException("Tipo de taco Inválido: " + tipoTaco);
        }
    }


}
