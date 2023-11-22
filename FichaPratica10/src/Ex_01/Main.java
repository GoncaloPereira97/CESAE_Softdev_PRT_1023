package Ex_01;

public class Main {
    public static void main(String[] args) {
        Carro faisca = new Carro("Ferrari", "Faisca McQueen", 2003, 358, TipoCombustivel.GASOLINA, 4000, 13.7);
        Carro kitt = new Carro("Pontiac", "KITT", 1982, 250, TipoCombustivel.GASOLINA, 2500, 9);
        Carro porshe = new Carro("Mercedes", "125", 2009, 600, TipoCombustivel.GASOLINA, 4000, 11);
        Carro lambo = new Carro("Fiat", "125", 2021, 560, TipoCombustivel.GASOLINA, 5000, 15);


        Carro corrida1 = faisca.corrida(kitt);
        Carro corrida2 = porshe.corrida(lambo);
        Carro corridaFinal = corrida1.corrida(corrida2);

       corridaFinal.imprimirCarro();

//        System.out.println("");
//        System.out.println(faisca.getModelo() + "Gastou " + faisca.viagem(97) + "L\n");
//
//
//        System.out.println(kitt.getModelo() + "Gastou " + kitt.viagem(97) + "L\n");
//
//        if (kitt.viagem(97) > faisca.viagem(97)){
//            System.out.println("O " + kitt.getModelo() + " gastou mais.");
//        } else System.out.println("O " + faisca.getModelo() + " gastou mais");
    }
}
