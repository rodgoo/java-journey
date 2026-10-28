package herancaPolimorfismo;

public class Main {
    public static void main(String[] args) {
        // Classe -> nome da variável = new Objeto
        Gerente gerentePremium = new Gerente();

        // Polimorfismo
        Colaborador gerente = new Gerente();
        Colaborador vendedor = new Vendedor();

        gerente.setNome("Ricardo");
        gerente.setSalario(4000.00);

        // Nesse caso vai dar erro porque o gerente é colaborador (somente a classe Gerente tem login)
        gerente.setLogin("ricardo@admin.com");
        gerente.setSenha("teste123");

        // Colaborador com classe Gerente (como se fosse o role: gerente)
        gerentePremium.setLogin("teste");
        gerentePremium.setSenha("123456");

        System.out.println(gerente.getNome());
        System.out.println(gerente.getSalario());

        // Erro porque gerente:colaborador não tem acesso a login
        System.out.println(gerente.getLogin());
        System.out.println(gerente.getSenha());

    }
}
