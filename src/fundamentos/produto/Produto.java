package produto;

public class Produto {
    private String nome;
    private double preco;
    private Integer quantidade;
    private String categoria;

    public Produto() {}

    public Produto(String nome, Double preco, Integer quantidade, String categoria) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
        this.categoria = categoria;
    }

    public Produto(String nome, Double preco) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = 0;
        this.categoria =  "";
    }

    public double calcularTotal() {
        return preco * quantidade;
    }

    public void exibirProduto() {
        double total = calcularTotal();
        System.out.println("produto1.Produto: " + nome + " | Categoria: " + categoria + " | Preço: " + preco + " | Quantidade: " + quantidade + " | Total: " + total);

    }

}
