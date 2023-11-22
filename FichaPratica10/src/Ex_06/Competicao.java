package Ex_06;

public class Competicao {
    private String nome;
    private String pais;
    private Atleta[] atletas = new Atleta[50];

    public Competicao(String nome, String pais) {
        this.nome = nome;
        this.pais = pais;
    }

    public void addAtletas(Atleta atletaNovo){
        for (int cont = 0; cont < atletas.length; cont++){
            if (atletas[cont] == null){
                atletas[cont] = atletaNovo;
                return;
            }
        }
    }

    public void imprimirCompeticao(){
        System.out.println("Nome da competição: " + this.nome);
        System.out.println("Pais: " + this.pais);
        System.out.println("");
        System.out.println("Lista de atletas que vão competir:");
        for (int cont = 0; cont < atletas.length; cont++){
            if (atletas[cont] != null){
                atletas[cont].detalhesAtleta();
                System.out.println("");
            }

        }

    }
}
