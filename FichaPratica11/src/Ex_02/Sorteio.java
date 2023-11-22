package Ex_02;

import java.util.ArrayList;
import java.util.Random;

public class Sorteio {

    private double premio;
    private ArrayList<Pessoa> listaConcorrentes = new ArrayList<Pessoa>();

    public Sorteio(double premio) {
        this.premio = premio;
    }

    public void entrarSorteio(Pessoa pessoa){
        if (pessoa.getIdade()>18){
            listaConcorrentes.add(pessoa);
        } else System.out.println("Cresce e aparece.\n");
    }

    public Pessoa sortear(){
        Random random=new Random();
        int sorteado = random.nextInt(0,listaConcorrentes.size()-1);
        return listaConcorrentes.get(sorteado);
    }

    public void imprimirParticipantes(){
        for (int cont = 0; cont < listaConcorrentes.size(); cont++) {
            System.out.print("participante " + (cont + 1) + ":");
            listaConcorrentes.get(cont).detalhesPessoa();
        }
    }
}
