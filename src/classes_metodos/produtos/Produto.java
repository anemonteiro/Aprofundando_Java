package classes_metodos.produtos;

public class Produto {

    String nome;
    double preco;
    double desconto;

    Produto(String nomeInicial) {
        nome = nomeInicial;
    }

    public double precoComDesconto() {
        return preco * (1 - desconto); }

    public double precoComDesconto (double descontoGerente){
        return preco * (1 - (desconto + descontoGerente));
    }

}