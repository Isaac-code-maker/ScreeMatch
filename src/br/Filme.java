package br;
public class Filme {

    private String nome;
    private int anoLancamento;
    private boolean incluidoNoPlano;
    private double somaAvaliacoes;
    private int totalAvaliacoes;
    private int duracaoEmMinutos;


    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void setAnoLancamento(int anoLancamento){
        this.anoLancamento = anoLancamento;
    }

    public int getAnoLancamento(){
        return anoLancamento;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos){
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public int getDuracaoEmMinutos(){
        return duracaoEmMinutos;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano){
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public boolean getIncluidoNoPlano(){
        return incluidoNoPlano;
    }


    public int geTotalAvaliacoes(){
        return totalAvaliacoes;
    }

    public double getSomaAvaliacoes(){
        return somaAvaliacoes;
    }


    public void ExibirFichaTecnica() {
        System.out.println("Nome: " + nome);
        System.out.println("Ano de lançamento: " + anoLancamento);
        System.out.println("Duração: " + duracaoEmMinutos + " minutos");
    }

    public void Avaliar(double nota){
        somaAvaliacoes += nota;
        totalAvaliacoes++;
    }

    public double CalcularMediaAvaliacoes(){
        return somaAvaliacoes / totalAvaliacoes;
    }
}
