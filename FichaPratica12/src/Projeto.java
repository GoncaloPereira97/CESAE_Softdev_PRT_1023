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
        // Contar as linhas
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
        // Colar a primeira linha numa string
        String linha = ficheiro.nextLine();
        // Transformar num vetor
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
        // Criar uma matriz com o tanho certo para o ficheiro
        String[][] matriz = new String[totalLinhas][totalColunas];
        // Copiar o ficheiro para a matriz retirando utilizando um vetor auxiliar para gravar cada linha
        for (int linhas = 0; linhas < matriz.length; linhas++) {
            linha = ficheiro.nextLine();
            String[] vetorLinha = linha.split(";");
            // Copiar a linha do vetor para a matriz
            for (int colunas = 0; colunas < matriz[0].length; colunas++) {
                matriz[linhas][colunas] = vetorLinha[colunas];
            }
        }
        return matriz;
    }

    /**
     * Método para calcular o total das vendas da empresa
     *
     * @param matriz Recebe a matriz do ficheiro
     * @return Retorna o total das vendas para uso futuro e imprime a mensagem para a consola
     */
    public static double vendas(String[][] matriz) {
        double totalVendas = 0;
        int contador = 0;

        // Somatório de todas as vendas e a contagem do total de vendas
        for (int linhas = 0; linhas < matriz.length; linhas++) {
            totalVendas += Double.parseDouble(matriz[linhas][8]);
            contador++;
        }
        return totalVendas;
    }

    /**
     * Método para calcular o lucro da empresa
     *
     * @param matriz Recebe a matriz do ficheiro
     * @return Retorna o valor do lucro da empresa
     */
    public static double lucro(String[][] matriz) {
        double lucro = vendas(matriz) * 0.20;
        return lucro;
    }

    /**
     * Método para imprimir os dados de um cliente da matriz
     *
     * @param matriz          Recebe a matriz
     * @param procurarCliente Recebe o id do cliente a procurar
     */

    public static void procurarCliente(String[][] matriz, int procurarCliente) {
        int linhasProcurar = 0;
        System.out.println("\n");

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
    }

    /**
     * Método para imprimir qual o jogo mais caro e quem o comprou
     *
     * @param matriz Recebe a matriz do ficheiro
     */
    public static void jogoMaisCaro(String[][] matriz) {
        double jogoMaisCaro;
        String nomeJogoMaisCaro = "";
        jogoMaisCaro = Double.parseDouble(matriz[0][matriz[0].length - 1]);
        // Procurar qual o jogo mais caro da lista
        for (int linhas = 0; linhas < matriz.length; linhas++) {
            if (Double.parseDouble(matriz[linhas][matriz[0].length - 1]) > jogoMaisCaro) {
                jogoMaisCaro = Double.parseDouble(matriz[linhas][matriz[0].length - 1]);
                nomeJogoMaisCaro = matriz[linhas][7];
            }
        }
        System.out.println("\nO jogo mais caro é o " + nomeJogoMaisCaro + " que custa " + jogoMaisCaro + "€ e foi comprado pelos seguintes clientes:\n");
        // Procurar todos os clientes que compraram o jogo mais caro da lista
        for (int linhas = 0; linhas < matriz.length; linhas++) {
            if (matriz[linhas][7].equals(nomeJogoMaisCaro)) {
                System.out.println(matriz[linhas][2]);
            }
        }
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

        System.out.println("\nRegisto efectuado com sucesso: " + nome + " | " + contacto + " | " + email);
        System.out.println("Bem vindo ao mundo GameStart!\n");
    }

    /**
     * Método para imprimir todos os jogos sem duplicados
     *
     * @param matriz recebe a matriz do ficheiro
     */
    public static void jogosTodos(String[][] matriz) {
        String jogosTodos = "";
        // Inserir todos os jogos (repetidos inclusive) num vetor e colocar um "_" entre eles
        for (int linhas = 0; linhas < matriz.length; linhas++) {
            jogosTodos += matriz[linhas][7] + "_";
        }
        // Separar os jogos e inserilos num vetor
        String[] vetorJogos = jogosTodos.split("_");
        // Procurar jogos repetidos e substituir por um "_" de maneira a deixar apenas uma cópia de cada jogo no vetor
        for (int cont = 0; cont < vetorJogos.length; cont++) {
            for (int comp = cont + 1; comp < vetorJogos.length; comp++) {
                if (vetorJogos[comp].equals(vetorJogos[cont])) {
                    vetorJogos[comp] = "_";
                }
            }
        }
        System.out.println("Temos os seguintes jogos disponiveis na nossa loja: ");
        // Imprimir todos os jogos
        for (int cont = 0; cont < vetorJogos.length; cont++) {
            if (!vetorJogos[cont].equals("_")) { // caso seja encontrado um "_" não imprime
                System.out.println(vetorJogos[cont]);
            }
        }
        System.out.println("\n");
    }

    /**
     * Método para imprimir todos os jogos de uma determinada editora
     *
     * @param matriz  Recebe a matriz do ficheiro
     * @param editora Recebe qual a editora pretendida
     */
    public static void jogosEditora(String[][] matriz, String editora) {
        String jogosTodos = "", generos = "";
        boolean imprimir = false;


        // Pegar em todas as categorias de jogos de uma editora (repetidas inclusive) e colocar numa string
        for (int linhas = 0; linhas < matriz.length; linhas++) {
            if (matriz[linhas][5].equalsIgnoreCase(editora)) {
                generos += matriz[linhas][6] + "_";
                jogosTodos += matriz[linhas][7] + "_";
            }
        }
        // Passar os elementos das strings para vetores
        String[] vetorGeneros = generos.split("_");
        String[] jogosEditora = jogosTodos.split("_");

        // Retirar os elementos repetidos
        for (int cont = 0; cont < vetorGeneros.length; cont++) {
            for (int comp = cont + 1; comp < vetorGeneros.length; comp++) {
                if (vetorGeneros[comp].equals(vetorGeneros[cont])) {
                    vetorGeneros[comp] = "_";
                }
            }
        }

        // Retirar os  elementos repetidos
        for (int cont = 0; cont < jogosEditora.length; cont++) {
            for (int comp = cont + 1; comp < jogosEditora.length; comp++) {
                if (jogosEditora[comp].equals(jogosEditora[cont])) {
                    jogosEditora[comp] = "_";
                }
            }
        }

        // Iniciar o output
        System.out.println("\nAqui estão todos os nossos jogos da " + editora.toUpperCase() + ":\n");
        // For para imprimir os generos
        for (int cont = 0; cont < vetorGeneros.length; cont++) {

            if (!vetorGeneros[cont].equals("_")) { // caso seja um "_" que usei para apagar os repetidos, não imprime nada
                System.out.println("\t*** " + vetorGeneros[cont] + " ***\n");
            }
            // For para imprimir os jogos
            for (int jogos = 0; jogos < jogosEditora.length; jogos++) {
                if (!jogosEditora[jogos].equals("_")) { // caso seja um "_" que usei para apagar os repetidos, não imprime nada

                    for (int linhas = 0; linhas < matriz.length; linhas++) {// For para fazer pesquisa na matriz em que o jogo encaixe na categoria
                        // Filtro da matriz, e quando um jogo for impresso uma vez a variavel imprimir passa a true, empedindo que volte a ser impressa
                        if (matriz[linhas][6].equals(vetorGeneros[cont]) && matriz[linhas][7].equals(jogosEditora[jogos]) && !imprimir) {
                            System.out.println(">" + jogosEditora[jogos] + "\n");
                            imprimir = true;
                        }
                    }
                    imprimir = false;

                }

            }

        }
        System.out.println("\n");

    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(System.in);
        Scanner ficheiro = new Scanner(new File("Projeto/Ficheiros/GameStart_V2.csv"));
        System.out.println("Olá Vitor! A pass é >cesae<! ;)");

        String[][] matriz = criarMatriz("Projeto/Ficheiros/GameStart_V2.csv");
        String utilizador, password = "", editora;
        int opcao = 0, idCliente = 0, lugares = 121;
        boolean existe = false;


        do {
            System.out.print("Tipo de utilizador (ADMIN || ClIENTE): ");
            utilizador = input.next().toUpperCase();

            switch (utilizador) {
                case "ADMIN":
                    System.out.print("PASSWORD: ");
                    password = input.next();
                    if (password.equals("cesae")) {
                        do {
                            System.out.println("\nMENU ADMIN");
                            System.out.println("1. Imprimir o número total de vendas e valor total");
                            System.out.println("2. Imprimir o lucro da empresa");
                            System.out.println("3. Aceder aos dados de um cliente");
                            System.out.println("4. Qual o jogo mais caro e os clientes que o compraram");
                            System.out.println("5. Sair");
                            opcao = input.nextInt();

                            switch (opcao) {
                                case 1:
                                    System.out.println("\nForam feitas " + matriz.length + " vendas num valor total de " + casasDecimais.format(vendas(matriz)) + "€.\n");
                                    break;
                                case 2:

                                    System.out.println("\nA empresa teve " + casasDecimais.format(lucro(matriz)) + "€ de lucro em vendas.");
                                    break;
                                case 3:
                                    System.out.print("\nInsira o id do cliente que procura: ");
                                    idCliente = input.nextInt();
                                    procurarCliente(matriz, idCliente);
                                    break;
                                case 4:
                                    jogoMaisCaro(matriz);
                                    System.out.println("\n");
                                    break;
                                case 5:
                                    break;
                                default:
                                    System.out.println("Opção errada tente novamente.\n");
                            }
                        } while (opcao != 5);
                        break;
                    } else {
                        System.out.println("Password Incorreta\n");
                    }
                    break;
                case "CLIENTE":
                    do {
                        System.out.println("\nPor favor escolha uma das seguintes opções:");
                        System.out.println("1. Caso ainda não seja nosso cliente por favor registe-se!");
                        System.out.println("2. Procurar lugares livres de estacionamento");
                        System.out.println("3. Lista de jogos para venda");
                        System.out.println("4. Procurar todos os jogos de uma editora especifica");
                        System.out.println("5. Sair");
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
                                System.out.print("Escolha a editora: ");
                                input.nextLine();
                                editora = input.nextLine();

                                // Verificar se a editora existe na matriz, se existir a variavel existe passa a true
                                for (int linhas = 0; linhas < matriz.length; linhas++) {
                                    if (matriz[linhas][5].equalsIgnoreCase(editora) && !existe) {
                                        existe = true;
                                    }
                                }
                                if (existe) { // Se a editora escolhida existir, imprime a lista de jogos, se não existir, imprime a menasagem de erro
                                    jogosEditora(matriz, editora);
                                } else System.out.println("Editora não encontrada no sistema.");
                                existe = false;
                                break;
                            case 5:
                                break;
                            default:
                                System.out.println("Opção errada tente novamente.");
                        }
                    } while (opcao != 5);
                    break;
            }
            // Mensagem para desligar o sistema por completo
            if (utilizador.equalsIgnoreCase("cliente") || utilizador.equalsIgnoreCase("admin") && !utilizador.equalsIgnoreCase("Sim")) {
                System.out.println("\nPertende desligar o sistema? Sim ou Nao ");
                utilizador = input.next();
                System.out.println("\n");
            }
        } while (!utilizador.equalsIgnoreCase("sim"));
    }
}