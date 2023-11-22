package Ex_01;

import java.util.ArrayList;

public class MusicPlayer {

    private ArrayList<Musica> listaMusicas = new ArrayList<Musica>();


    public void preencherLista(Musica musica) {
        listaMusicas.add(musica);
    }

    public void trocarMusicas(Musica musica1, Musica musica2) {
        int pos1= listaMusicas.indexOf(musica1), pos2 = listaMusicas.indexOf(musica2);

        if (listaMusicas.contains(musica1) && listaMusicas.contains(musica2)){
            listaMusicas.set(pos1, musica2);
            listaMusicas.set(pos2, musica1);

        }
    }

    public void removerMusica(Musica musica) {
        listaMusicas.remove(musica);
    }

    public void limparLista() {
        listaMusicas.clear();
    }

    public void imprimirRelatorio() {
        for (int cont = 0; cont < listaMusicas.size(); cont++) {
            System.out.println("Musica: " + (cont + 1));
            listaMusicas.get(cont).detalhesMusica();
            System.out.println("-----");
        }
    }

    public void duracao(){
        int minutos=0, segundos, horas, duracaoT=0;
        for (int cont = 0; cont < listaMusicas.size(); cont++) {
           duracaoT += listaMusicas.get(cont).getDuracao();
        }
        horas = duracaoT / 3600;
        segundos = duracaoT % 3600;
        minutos = segundos / 60;
        segundos = segundos - ((horas * 3600) + (minutos * 60));
        System.out.println("o album tem : " + horas + "h:" + minutos + "m:" + segundos + "s\n");

    }
}
