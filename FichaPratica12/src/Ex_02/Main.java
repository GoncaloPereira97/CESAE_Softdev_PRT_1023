package Ex_02;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static Veiculo criarVeiculo(String tipoVeiculo) throws FileNotFoundException {
        Scanner input = new Scanner(System.in);

        String marca, modelo, imagemMota = "src/Ficheiros/Mota.txt";
        double consumo100;
        int anoFabrico, potencia, cilindrada, numPassageiros, capacidadeCarga, opcao, cont = 0;
        TipoCombustivel combustivel;

        System.out.println("Indique a marca.");
        marca = input.next();
        System.out.println("Indique o modelo.");
        modelo = input.next();
        System.out.println("Indique o ano de fabrico.");
        anoFabrico = input.nextInt();
        System.out.println("Indique a potência.");
        potencia = input.nextInt();
        System.out.println("Indique o tipo de combustivel.(DIESEL, GASOLINA, ELETRICO, GPL");
        combustivel = TipoCombustivel.valueOf(input.next().toUpperCase());
        System.out.println("Indique a cilindrada.");
        cilindrada = input.nextInt();
        System.out.println("Indique o consumo aos 100km.");
        consumo100 = input.nextDouble();
        if (tipoVeiculo.equalsIgnoreCase("carro")) {
            System.out.println("Indique o número de lugares do carro.");
            numPassageiros = input.nextInt();
            return new Carro(modelo, marca, anoFabrico, potencia, combustivel, cilindrada, consumo100, numPassageiros);
        } else if (tipoVeiculo.equalsIgnoreCase("mota")) {
            return new Mota(modelo, marca, anoFabrico, potencia, combustivel, cilindrada, consumo100, imagemMota);
        } else if (tipoVeiculo.equalsIgnoreCase("camiao")) {
            capacidadeCarga = input.nextInt();
            return new Camiao(modelo, marca, anoFabrico, potencia, combustivel, cilindrada, consumo100, capacidadeCarga);
        } else {
            System.out.println("Tipo de veiculo não reconhecido");
            return null;
        }

    }


    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(System.in);
        String tipoVeiculo;
        int opcao, cont = 0;

        System.out.println("Indique o tipo de veiculo que deseja criar.");
        tipoVeiculo = input.next();

        Veiculo veiculo1 = criarVeiculo(tipoVeiculo);
        do {
            System.out.println("1. Criar veiculo.");
            System.out.println("2. Calcular consumo.");
            System.out.println("3. Fazer uma corrida.");
            System.out.println("4. Se camião, calcular consumos de uma viagem de transporte de carga");
            System.out.println("5. Se mota imprimir imagem.");
            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Indique o tipo de veiculo que deseja criar.");
                    tipoVeiculo = input.next();
                    Veiculo veiculo2 = criarVeiculo(tipoVeiculo);

                    break;
                case 2:
                    System.out.println("O consumo do veiculo escolhido é: " + veiculo1.calcularConsumo());
                    break;
                case 3:

            }
        } while (opcao != 6);



    }
}
