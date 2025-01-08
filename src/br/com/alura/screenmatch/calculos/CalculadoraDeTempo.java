package br.com.alura.screenmatch.calculos;

import br.com.alura.screenmatch.models.Titulo;

public class CalculadoraDeTempo {

    private int tempoTotal;

    public void setTempoTotal(int tempoTotal){
        this.tempoTotal = tempoTotal;
    }

    public int getTempoTotal(){
        return tempoTotal;
    }

    public void inclui(Titulo titulo){
        System.out.println("Incluindo " + titulo);
        tempoTotal += titulo.getDuracaoEmMinutos();
    }
}
