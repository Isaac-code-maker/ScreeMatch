package br.com.alura.screenmatch.models;

import br.com.alura.screenmatch.calculos.Classificacao;

public class Filme extends Titulo implements Classificacao{

    private String diretor;

    public void setDiretor(String diretor){
        this.diretor = diretor;
    }

    public String getDiretor(){
        return diretor;
    }

    @Override
    public int getClassificacao() {
        return 0;
    }
}
