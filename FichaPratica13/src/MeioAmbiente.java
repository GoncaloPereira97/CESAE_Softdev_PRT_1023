import Enums.Familia;

import java.util.ArrayList;

public class MeioAmbiente {
    private String nome;
    private double agua;
    private ArrayList<SerVivo> seresVivos;

    public MeioAmbiente(String nome, double agua) {
        this.nome = nome;
        this.agua = agua;
        this.seresVivos = new ArrayList<>();
    }

    public void addSerVivo(SerVivo serVivo){
        seresVivos.add(serVivo);
    }

    /**
     * Método para fazer uma planta beber agua do meio ambiente
     * @param planta recebe a planta em questao
     * @param quantidade recebe a quantidade de agua que vai beber
     * @return retorna true se bebeu e false se não conseguir e a planta morre
     */
    public boolean plantaBebe(int indexPlanta) {
        Planta planta = (Planta) seresVivos.get(indexPlanta);
            if (0.1 < agua) {
                if (planta.getFamilia().equals(Familia.ARVORES)) {
                    agua -= 1;
                    return true;
                } else if (planta.getFamilia().equals(Familia.FLORES)) {
                    agua -= 0.1;
                    return true;
                } else if (planta.getFamilia().equals(Familia.ERVAS)) {
                    agua -= 0.25;
                    return true;
                } else {
                    System.out.println("A Planta não conseguio beber e morreu.");
                    seresVivos.remove(indexPlanta);
                    return false;
                }
            } else {
                seresVivos.remove(indexPlanta);
                return false;
            }

    }

    public boolean plantaComeInsetos(int indexPlanta){
        boolean temInsetos = false;
        for (SerVivo serVivoAtual: seresVivos) {
            if (serVivoAtual instanceof Inseto) {
                temInsetos = true;
                break;
            }
        }
        if (!temInsetos){
            return false;
        } else if (seresVivos.get(indexPlanta) instanceof Planta){
            Planta plantaAtual = (Planta) seresVivos.get(indexPlanta);
            if (plantaAtual.getFamilia().equals(Familia.COMEINSETOS)){

            }

        }


    }
    }

