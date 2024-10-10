package Audios;

public class Musica extends Audio implements Exibicao{
    private String cantor;
    private String album;

    public void setCantor(String cantor) {
        this.cantor = cantor;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    @Override
    public void exibiFicha(){
        System.out.println("Cantor: "+cantor);
        System.out.println("Musica: "+getTitulo());
        System.out.println("Album: "+album);
        System.out.println("Duracao: "+getDuracao());
        System.out.println("LIkes: "+getCurtidas());
        System.out.println("Classificao: "+classifica());
    }
    @Override
    public void mostraDislike(){
        System.out.println("Ja que pesquisou esse é o tanto de dislike da musica: " +getDeslike());
    }
}
