package br.com.alura.screenmatch.models;

public class Serie extends Titulo{
    private int temporadas;
    private int episodiosPorTemporada;
    private boolean finalizada;
    private int minutosPorEpisodio;


    public void setTemporadas(int temporadas){
        this.temporadas = temporadas;
    }

    public int getTemporadas(){
        return temporadas;
    }

    public void setEpisodiosPorTemporada(int episodiosPorTemporada){
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    public int getEpisodiosPorTemporada(){
        return episodiosPorTemporada;
    }

    public void setFinalizada(boolean finalizada){
        this.finalizada = finalizada;
    }

    public boolean getFinalizada(){
        return finalizada;
    }

    public void setMinutosPorEpisodio(int minutosPorEpisodio){
        this.minutosPorEpisodio = minutosPorEpisodio;
    }

    public int getMinutosPorEpisodio(){
        return minutosPorEpisodio;
    }

    @Override
    public int getDuracaoEmMinutos(){
        return temporadas * episodiosPorTemporada * minutosPorEpisodio;
    }
}
