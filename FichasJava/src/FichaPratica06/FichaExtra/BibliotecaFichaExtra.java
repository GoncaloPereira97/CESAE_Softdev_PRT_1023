package FichaPratica06.FichaExtra;

public class BibliotecaFichaExtra {
    /**
     * Método que compara 3 números para encontrar o menor
     *
     * @param num1 Lê o primeiro valor
     * @param num2 Lê o segundo valor
     * @param num3 Lê o terceiro valor
     * @return Retorna o número mais pequeno de 2
     */
    public static int numeroMaisPequeno(int num1, int num2, int num3) {
        int menor = 0;

        if (num1 < num2 && num2 < num3) {
            menor = num1;
        } else if (num2 < num1 && num1 < num3) {
            menor = num2;
        } else if (num2 < num3 && num3 < num1) {
            menor = num2;
        } else if (num1 < num3 && num3 < num2) {
            menor = num1;
        } else if (num3 < num1 && num1 < num2) {
            menor = num3;
        } else if (num3 < num2 && num2 < num1) {
            menor = num3;
        }
        return menor;
    }

    public static double media(int num1, int num2, int num3){
        return (num1 + num2 + num3) / 3;
    }

    /**
     * Método que retorna a area de um rectangulo
     *
     * @param base   Recebe a base do rectangulo
     * @param altura Recebe a altura do rectangulo
     * @return Retorna a area do rectangulo
     */
    public static int calcularAreaRetangulo(int base, int altura) {
        int area;
        area = base * altura;
        return area;
    }

    /**
     * Método que faz a tabuada de um número
     * @param num Recebe um número e imprime a tabuada do mesmo de 1 até 10
     */
    public static void imprimirTabuada(int num) {

        for (int tab = 1; tab <= 10; tab++) {
            System.out.println(num + " x " + tab + " = " + (num * tab));
        }

    }

    /**
     * Método para contar piadas
     * @param piada Recebe um número do utilizador para escolher uma piada
     * @return Retorna uma piada
     */
    public static String contarPiada(int piada){

        String piadaEscolhida;

        switch (piada){

            case 1:
               piadaEscolhida = "Porque é que a manteiga não entrou na discoteca? Porque foi barrada.";
                break;
            case 2:
                piadaEscolhida = "Qual é o único prato que ninguém consegue fazer direito? A torta";
                break;
            case 3:
                piadaEscolhida = "Onde é que os micróbios fazem surf? Num micro-ondas";
                break;
            case 4:
                piadaEscolhida = "Como se chama a neta do super Mário? Marioneta";
                break;
            case 5:
                piadaEscolhida = "O que diz o tubarão para a “tubaroa”? Tu baralhas-me";
                break;
            case 6:
                piadaEscolhida = " O que diz uma impressora para a outra? Essa folha é tua ou é impressão minha?";
                break;
            default:
                piadaEscolhida = "Só temos 6 piadas. Espere pelo proximo update!";
        }
        return piadaEscolhida;
    }
}

