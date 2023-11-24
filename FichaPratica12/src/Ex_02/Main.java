package Ex_02;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Carro veiculo = new Carro("Fiat", "Panda", 2001, 95,TipoCombustivel.DIESEL, 1500, 6, 5);
        Carro veiculo2 = new Carro("BMW", "M5", 2021, 435,TipoCombustivel.GASOLINA, 3500, 8, 2);
        Mota mota1 = new Mota("Yamaha", "R1", 2003, 160, TipoCombustivel.GASOLINA,1000,3,"src/Ficheiros/Mota.txt");
        Camiao veiculo3 = new Camiao("Volvo", "Sei La", 2005, 150,TipoCombustivel.GASOLINA, 5000, 10, 600);



        Veiculo vencedor = mota1.corrida(veiculo3);
        System.out.println("O vencedor da corrida entre mota e camião é: ");
        vencedor.imprimirCarro();

        vencedor = veiculo.corrida(veiculo2);
        System.out.println("\nO vencedor da corrida entre dois carros é: ");
        vencedor.imprimirCarro();

        System.out.println("\nCusto de viagem é: " + veiculo.calcularConsumo(150) + "€");
        mota1.imprimirCarro();


        if (veiculo3.calcularConsumo(100, 500) > 0){
            System.out.println("\nO camiao vai gastar: " + veiculo3.calcularConsumo(100, 500) + "€");
        } else System.out.println("Camião sem capacidade para a viagem");

        if (veiculo3.calcularConsumo(100, 850) > 0){
            System.out.println(veiculo3.calcularConsumo(100, 850));
        } else System.out.println("Camião sem capacidade para a viagem.");

    }
}
