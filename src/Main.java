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


         System.out.println(meuFilme.totalAvaliacoes);
         System.out.println(meuFilme.somaAvaliacoes);
         System.out.println(meuFilme.CalcularMediaAvaliacoes());


        // PRATICA - EXERCICIO 1
        Pessoa pessoa1 = new Pessoa();

        pessoa1.nome = "Ana";
        pessoa1.idade = 20;

        System.out.println(pessoa1.Apresentar());

        
        // PRATICA - EXERCICIO 2
        Calculadora calculadora1 = new Calculadora();

        calculadora1.n1 = 50;
        System.out.println(calculadora1.dobro());



        // PRATICA - EXERCICIO 3
        Musica musica1 = new Musica();

        musica1.titulo = "Holy Wars... The Punishment Due";
        musica1.artista = "Megadeth";
        musica1.anoLancamento = 1990;
        
        musica1.AvaliarMusica(10);
        musica1.AvaliarMusica(9);
        musica1.AvaliarMusica(8);
        
        musica1.ExibirFichaTecnica();
        System.out.println(musica1.CalcularMediaAvaliacoes());


        // PRATICA - EXERCICIO 4
        Carro carro1 = new Carro();
        
        carro1.modelo = "Fusca";
        carro1.ano = 1970;
        carro1.cor = "Azul";

        carro1.ExibirFichaTecnica();
        System.out.println(carro1.CalcularIdade());

        

        // PRATICA - EXERCICIO 5
        Aluno aluno1 = new Aluno();

        aluno1.nome = "Carlos";
        aluno1.idade = 22;
        aluno1.curso = "Engenharia de Software";

        aluno1.ExibirInfo();


    }
}
