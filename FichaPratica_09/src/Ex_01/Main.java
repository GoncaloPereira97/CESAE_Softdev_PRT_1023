package Ex_01;

public class Main {
    public static void main(String[] args) {
        Pessoa goncalo = new Pessoa("Gonçalo", 26, 1.8);
        Pessoa vitor = new Pessoa("Vitor", 24, 1.7);

        System.out.println("Nome: " + goncalo.getNome());
        System.out.println("Idade: " + goncalo.getIdade());
        System.out.println("Altura: " + goncalo.getAltura());
        System.out.println("Nome: " + vitor.getNome());
        System.out.println("Idade: " + vitor.getIdade());
        System.out.println("Altura: " + vitor.getAltura());

    }
}
