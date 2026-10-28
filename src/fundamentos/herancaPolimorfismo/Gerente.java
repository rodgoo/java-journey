package herancaPolimorfismo;

// Extendendo a classe Colaborador
public non-sealed class Gerente extends Colaborador {

    private String login;
    private String senha;
    private double comissao_gerente;

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
}
