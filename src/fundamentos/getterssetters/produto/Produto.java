package fundamentos.getterssetters.produto;

public class Produto{
    private String nome;
    private Double preco;
    private Integer quantidade;
    private String categoria;

    // Construtor completo
    public Produto(String nome, Double preco, Integer quantidade, String categoria){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
        this.categoria = categoria;
    }

    // Getters
    public String getNome(){return nome;}
    public Double getPreco(){return preco;}
    public Integer getQuantidade(){return quantidade;}
    public String getCategoria(){return categoria;}

    // Setters
    public void setNome(String nome){
        if (nome == null || nome.isEmpty()){
            System.out.println("Campo inválido!");
        } else {
            this.nome = nome;
        }
    }

    public void setPreco(Double preco){
        if (preco > 0){
            this.preco = preco;
        } else {
            System.out.println("Preço inválido!");
        }
    }

    public void setQuantidade(Integer quantidade){
        if (quantidade >= 0){
            this.quantidade = quantidade;
        } else {
            System.out.println("Quantidade inválida!");
        }
    }

    public void setCategoria(String categoria){
        if (categoria == null || categoria.isEmpty()) {
            System.out.println("Categoria inválida!");
        } else {
            this.categoria = categoria;
        }
    }

    // Metodo de calcular
    public Double calcularTotal(){
        return preco * quantidade;
    }

    // Metodo de exibir os produtos
    public void exibirProduto(){
        System.out.println("Produto: " + nome);
        System.out.println("Categoria: " + categoria);
        System.out.println("Preço: R$: " + preco);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Total: " + calcularTotal());
    }

}
