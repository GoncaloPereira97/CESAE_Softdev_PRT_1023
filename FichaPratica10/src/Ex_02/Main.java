package Ex_02;

public class Main {
    public static void main(String[] args) {
        Conta goncalo = new Conta(1234, 1000,"Goncalo");
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
        System.out.println("");

        if (goncalo.pedirEmprestimo(900)){
            System.out.println("Emprestimo valido!");
            goncalo.mostrarSaldo();
        } else System.out.println("Emprestimo recusado!");





    }
}
