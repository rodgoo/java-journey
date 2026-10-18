package contabancaria;

public class Banco {
    private Integer numeroConta;
    private String titular;
    private double valor;

    // 2 atributos
    public Banco(Integer numeroConta, String titular) {
        this.numeroConta = numeroConta;
        this.titular = titular;
    }

    // Valor inicial (por meio de um depósito inicial, não do valor da conta)
    // 3 atributos
    public Banco(Integer numeroConta, String titular, double depositoInicial) {
        this.numeroConta = numeroConta;
        this.titular = titular;

        // Depósito inicial local
        deposito(depositoInicial);
    }

    public Integer getNumeroConta() {
        return numeroConta;
    }
    public String getTitular() {
        return titular;
    }
    public double getValor() {
        return valor;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }


    // Métodos de Regra de Negócio
    public void deposito(double quantia) {
        valor += quantia;
    }
    public void saque(double quantia) {
        valor -= quantia + 5.0;
    }


    // Formata valores para SOUT
    public String paraString() {
        return "Conta: " + numeroConta + ", Proprietário: " + titular + ", Valor: " + String.format("%.2f", valor);
    }
}
