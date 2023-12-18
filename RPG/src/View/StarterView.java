package View;

import Controllers.CaracterCreation.CyberStrategy;
import Controllers.CaracterCreation.MedievalStrategy;
import Domain.Entidades.Heroi;

import java.util.Locale;
import java.util.Scanner;

public class StarterView {
    public static void starterMenu(){
        Scanner input = new Scanner(System.in);

        Heroi heroi = null;
        String pill = "";
        System.out.println("Bem Vindo ao Lord of The Rings 2077");
        do {
            System.out.println("Escolhe um comprimido: (RED)(BLUE)");
            pill = input.next().toLowerCase(Locale.ROOT);

            switch (pill){
                case "red":
                    CyberStrategy caracterCreatorC = new CyberStrategy();
                    heroi=caracterCreatorC.caracterCreator();

                    return;
                case "blue":
                    MedievalStrategy caracterCreatorM = new MedievalStrategy();
                    heroi=caracterCreatorM.caracterCreator();
                    return;
                default:
                    System.out.println("Escolha inválida");
            }
        }while (true);
    }
}
