package Ex_10;

public class Funcionario {

    private String nome;

    private double salario;

    private String departamento;

    public Funcionario(String nome, String departamento) {
        this.nome = nome;
        this.salario = 640;
        this.departamento = departamento;
    }

    public double aumentarSalario(double aumento){
        return this.salario += this.salario * (aumento);
    }
    public void exibirDados(){
        System.out.println("\nNome: " + this.nome);
        System.out.println("Salário: " + this.salario);
        System.out.println("Departamento: " + this.departamento);

    }
}
