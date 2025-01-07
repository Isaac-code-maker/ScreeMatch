public class Musica {

    String titulo;
    String artista;
    int anoLancamento;
    double avaliacoes;
    int numAvaliacoes;




    void ExibirFichaTecnica() {
        System.out.println("Titulo: " + titulo);
        System.out.println("Artista: " + artista);
        System.out.println("Ano de lançamento: " + anoLancamento);
        System.out.println("Avaliações: " + avaliacoes);
    }

    void AvaliarMusica(double nota){
        avaliacoes += nota;
        numAvaliacoes++;
    }

    double CalcularMediaAvaliacoes(){
        return avaliacoes / numAvaliacoes;
    }

}
