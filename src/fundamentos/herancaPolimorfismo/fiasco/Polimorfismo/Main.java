package herancaPolimorfismo.fiasco.Hierarquia;

public class Main {
    public static void main(String[] args) {

        // Objeto 1 - Herança (pega de Características)
        // Métodos criados em Metodo e vem pra cá
        PoderSabio Poderoso = new PoderSabio();
        Poderoso.nome = "Rodrigo";
        Poderoso.cidade = "Vitória";
        Poderoso.idade = 20;
        Poderoso.ModoSabio();

        // Objeto 2
        PoderCura Pessoa4 = new PoderCura();
        Pessoa4.nome = "Wallace";
        Pessoa4.cidade = "Londres";
        Pessoa4.idade = 24;
        Pessoa4.ativarCura();

        // Objeto 3
        MetodoApresentacao Pessoa2 = new MetodoApresentacao();
        Pessoa2.nome = "Pedro";
        Pessoa2.cidade = "Pedro Canário";
        Pessoa2.idade = 21;
        Pessoa2.apresentacaoInicial();

        // Objeto 4
        MetodoApresentacao Pessoa3 = new MetodoApresentacao();
        Pessoa3.nome = "Dudu";
        Pessoa3.cidade = "Montanha";
        Pessoa3.idade = 17;
        Pessoa3.apresentacaoInicial();



    }
}
