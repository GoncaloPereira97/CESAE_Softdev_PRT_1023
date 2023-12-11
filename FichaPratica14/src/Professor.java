import Enums.AreaFormacao;

import java.util.ArrayList;

public class Professor extends Pessoa{

    private ArrayList<AreaFormacao> areaFormacao;

    private int nivelAcademico;

    public Professor(String nome, int anoNascimento, String email, String telemovel, ArrayList<AreaFormacao> areaFormacao, int nivelAcademico) {
        super(nome, anoNascimento, email, telemovel);
        this.areaFormacao = areaFormacao;
        this.nivelAcademico = nivelAcademico;
    }

    public ArrayList<AreaFormacao> getAreaFormacao() {
        return areaFormacao;
    }

    @Override
    public void obterFuncao() {

    }

    @Override
    public void imprimirHorario() {

    }
}
