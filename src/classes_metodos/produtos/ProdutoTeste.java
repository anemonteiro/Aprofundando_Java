package classes_metodos.produtos;

public class ProdutoTeste {
    public static void main(String[] args) {
        Produto p1 = new Produto("Notebook");
        //p1.nome = "Notebook";
        p1.preco = 1600;
        p1.desconto = 0.6;

        Produto p2 = new Produto("Bolsa");
        //p2.nome = "Bolsa";
        p2.preco = 35.50;
        p2.desconto = 0.1;

        double precoFinal1 = p1.precoComDesconto(0);
        double precoFinal2 = p2.precoComDesconto(0.2);

        System.out.println("Preço com desconto: " + precoFinal2);
    }
}
