package fundamentos.instance;

// Extendendo a classe Colaborador
// Formato selado (permitindo acesso apenas para Gerente e Vendedor) + abstrato
public class Colaborador {

    protected String codigo;
    protected String nome;
    protected String endereco;
    protected int idade;
    protected double salario;


    public Colaborador(String codigo, String nome, String endereco, int idade, double salario) {
        this.codigo = codigo;
        this.nome = nome;
        this.endereco = endereco;
        this.idade = idade;
        this.salario = salario;
    }

    public Colaborador() {
    }

    // Getters e Setters

    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

}
