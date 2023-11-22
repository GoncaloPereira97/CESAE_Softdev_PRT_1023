package Ex_10;

public class Main {
    public static void main(String[] args) {
        Funcionario goncalo = new Funcionario("Gonçalo", "Lavagem de Carros");

        goncalo.aumentarSalario(0.10);

        goncalo.exibirDados();
    }
}
