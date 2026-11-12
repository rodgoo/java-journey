package fundamentos.instance;

public class Main {
    public static void main(String[] args) {
        Colaborador colaborador = new Colaborador();
        Vendedor vendedor = new Vendedor();
        Gerente gerente = new Gerente();

        // Verifica se a variável pertence a instancia daquele objeto
        // vendedor é um colaborador
        System.out.println(colaborador instanceof Colaborador);
        System.out.println(vendedor instanceof Colaborador);
    }

    }