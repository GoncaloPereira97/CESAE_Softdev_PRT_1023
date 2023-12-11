import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Taco taco;
        String tipoTaco;
        int opcao;

        System.out.println("Escolha um tipo de taco.(vaca, frango, vegan)");
        tipoTaco = input.next().toLowerCase(Locale.ROOT);
        taco = fabricaTacos.criarTaco(tipoTaco);


        do {
            System.out.println("1. Mudar taco.");
            System.out.println("2. Preparar taco");
            System.out.println("3. Cozinhar taco");
            System.out.println("4. Embalar taco");
            System.out.println("0. Sair");
            opcao = input.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("Escolha um tipo de taco.(vaca, frango, vegan)");
                    tipoTaco = input.next().toLowerCase(Locale.ROOT);
                    taco = fabricaTacos.criarTaco(tipoTaco);
                    break;
                case 2:
                    taco.prepare();
                    break;
                case 3:
                    taco.bake();
                    break;
                case 4:
                    taco.box();
                    break;
                default:
                    System.out.println("Opcao inválida");
            }

        } while (opcao != 0);

    }
}
