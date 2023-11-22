package Ex_02;

public class Conta {

    private int numConta;

    private double saldo;

    private String titularConta;

    private int anoAbertura;

    private double margemEmprestimo;

    private double valorDivida;

    public Conta(int numConta, double saldo, String titularConta) {
        this.numConta = numConta;
        this.saldo = saldo;
        this.titularConta = titularConta;
        this.anoAbertura = 2023;
        this.margemEmprestimo = this.saldo * 0.90;
        this.valorDivida = 0;
    }

    public void transferencia(double quantidade, Conta conta) {
        if (this.saldo > quantidade) {
            System.out.println("Transferência de " + quantidade + "€ para " + conta.titularConta);
            conta.saldo += quantidade;
            this.saldo -= quantidade;
        } else System.out.println("Está demasiado pobre");
    }

    public double depositar(double quantidade) {
        return this.saldo += quantidade;
    }

    public double levantar(double quantidade) {
        if (this.saldo > quantidade) {
            this.saldo -= quantidade;
            System.out.println("Ficou com " + this.saldo + "€ na conta.");
        } else System.out.println("Está demasiado pobre.");
        return this.saldo;
    }

    public void mostrarSaldo() {
        System.out.println("Saldo da conta " + this.numConta + ": " + this.saldo + "€");
    }

    public boolean pedirEmprestimo(double valor) {
        if (this.valorDivida > 0 || valor > this.margemEmprestimo) {
            return false;
        } else {
                this.valorDivida += valor;
                this.saldo += valor;
                return true;
            }
        }
    }



