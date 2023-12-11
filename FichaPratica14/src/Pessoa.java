public abstract class Pessoa {

    private String nome;

    private int anoNascimento;

    private String email;

    private String telemovel;

    public Pessoa(String nome, int anoNascimento, String email, String telemovel) {
        this.nome = nome;
        this.anoNascimento = anoNascimento;
        this.email = email;
        this.telemovel = telemovel;
    }

    public String getNome() {
        return nome;
    }

    public abstract void obterFuncao();

    public void exibirDetalhes(){
        System.out.println("Nome: " + this.nome + "\t| Ano Nascimento: " + this.anoNascimento + "\t| Email: " + this.email + "\t| Contacto: " + this.telemovel);
    }

    public abstract void imprimirHorario();

}
