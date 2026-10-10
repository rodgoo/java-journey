package main.autonomo.biblioteca;

// Classes
public class Livro {
    private String titulo;
    private String autor;
    private Integer anoPublicacao;

    // Construtor vazio
    public Livro() {}

    // Construtor completo
    public Livro(String titulo, String autor, Integer anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    public void exibirInfo() {
        System.out.println("Livro: " + titulo + "do autor: " + autor + " ano de publicação: " + anoPublicacao );
    }


}

