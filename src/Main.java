import br.Filme;

public class Main {
    public static void main(String[] args) throws Exception {


        // EXERCÍCIO DA AULA - ScreenMatch
        Filme meuFilme = new Filme();

        meuFilme.setNome("O Poderoso Chefão");
        meuFilme.setAnoLancamento(1972); 
        meuFilme.setDuracaoEmMinutos(175); 

         System.out.println(meuFilme.getNome());
         System.out.println(meuFilme.getAnoLancamento());

         meuFilme.ExibirFichaTecnica();

         meuFilme.Avaliar(8);
         meuFilme.Avaliar(10);
         meuFilme.Avaliar(7);


         System.out.println(meuFilme.geTotalAvaliacoes());
         System.out.println(meuFilme.getSomaAvaliacoes());
         System.out.println(meuFilme.CalcularMediaAvaliacoes());


        


    }
}
