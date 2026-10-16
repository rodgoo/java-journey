package fundamentos.getterssetters.funcionario;

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario("Rodrigo", 5700.52, "Desenvolvedor Back-End Java", true);

        // Getter
        System.out.println("--- Validações Getter --- ");
        System.out.println(funcionario1.getNome());
        System.out.println(funcionario1.getSalario());
        System.out.println(funcionario1.getCargo());
        System.out.println(funcionario1.isAtivo());

        // Setter (validação)
        System.out.println("--- Setter (validando) --- ");
        funcionario1.setNome(""); // Por estar vazio ele chama o valor do objeto original
        funcionario1.setSalario(-2000.00); // Por estar menor que 0, chama do objeto original
        funcionario1.setCargo("Desenvolvedor Front-End React");
        funcionario1.setAtivo(true);

        // Chamando metodo (de validação)
        funcionario1.exibirFuncionario();

        // Setter
        System.out.println("--- Setter (Carlito) --- ");
        funcionario1.setNome("Carlito Manoel");
        funcionario1.setSalario(7500.21);
        funcionario1.setCargo("Desenvolvedor Full Stack");
        funcionario1.setAtivo(false);

        // Chamando metodo (Carlito)
        funcionario1.exibirFuncionario();
    }
}
