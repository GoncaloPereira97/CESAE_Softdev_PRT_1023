package Ex_05;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1= new Pessoa("Gonçalo", 26, "jdjasa@hotmail.com", 3453653);
        Pessoa pessoa2= new Pessoa("Ricardo", 12, "sadasdaa@hotmail.com", 4242353);

        Agenda listaPessoas = new Agenda();

        listaPessoas.addPessoa(pessoa1);
        listaPessoas.addPessoa(pessoa2);

        listaPessoas.imprimirArray();

    }
}
