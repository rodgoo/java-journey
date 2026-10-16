package fundamentos.getterssetters.produto;

public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Arroz", 8.75, 2, "Comida");

        // Getter
        System.out.println("--- Validação Getter  ---");
        System.out.println(produto1.getNome());
        System.out.println(produto1.getPreco());
        System.out.println(produto1.getQuantidade());
        System.out.println(produto1.getCategoria());

        // Setter
        System.out.println("--- Setter: Validação Normal ---");
        produto1.setNome("Feijão");
        produto1.setPreco(20.40);
        produto1.setQuantidade(2);
        produto1.setCategoria("Comida");

        // Chama metodo para Exibir Produtos
        produto1.exibirProduto();

        // Setter (nulos e negativos)
        System.out.println("--- Setter: Validação pra quebrar --- ");
        produto1.setNome("");
        produto1.setPreco(-14.12);
        produto1.setQuantidade(-5);
        produto1.setCategoria("");

    }
}
