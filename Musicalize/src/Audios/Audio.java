package Audios;

public class Audio {
    private String titulo;
    private double duracao;
    private int totalDeAvaliacoes;
    private int curtidas;
    private int deslike;
    private double classificacao;

    public void curtir(){
        System.out.println("Voce curtiu: " +titulo);
        curtidas++;
    }

    public void deslicar(){
        System.out.println("Voce nao curtiu: " +titulo);
        deslike++;
    }

    public int somaLike(){
        return totalDeAvaliacoes = curtidas + deslike;
    }

    public double classifica(){
        return classificacao =  (((double)curtidas - (double) deslike) / (double) totalDeAvaliacoes) *10;
    }

    public void reproduz(){
        System.out.println("Vc reproduziu : " +titulo);
        System.out.println("Duraçao de: " +duracao);
    }

    public int getDeslike() {
        return deslike;
    }

    public String getTitulo() {
        return titulo;
    }

    public double getDuracao() {
        return duracao;
    }


    public int getCurtidas() {
        return curtidas;
    }


    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }
}
