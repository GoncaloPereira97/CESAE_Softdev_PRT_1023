import Enums.Familia;

import java.util.PropertyResourceBundle;

public class Planta extends  SerVivo{

    private Familia familia;

    private int grauDefesa;

    public Planta(String nome, String especie, String pais, int idade, Familia familia, int grauDefesa) {
        super(nome, especie, pais, idade);
        this.familia = familia;
        if (grauDefesa <= 5 && grauDefesa >= 0) {
            this.grauDefesa = grauDefesa;
        } else System.out.println("Grau de defesa apenas pode ir até 5");
    }

    public Familia getFamilia() {
        return familia;
    }
}
