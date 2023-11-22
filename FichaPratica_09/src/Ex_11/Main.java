package Ex_11;

public class Main {
    public static void main(String[] args) {
        Conta goncalo = new Conta(1234, 1000, "Gonçalo");
        Conta vitor = new Conta(4321, 1000, "Vitor");
        Conta ricardo = new Conta(3142, 1000, "Ricardo");

        goncalo.levantar(120);
        System.out.println("");

        vitor.transferencia(120, ricardo);
        System.out.println("");

        goncalo.mostrarSaldo();
        System.out.println("");

        vitor.mostrarSaldo();
        System.out.println("");

        ricardo.mostrarSaldo();

    }
}
