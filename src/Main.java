public class Main {
    public static void main(String[] args) throws Exception {


        // EXERCÍCIO DA AULA - ScreenMatch
        Filme meuFilme = new Filme();

        meuFilme.nome = "O Poderoso Chefão";
        meuFilme.anoLancamento = 1972;
        meuFilme.duracaoEmMinutos = 175;

         System.out.println(meuFilme.nome);
         System.out.println(meuFilme.anoLancamento);

         meuFilme.ExibirFichaTecnica();

         meuFilme.Avaliar(8);
         meuFilme.Avaliar(10);
         meuFilme.Avaliar(7);


         System.out.println(meuFilme.geTotalAvaliacoes());
         System.out.println(meuFilme.getSomaAvaliacoes());
         System.out.println(meuFilme.CalcularMediaAvaliacoes());


        


    }
}
