import Enums.FuncFuncao;

public class Funcionario extends Pessoa{

    private FuncFuncao funcao;

    public Funcionario(String nome, int anoNascimento, String email, String telemovel, FuncFuncao funcao) {
        super(nome, anoNascimento, email, telemovel);
        this.funcao = funcao;
    }


    @Override
    public void obterFuncao() {

    }


    @Override
    public void imprimirHorario() {

    }
}
