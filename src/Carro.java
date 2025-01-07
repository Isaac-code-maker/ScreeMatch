public class Carro {
    String modelo;
    int ano;
    String cor;

    void ExibirFichaTecnica() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Cor: " + cor);
    }

    int CalcularIdade() {
        return 2021 - ano;
    }

}
