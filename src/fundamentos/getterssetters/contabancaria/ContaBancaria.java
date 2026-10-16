package fundamentos.getterssetters.contabancaria;

public class ContaBancaria {
    private String titular;
    private double saldo;
    private boolean ativo;

    public ContaBancaria(String titular, double saldo, boolean ativo){
        this.titular = titular;
        this.saldo = saldo;
        this.ativo = ativo;
    }

    public String getTitular() {
        return titular;
    }
    public double getSaldo() {
        return saldo;
    }
    public boolean isAtivo() {
        return ativo;
    }

    public void setTitular(String titular){
        this.titular = titular;
    }

    public void setSaldo(double saldo) {
        if (saldo >= 0) {
            this.saldo = saldo;
        }
        else {
            System.out.println("Saldo inválido!");
        }
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public void exibirConta() {
        System.out.println("Nome do titular: " + titular);
        System.out.println("Saldo atual: " + saldo);
        System.out.println("Usuário ativo: " + ativo);
    }
}
