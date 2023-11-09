package FichaPratica06;

public class Ex_03 {

    /**
     * Método que lê um número inteiro
     * @param num Determina se é par ou impar
     * @return
     */
    static boolean par(int num) {

        return num % 2 == 0;

    }


    /**
     * Método que lê um número inteiro
     * @param num Determina se é positivo ou negativo
     * @return
     */
    static boolean positivo(int num) {
        return num > 0;
    }


    /**
     * Método que lê um número inteiro
     * @param num Determina se é primo ou não
     * @return
     */
    static boolean primo(int num) {

        int num1, div = 2;
        boolean primoB = true;
        do {
            num1 = num % div;
            if (num1 == 0 && num != div) {
                primoB = false;
            }
            div++;

        } while (div < num);

        return primoB;
    }


    /**
     * Método que lê um número inteiro
     * @param num Determina se é perfeito ou não
     * @return
     */
    static boolean perfeito(int num) {
        int soma = 0;
        for (int cont = 1; cont < num; cont++) {
            if (num % cont == 0) {
                soma = soma + cont;
            }
        }
        return soma == num || num == 1;
    }


    /**
     * Método que lê um número inteiro
     * @param num Determina se é triangular ou não
     * @return
     */
    static boolean triangular(int num) {
        int soma = 0;
        for (int cont = 0; soma < num; cont++) {
            soma += cont;
        }
        return soma == num;
    }

    public static void main(String[] args) {

    }


}
