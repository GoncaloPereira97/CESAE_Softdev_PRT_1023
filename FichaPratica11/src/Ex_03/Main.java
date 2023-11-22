package Ex_03;

public class Main {
    public static void main(String[] args) {
        Peixe peixe1 = new Peixe("Bacalhau", 3.4, 8.32);
        Peixe peixe2 = new Peixe("Robalo", 6.4, 4.43);
        Peixe peixe3 = new Peixe("Pescada", 1.4, 6.12);
        Marisco marisco1 = new Marisco("Camarão", 0.3, 15.4);
        Marisco marisco2 = new Marisco("Mexilhão", 0.9, 12.4);
        Marisco marisco3 = new Marisco("Lagosta", 1.2, 21.4);

        BarcoPesca ElGoncalo = new BarcoPesca("El Goncalo Pescante", 6, 43, Marca.DEVLIN);

        ElGoncalo.pescarPeixe(peixe1);
        ElGoncalo.pescarPeixe(peixe2);
        ElGoncalo.pescarPeixe(peixe3);

        ElGoncalo.apanharMarisco(marisco1);
        ElGoncalo.apanharMarisco(marisco2);
        ElGoncalo.apanharMarisco(marisco3);

        ElGoncalo.largarPeixe(2);

        ElGoncalo.calcularTotal();
        System.out.println("Valor ganho em carga: " + ElGoncalo.calcularTotal() + "\n");
        System.out.println("Salário para cada tripulante: " + ElGoncalo.calcularSalarios());


    }
}
