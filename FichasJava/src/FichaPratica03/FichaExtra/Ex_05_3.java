package FichaPratica03.FichaExtra;

import jdk.jshell.spi.SPIResolutionException;

import java.util.Scanner;

public class Ex_05_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // cont2 criado aqui para puder ser usado nos dois "for"
        // variavel num, serve para começar o cont2 no primeiro for de escrita a 1 e ir aumentando o número com que começa
        int limiteLinhas = 5, limiteEspaco = 0, num = 1, cont2;

        // for para contagem de linhas
        for (int linhas = 0; linhas < limiteLinhas; linhas++) {
            // cont = 1 criado aqui para voltar sempre a 1 depois de cada vez que o "for" correr, esta variavel vai representar o 1 no centro da piramide
            int cont = 1;
            // For abaixo faz os espaços
            for (int espaco = limiteLinhas; espaco > limiteEspaco; espaco--) {
                System.out.print(" ");

            }
            limiteEspaco++;


            // for para a criação dos números da esquerda até ao 1, cont2 começa = num que é 1
            // --> num++ depois dos for, na proxima rotação dos for o cont2 ja passa a ser 2 e dps 3 etc
            // --> cont++ pelo mesmo motivo
            for (cont2 = num; cont2 >= cont; cont2--) {
                System.out.print(cont2);
            }

            // for para os números após o 1
            // cont2 começa a 2 porque só quero que comece a escrever a partir do 2
            // linhas + 1 porque a variavel linhas começa a 0 logo a condição do "for" só é respeitada quando o "for" das linhas ja tiver corrido 2 vezes
            // o que faria com que este "for" só começasse a escrever na terceira rotação do "for" das linhas ou seja, na terceira linha da piramide

            for (cont2 = 2; cont2 <= linhas + 1; cont2++) {
                System.out.print(cont2);
            }


            System.out.println();
            //num ++ para passar o cont2 para 2 como mencionado anteriormente
            num++;
            //cont++ para aumentar o número mais alto da piramide
            cont++;
        }


    }
}

