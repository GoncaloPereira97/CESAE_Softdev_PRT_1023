package FichaPratica06;

import javax.swing.*;
import java.util.Scanner;

public class Ex_05 {
    /**
     * Recebe números num vétor
     *
     * @param array Determina qual o maior valor
     * @return
     */
    static int maior(int[] array) {

        int comp = 0;

        for (int cont = 0; cont < array.length; cont++) {
            if (array[cont] > comp) {
                comp = array[cont];
            }
        }
        return comp;
    }

    /**
     * Recebe números num vétor
     *
     * @param array Determina qual o menor valor
     * @return
     */
    static int menor(int[] array) {

        int comp = array[0];

        for (int cont = 0; cont < array.length; cont++) {
            if (array[cont] < comp) {
                comp = array[cont];
            }
        }
        return comp;

    }

    /**
     * Método que recebe um array
     * @param array Determina se é crescente ou não
     * @return
     */
    static boolean crescente(int[] array) {

        boolean cres = true;
        for (int cont = 1; cont < array.length; cont++) {
            if (array[cont - 1] > array[cont]) {
                cres = false;
            }

        }
        return cres;
    }

}
