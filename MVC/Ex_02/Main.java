package Ex_02;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static Veiculo criarVeiculo(String tipoVeiculo) throws FileNotFoundException {
        Scanner input = new Scanner(System.in);

        String marca, modelo, imagemMota = "Ficheiros/Mota.txt";
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
            System.out.println("Indique a capacidade de carga do camião.");
            capacidadeCarga = input.nextInt();
            return new Camiao(modelo, marca, anoFabrico, potencia, combustivel, cilindrada, consumo100, capacidadeCarga);
        } else {
            System.out.println("Tipo de veiculo não reconhecido");
            return null;
        }

    }


    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(System.in);
        Carro carroCorrida = new Carro("BMW", "M5", 2015, 543, TipoCombustivel.GASOLINA, 4000, 12, 5);
        Mota motaCorrida = new Mota("Yamaha", "R1", 2013, 134, TipoCombustivel.GASOLINA, 1000,6, "Ficheiros/Mota.txt");
        Camiao camiaoCorrida = new Camiao("Volvo", "LaLe", 2005, 195, TipoCombustivel.DIESEL, 5000, 17, 800);


        double cargaViagem;
        String tipoVeiculo;
        int opcao, cont = 0, viagem;
        Veiculo vencedor;


        System.out.println("Indique o tipo de veiculo que deseja criar.");
        tipoVeiculo = input.next();


        cont++;
        Veiculo veiculo1 = criarVeiculo(tipoVeiculo);

        do {
            System.out.println("1. Modificar veiculo.");
            System.out.println("2. Calcular consumo.");
            System.out.println("3. Fazer uma corrida.");
            System.out.println("4. Calcular consumos de uma viagem de transporte de carga");
            System.out.println("5. Se mota imprimir imagem.");
            System.out.println("6. Sair");
            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Indique o tipo de veiculo que deseja criar.");
                    tipoVeiculo = input.next();
                    veiculo1 = criarVeiculo(tipoVeiculo);
                    cont++;
                    break;
                case 2:
                    System.out.println("Indique quantos KM pertende viajar.");
                    viagem = input.nextInt();
                    System.out.println("O consumo do veiculo escolhido é: " + veiculo1.calcularConsumo(viagem));
                    break;
                case 3:
                    System.out.println("Deseja correr contra que veiculo?(CARRO, MOTA, CAMIAO)" );
                    tipoVeiculo = input.next();
                    if (tipoVeiculo.equalsIgnoreCase("carro")){
                        vencedor = veiculo1.corrida(carroCorrida);
                        System.out.println("O veiculo vencedor é: ");
                        vencedor.imprimirCarro();
                    } else if (tipoVeiculo.equalsIgnoreCase("mota")) {
                        vencedor = veiculo1.corrida(motaCorrida);
                        System.out.println("O veiculo vencedor é: ");
                        vencedor.imprimirCarro();
                    } else if (tipoVeiculo.equalsIgnoreCase("camiao")) {
                        vencedor = veiculo1.corrida(camiaoCorrida);
                        System.out.println("O veiculo vencedor é: ");
                        vencedor.imprimirCarro();
                    } else System.out.println("Não temos nenhum veiculo desse tipo.");
                    break;
                case 4:
                    System.out.println("Indique quantos KM pertende viajar.");
                    viagem = input.nextInt();
                    System.out.println("Indique quantos KG pertende transportar.");
                    cargaViagem = input.nextDouble();
                    if (veiculo1 instanceof Camiao){
                        Camiao camiao = (Camiao) veiculo1;
                        if (camiao.calcularConsumo(viagem, cargaViagem) > 0){
                            System.out.println("\nO camiao vai gastar: " + camiao.calcularConsumo(viagem, cargaViagem) + "€");
                        } else System.out.println("Camião sem capacidade para a viagem");

                        if (camiao.calcularConsumo(viagem, cargaViagem) > 0){
                            System.out.println(camiao.calcularConsumo(viagem, cargaViagem));
                        } else System.out.println("Camião sem capacidade para a viagem.");


                    } else System.out.println("O veiculo não é um camião.");
                    break;
                case 5:
                    if (veiculo1 instanceof Mota){
                        Mota mota = (Mota) veiculo1;
                        mota.imprimirMota();
                    } else System.out.println("O veiculo não é uma mota.");
            }
        } while (opcao != 6);




    }
}
