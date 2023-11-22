package Ex_01;

public class Main {
    public static void main(String[] args) {
        Musica musica1 = new Musica("The Scientist", "Rock Alternativo", "Coldplay", 260);
        Musica musica2 = new Musica("Bohemian Rapsody", "Rock", "Queen", 359);
        Musica musica3 = new Musica("Mestre da Culinária", "Heavy Metal", "Quim Barreiros", 233);
        Musica musica4 = new Musica("Mob Ties", "Rap", "Drake", 453);
        Musica musica5 = new Musica("UH LA LA LA", "Hip-Hop", "Plutónio", 345);
        Musica musica6 = new Musica("Ambition for cash", "Rap", "Key glock", 376);


        MusicPlayer listaMusicas = new MusicPlayer();

        listaMusicas.preencherLista(musica1);
        listaMusicas.preencherLista(musica2);
        listaMusicas.preencherLista(musica3);
        listaMusicas.preencherLista(musica4);
        listaMusicas.preencherLista(musica5);
        listaMusicas.preencherLista(musica6);
        listaMusicas.duracao();
        listaMusicas.imprimirRelatorio();
        listaMusicas.trocarMusicas(musica1, musica6);
        listaMusicas.removerMusica(musica3);
        listaMusicas.duracao();



    }
}
