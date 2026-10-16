package fundamentos.getterssetters.funcionario;

// Classe funcionário + atributos privados
public class Funcionario {
    private String nome;
    private Double salario;
    private String cargo;
    private boolean ativo;

    // Construtor completo
    public Funcionario (String nome, Double salario, String cargo, boolean ativo){
        this.nome = nome;
        this.salario = salario;
        this.cargo = cargo;
        this.ativo = ativo;
    }

    // Getters
    public String getNome() { return nome;};
    public Double getSalario() {return salario;};
    public String getCargo() {return cargo;}
    public boolean isAtivo() {return ativo;}

    // Setters
    public void setNome(String nome) {
        if (nome == null || nome.isEmpty()) {
            System.out.println("Nome inválido!");
        } else {
            this.nome = nome;
        }
    }
    public void setSalario(Double salario) {
        if (salario > 0) {
            this.salario = salario;
        } else {
            System.out.println("Salário inválido!");
        }
    }
    public void setCargo(String cargo) {this.cargo = cargo;}
    public void setAtivo(boolean ativo) {this.ativo = ativo;}

    public void exibirFuncionario() {
        System.out.println("Nome do funcionário: " + nome);
        System.out.println("Salário do funcionário: " + salario);
        System.out.println("Cargo do funcionário: " + cargo);
        System.out.println("Funcionário está ativo: " + ativo);
    }
}