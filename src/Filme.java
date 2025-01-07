public class Filme {

    String nome;
    int anoLancamento;
    boolean incluidoNoPlano;
    double somaAvaliacoes;
    int totalAvaliacoes;
    int duracaoEmMinutos;


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
