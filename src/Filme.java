public class Filme {

    String nome;
    int anoLancamento;
    boolean incluidoNoPlano;
    private double somaAvaliacoes;
    private int totalAvaliacoes;
    int duracaoEmMinutos;

    int geTotalAvaliacoes(){
        return totalAvaliacoes;
    }

    double getSomaAvaliacoes(){
        return somaAvaliacoes;
    }


    void ExibirFichaTecnica() {
        System.out.println("Nome: " + nome);
        System.out.println("Ano de lançamento: " + anoLancamento);
        System.out.println("Duração: " + duracaoEmMinutos + " minutos");
    }

    void Avaliar(double nota){
        somaAvaliacoes += nota;
        totalAvaliacoes++;
    }

    double CalcularMediaAvaliacoes(){
        return somaAvaliacoes / totalAvaliacoes;
    }
}
