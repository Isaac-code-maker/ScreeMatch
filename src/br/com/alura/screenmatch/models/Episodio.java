package br.com.alura.screenmatch.models;

public class Episodio {
    private int numero;
    private int nome;
    private Serie serie;
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public int getNome() {
        return nome;
    }
    public void setNome(int nome) {
        this.nome = nome;
    }
    public Serie getSerie() {
        return serie;
    }
    public void setSerie(Serie serie) {
        this.serie = serie;
    }

}
