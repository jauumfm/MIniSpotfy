package Audios;

public class Podcast extends Audio implements Exibicao{
    private String podcaster;
    private String podcast;

    @Override
    public void exibiFicha(){
        System.out.println("Podcaster: "+podcaster);
        System.out.println("Programa: "+getTitulo());
        System.out.println("Podcast: "+podcast);
        System.out.println("Duracao: "+getDuracao());
        System.out.println("LIkes: "+getCurtidas());
        System.out.println("Classificao: "+classifica());
    }
    @Override
    public void mostraDislike(){
        System.out.println("Ja que pesquisou esse é o tanto de dislike da musica: " +getDeslike());
    }
}
