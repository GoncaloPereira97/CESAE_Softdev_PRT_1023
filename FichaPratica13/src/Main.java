import Enums.Familia;

public class Main {
    public static void main(String[] args) {
        MeioAmbiente meioAmbiente = new MeioAmbiente("Floresta", 790);
        Planta planta = new Planta("Eucalipto", "Grande", "Portugal", 87, Familia.ARVORES, 0);

        meioAmbiente.addSerVivo(planta);

        if (meioAmbiente.plantaBebe(1)){
            System.out.println("Planta bebeu");
        } else System.out.println("A Planta não conseguio beber e morreu.");
    }
}
