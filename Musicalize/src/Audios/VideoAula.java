package Audios;

public class VideoAula extends Audio implements Exibicao{
    private String professor;
    private String materia;

    @Override
    public void exibiFicha(){
        System.out.println("Professor: "+professor);
        System.out.println("Aula: "+getTitulo());
        System.out.println("Mateeria: "+materia);
        System.out.println("Duracao: "+getDuracao());
        System.out.println("LIkes: "+getCurtidas());
        System.out.println("Classificao: "+classifica());
    }
    @Override
    public void mostraDislike(){
        System.out.println("Ja que pesquisou esse é o tanto de dislike da musica: " +getDeslike());
    }
}
