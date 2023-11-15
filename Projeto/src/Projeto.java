import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Projeto {
    /**
     * Método para formatar as variaveis double de maneira a ficarem apenas com 2 casas decimais
     */
    public static DecimalFormat casasDecimais = new DecimalFormat("0.00");

    /**
     * Método que conta o número de linhas do ficheiro
     *
     * @param caminho Caminho do ficheiro
     * @return Retorna o total de linhas do ficheiro
     * @throws FileNotFoundException
     */
    public static int contarLinhas(String caminho) throws FileNotFoundException {
        Scanner ficheiro = new Scanner(new File(caminho));

        int linhas = 0;
        // Retirar a linha do cabeçalho
        String linha = ficheiro.nextLine();

        while (ficheiro.hasNextLine()) {
            linha = ficheiro.nextLine();
            linhas++;
        }
        return linhas;
    }

    /**
     * Método que conta o número de colunas no ficheiro
     *
     * @param caminho Caminho do ficheiro
     * @return Retorna o total de colunas do ficheiro
     * @throws FileNotFoundException
     */
    public static int contarColunas(String caminho) throws FileNotFoundException {
        Scanner ficheiro = new Scanner(new File(caminho));
        String linha = ficheiro.nextLine();
        String[] numeroColunas = linha.split(";");
        return numeroColunas.length;
    }

    /**
     * Método para criar uma matriz com os elementos de um ficheiro csv
     *
     * @param caminho Caminho do ficheiro
     * @return Retorna uma matriz com todos os elementos do ficheiro
     * @throws FileNotFoundException
     */
    public static String[][] criarMatriz(String caminho) throws FileNotFoundException {
        Scanner ficheiro = new Scanner(new File(caminho));

        int totalLinhas = contarLinhas(caminho), totalColunas = contarColunas(caminho);
        // Retirar a linha do cabeçalho
        String linha = ficheiro.nextLine();

        String[][] matriz = new String[totalLinhas][totalColunas];

        for (int linhas = 0; linhas < matriz.length; linhas++) {
            linha = ficheiro.nextLine();
            String[] vetorLinha = linha.split(";");

            for (int colunas = 0; colunas < matriz[0].length; colunas++) {

                matriz[linhas][colunas] = vetorLinha[colunas];
            }
        }
        return matriz;
    }

    /**
     * Método que lê um número inteiro e avalia se é triangular ou não
     *
     * @param num Recebe o número a avaliar
     * @return true se triangular e false se não triangular
     */
    public static boolean triangular(int num) {
        int soma = 0;
        for (int cont = 0; soma < num; cont++) {
            soma += cont;
        }
        return soma == num;
    }

    /**
     * Método para registar um novo cliente e imprimir os seus dados
     */
    public static void registo() {
        Scanner input = new Scanner(System.in);
        String nome, contacto, email;
        System.out.print("Insira o seu nome: ");
        nome = input.nextLine();
        System.out.print("Insira o seu contacto: ");
        contacto = input.nextLine();
        System.out.print("Insira o seu email: ");
        email = input.next();

        System.out.println("Registo efectuado com sucesso: " + nome + " | " + contacto + " | " + email);
        System.out.println("Bem vindo ao mundo GameStart!\n");
    }

    /**
     * Método para imprimir todos os jogos sem duplicados
     * @param matriz recebe a matriz do ficheiro
     */
    public static void jogosTodos(String[][] matriz){
        String jogosTodos = "";
        // Inserir todos os jogos (repetidos inclusive) num vetor e colocar um "_" entre eles
        for (int linhas = 0; linhas < matriz.length; linhas++) {
        jogosTodos += matriz[linhas][7] + "_";
        }
        // Separar os jogos e inserilos num vetor
        String[] vetorJogos = jogosTodos.split("_");
        // Procurar jogos repetidos e substituir por um "_" de maneira a deixar apenas uma cópia de cada jogo no vetor
        for (int cont = 0; cont < vetorJogos.length; cont++){
            for (int comp = cont + 1; comp < vetorJogos.length; comp++){
                if (vetorJogos[comp].equals(vetorJogos[cont])){
                    vetorJogos[comp] = "_";
                }
            }
        }
        System.out.println("Temos os seguintes jogos disponiveis na nossa loja: ");
        // Imprimir todos os jogos
        for (int cont = 0 ; cont < vetorJogos.length; cont++) {
            if (!vetorJogos[cont].equals("_")) { // caso seja encontrado um "_" não imprime
                System.out.println(vetorJogos[cont]);
            }
        }
        System.out.println("\n");
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(System.in);
        Scanner ficheiro = new Scanner(new File("Projeto/Ficheiros/GameStart_V2.csv"));

        String[][] matriz = criarMatriz("Projeto/Ficheiros/GameStart_V2.csv");
        String utilizador, password = "", nomeJogoMaisCaro = "";
        int opcao = 0, contador = 0, procurarCliente = 0, lugares = 121;
        double totalVendas = 0, lucro = 0, jogoMaisCaro;
        boolean lugarLivre;
        ;

        for (int linhas = 0; linhas < matriz.length; linhas++) {
            for (int colunas = 0; colunas < matriz[0].length; colunas++) {
            }
        }

        do {
            System.out.print("Tipo de utilizador (ADMIN || ClIENTE): ");
            utilizador = input.next().toUpperCase();

            switch (utilizador) {
                case "ADMIN":
                    System.out.print("PASSWORD: ");
                    password = input.next();
                    switch (password) {
                        case "123456789":
                            do {
                                System.out.println("MENU ADMIN");
                                System.out.println("1. Imprimir o número total de vendas, valor e lucro");
                                System.out.println("2. Aceder aos dados de um cliente");
                                System.out.println("3. Qual o jogo mais caro e os clientes que o compraram");
                                System.out.println("9. Sair");
                                opcao = input.nextInt();

                                switch (opcao) {
                                    case 1:
                                        // Somatório de todas as vendas e a contagem do total de vendas
                                        for (int linhas = 0; linhas < matriz.length; linhas++) {
                                            totalVendas += Double.parseDouble(matriz[linhas][matriz[0].length - 1]);
                                            contador++;
                                        }
                                        lucro = totalVendas * 0.20;
                                        System.out.println("Foram feitas " + contador + " vendas num valor total de " + casasDecimais.format(totalVendas) + "€ e a empresa teve um total de " + casasDecimais.format(lucro) + "€ de lucro em vendas.\n");
                                        break;


                                    case 2:
                                        System.out.println("Insira o id do cliente que procura");
                                        procurarCliente = input.nextInt();
                                        int linhasProcurar = 0;

                                        // Primeiro if caso seja logo o primeiro cliente
                                        if (Integer.parseInt(matriz[linhasProcurar][1]) == procurarCliente) {
                                            System.out.println("Nome: " + matriz[linhasProcurar][2]);
                                            System.out.println("Contacto: " + matriz[linhasProcurar][3]);
                                            System.out.println("Email: " + matriz[linhasProcurar][4] + "\n");

                                        } else { // Caso não seja, inicia a procura na lista e termina caso encontre o cliente ou acabe lista
                                            do {
                                                linhasProcurar++;
                                            } while (Integer.parseInt(matriz[linhasProcurar][1]) != procurarCliente && linhasProcurar < matriz.length - 1);
                                        }
                                        if (Integer.parseInt(matriz[linhasProcurar][1]) == procurarCliente) { // Verificar se o cliente existe na lista e caso exista imprimir os seus dados
                                            System.out.println("Nome: " + matriz[linhasProcurar][2]);
                                            System.out.println("Contacto: " + matriz[linhasProcurar][3]);
                                            System.out.println("Email: " + matriz[linhasProcurar][4] + "\n");
                                        } else System.out.println("Cliente não encontrado no sistema\n");
                                        break;


                                    case 3:
                                        jogoMaisCaro = Double.parseDouble(matriz[0][matriz[0].length - 1]);
                                        // Procurar qual o jogo mais caro da lista
                                        for (int linhas = 0; linhas < matriz.length; linhas++) {
                                            if (Double.parseDouble(matriz[linhas][matriz[0].length - 1]) > jogoMaisCaro) {
                                                jogoMaisCaro = Double.parseDouble(matriz[linhas][matriz[0].length - 1]);
                                                nomeJogoMaisCaro = matriz[linhas][7];
                                            }
                                        }
                                        System.out.println("O jogo mais caro é o " + nomeJogoMaisCaro + " que custa " + jogoMaisCaro + "€ e foi comprado pelos seguintes clientes:");

                                        // Procurar todos os clientes que compraram o jogo mais caro da lista
                                        for (int linhas = 0; linhas < matriz.length; linhas++) {
                                            if (matriz[linhas][7].equals(nomeJogoMaisCaro)) {
                                                System.out.println(matriz[linhas][2]);
                                            }
                                        }
                                        System.out.println("\n");
                                        break;


                                    case 9:
                                        break;
                                    default:
                                        System.out.println("Opção errada tente novamente.");
                                }

                            } while (opcao != 4);

                            break;
                        default:
                            System.out.println("Password Incorreta\n");
                    }
                case "CLIENTE":
                    do {


                        System.out.println("Por favor escolha uma das seguintes opções:");
                        System.out.println("1. Caso ainda não seja nosso cliente por favor registe-se!");
                        System.out.println("2. Procurar lugares livres de estacionamento");
                        System.out.println("3. Lista de jogos para venda");
                        System.out.println("4. Procurar todos os jogos de uma editora especifica");
                        System.out.println("9. Sair");
                        opcao = input.nextInt();
                        System.out.println("");

                        switch (opcao) {
                            case 1:
                                registo();
                                break;
                            case 2:
                                System.out.println("Temos os seguintes lugares livres no nosso parque de estacionamento:");
                                for (int cont = 1; cont < lugares; cont++) { // Encontra multiplos de 5
                                    if (cont % 5 == 0 && triangular(cont)) { // Caso seja multiplo de 5 e um número triangular imprime o lugar livre
                                        System.out.print(cont + " ");
                                    }
                                }
                                System.out.println("\n");
                                break;
                            case 3:
                                jogosTodos(matriz);
                                break;
                            case 4:
                                break;
                            case 9:
                                break;
                            default:
                                System.out.println("Opção errada tente novamente.");
                        }
                    } while (opcao != 9);


                    break;
            }
            System.out.println(password);
        } while (opcao != 9);
    }
}