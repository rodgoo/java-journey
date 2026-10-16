package fundamentos.getterssetters.contabancaria;

public class Main {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria("Rodrigo C. Machado", 5300.43, true);
        ContaBancaria conta2 = new ContaBancaria("Ana Cardi B", -5000.20, true);


        // Getters da conta
        System.out.println("-----Objeto com informações padrões-----");
        System.out.println(conta1.getTitular());
        System.out.println(conta1.getSaldo());
        System.out.println(conta1.isAtivo());

        // Setters
        conta1.setTitular("Ana Maria Braga");
        conta1.setSaldo(-500.0);
        conta1.setAtivo(true);

        System.out.println("-----Objeto atualizado-----");
        conta1.exibirConta();


        // Getters da conta
        System.out.println("-----Objeto com informações padrões B-----");
        System.out.println(conta2.getTitular());
        System.out.println(conta2.getSaldo());
        System.out.println(conta2.isAtivo());

        System.out.println("-----Objeto atualizado B-----");
        conta2.exibirConta();
    }
}
