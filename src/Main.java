import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.models.Filme;
import br.com.alura.screenmatch.models.Serie;

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


         Serie supernatural = new Serie();
            supernatural.setNome("Supernatural");
            supernatural.setTemporadas(15);
            supernatural.setEpisodiosPorTemporada(20);
            supernatural.setFinalizada(true);
            supernatural.setAnoLancamento(2005);
            supernatural.setMinutosPorEpisodio(45);

            supernatural.ExibirFichaTecnica();
            
            System.out.println("Duracao total da serie: " + supernatural.getDuracaoEmMinutos());


            Filme OSenhorDosAneis = new Filme();
            OSenhorDosAneis.setNome("O Senhor dos Anéis: O Retorno do Rei");
            OSenhorDosAneis.setAnoLancamento(2003);
            OSenhorDosAneis.setDuracaoEmMinutos(201);
        
            CalculadoraDeTempo calculadora = new CalculadoraDeTempo();

            calculadora.inclui(meuFilme);
            calculadora.inclui(OSenhorDosAneis);
            calculadora.inclui(supernatural);
            System.out.println(calculadora.getTempoTotal());
            
    }
}
