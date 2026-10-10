package DesafioProduto;

public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Shampoo", 12.0, 2, "Cabelo");
        Produto produto2 = new Produto("Condicionador", 12.4);

        produto1.exibirProduto();
        produto2.exibirProduto();
    }
}
