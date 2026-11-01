package herancaPolimorfismo.corporativo.domain;

// Extendendo a classe Colaborador
// Acesso permitido a qualquer pessoa ali com non-sealed
public non-sealed class Gerente extends Colaborador {

    private String login;
    private String senha;
    private double comissao_gerente;

    public Gerente(String codigo, String nome, String endereco, int idade, double salario, String login, String senha, double comissao_gerente) {
        super(codigo, nome, endereco, idade, salario);
        this.login = login;
        this.senha = senha;
        this.comissao_gerente = comissao_gerente;
    }

    public Gerente() {
    }


    // Sobrescrita do código -- POLIMORFISMO
    @Override
    public String getCodigo(){
        return "GN: " + this.codigo;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public double getComissao_gerente() {
        return comissao_gerente;
    }

    public void setComissao_gerente(double comissao_gerente) {
        this.comissao_gerente = comissao_gerente;
    }

    @Override
    public double getSalarioCompleto() {
        return this.salario + this.comissao_gerente;
    }

    public double getSalarioCompleto(double extra){
        return this.getSalarioCompleto() + extra;
    }
}
