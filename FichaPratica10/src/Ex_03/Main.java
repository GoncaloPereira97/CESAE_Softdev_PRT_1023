package Ex_03;

public class Main {
    public static void main(String[] args) {
       // Animal gato = new Animal("Pity","Pardo", "Portugal", 3.43,"pao;peixe;ração;bife".split(";"));
        Animal gato = new Animal("Pity","Pardo", "Portugal", 3.43,new String[]{"peixe","couves","ração"});



        if (gato.comer("peixe", 2000)){
            System.out.println("O animal comeu!");
            System.out.println("O animal pesa agora " + gato.getPeso() + "Kg");
        }else System.out.println("O animal não gosta disso.");

        if (gato.comer("carne", 2000)){
            System.out.println("O animal comeu!");
            System.out.println("O animal pesa agora " + gato.getPeso() + "Kg");
        }else System.out.println("O animal não gosta disso.");
    }
}
