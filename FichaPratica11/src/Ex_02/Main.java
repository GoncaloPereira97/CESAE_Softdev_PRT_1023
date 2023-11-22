package Ex_02;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Gonçalo", 26, 8234723,"dfsdifj@fsdfds.cef");
        Pessoa pessoa2 = new Pessoa("Ricardo", 23, 4643536,"dsdssssafj@fsdfds.cef");
        Pessoa pessoa3 = new Pessoa("Vitor", 24, 5464524,"fgdgdg@fsdfds.cef");
        Pessoa pessoa4 = new Pessoa("Artur", 9, 4234534,"1231142@fsdfds.cef");
        Sorteio euromilhoes = new Sorteio(813740);

        euromilhoes.entrarSorteio(pessoa1);
        euromilhoes.entrarSorteio(pessoa2);
        euromilhoes.entrarSorteio(pessoa3);
        euromilhoes.entrarSorteio(pessoa4);
        euromilhoes.imprimirParticipantes();
        System.out.print("O vencedor é: ");
        euromilhoes.sortear().detalhesPessoa();



    }
}
