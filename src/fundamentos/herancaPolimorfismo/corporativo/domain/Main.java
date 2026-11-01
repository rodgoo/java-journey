package herancaPolimorfismo.corporativo.domain;

public class Main {
    public static void main(String[] args) {
        mostrarColaborador(new Gerente());
        mostrarColaborador(new Vendedor());
    }

    public static void mostrarColaborador(Colaborador colaborador) {


        System.out.printf("======================\n", colaborador.getClass().getCanonicalName());
        if (colaborador instanceof Gerente gerente) {
            gerente.setNome("Rodrigo");
            gerente.setLogin("rodrigo");
            gerente.setSenha("12234");

            System.out.println("Nome: " + gerente.getNome());
            System.out.println("Login: " + gerente.getLogin());
            System.out.println("Senha: " + gerente.getSenha());
        }

        switch (colaborador) {
            case Gerente gerente ->{
                gerente.setCodigo("3512");
                gerente.setNome("Rodrigo");
                gerente.setSalario(5000);
                gerente.setLogin("rodrigo");
                gerente.setSenha("123456");
                gerente.setComissao_gerente(2500);

                System.out.println("=======Gerente=======");
                System.out.println("Código: " + gerente.getCodigo());
                System.out.println("Nome: " + gerente.getNome());
                System.out.println("Salário: " + gerente.getSalario());
                System.out.println("Login: " + gerente.getLogin());
                System.out.println("Senha: " + gerente.getSenha());
                System.out.println("Comissão: " + gerente.getComissao_gerente());
                System.out.println("Valor total: " + gerente.getSalarioCompleto(500));

            }

            case Vendedor vendedor -> {
                vendedor.setCodigo("4115");
                vendedor.setNome("Pedro");
                vendedor.setSalario(2000);
                vendedor.setPercentualPorVendas(10);
                vendedor.setQtdVendas(1000);

                System.out.println("=======Vendedor=======");
                System.out.println("Nome: " + vendedor.getNome());
                System.out.println("Código: " + vendedor.getCodigo());
                System.out.println("Salário: " + vendedor.getSalario());
                System.out.println("Percentual: " + vendedor.getPercentualPorVendas());
                System.out.println("Qtd Vendas: " + vendedor.getQtdVendas());
            }
        }
    }
}
