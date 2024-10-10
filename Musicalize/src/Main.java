import Audios.Musica;

public class Main {
    public static void main(String[] args) {
        Musica musica = new Musica();
        musica.setTitulo("dota");
        musica.setDuracao(300);
        musica.setAlbum("Dota");
        musica.setCantor("basshunter");
        musica.reproduz();
        musica.curtir();
        musica.curtir();
        musica.curtir();
        musica.curtir();
        musica.curtir();
        musica.curtir();
        musica.curtir();
        musica.deslicar();
        musica.somaLike();
        musica.classifica();
        musica.exibiFicha();
        musica.mostraDislike();

    }
}