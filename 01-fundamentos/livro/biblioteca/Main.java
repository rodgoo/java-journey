package main.autonomo.biblioteca;

public class Main {
    public static void main(String[] args) {
        Livro livro1 = new Livro("Lua ", "Noite", 2013);
        Livro livro2 = new Livro("Peixe ", "Peixonauta", 2024);

        livro1.exibirInfo();
        livro2.exibirInfo();
    }
}