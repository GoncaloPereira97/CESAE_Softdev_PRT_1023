package Ex_11;

public class Conta {

    private int numConta;

    private double saldo;

    private String titularConta;

    public Conta(int numConta, double saldo, String titularConta) {
        this.numConta = numConta;
        this.saldo = saldo;
        this.titularConta = titularConta;
    }

    public void transferencia(double quantidade, Conta conta){
        if (this.saldo > quantidade) {
            System.out.println("Transferência de " + quantidade + "€ para " + conta.titularConta);
            conta.saldo += quantidade;
            this.saldo -= quantidade;
        } else System.out.println("Está demasiado pobre");
    }
    public double depositar(double quantidade){
        return this.saldo += quantidade;
    }

    public double levantar(double quantidade) {
        if (this.saldo > quantidade) {
            this.saldo -= quantidade;
            System.out.println("Ficou com " + this.saldo + "€ na conta.");
        } else System.out.println("Está demasiado pobre.");
        return this.saldo;
    }

    public void mostrarSaldo(){
        System.out.println("Saldo da conta " + this.numConta + ": " + this.saldo + "€");
    }
}
