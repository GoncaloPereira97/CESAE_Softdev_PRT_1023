package Ex_05;

public class Agenda {
    private Pessoa[] agenda;

    public Agenda() {
        this.agenda = new Pessoa[100];
    }

    public void addPessoa(Pessoa pessoaNova){
        for (int cont = 0; cont < agenda.length; cont++){
            if (agenda[cont] == null){
                agenda[cont] = pessoaNova;
                return;
            }
        }
    }

    public void imprimirArray(){
        for (int cont = 0; cont < agenda.length; cont++){
            if (agenda[cont] != null){
                agenda[cont].imprimirDetalhes();
            }

        }

    }
}
