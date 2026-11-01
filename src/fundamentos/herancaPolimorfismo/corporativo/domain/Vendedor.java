package herancaPolimorfismo.corporativo.domain;

public non-sealed class Vendedor extends Colaborador {
    private double percentualPorVendas;
    private double qtdVendas;

    public Vendedor(String codigo, String nome, String endereco, int idade, double salario, double percentualPorVendas, double qtdVendas) {
        super(codigo, nome, endereco, idade, salario);
        this.percentualPorVendas = percentualPorVendas;
        this.qtdVendas = qtdVendas;
    }

    public Vendedor() {
    }

    public double getPercentualPorVendas() {
        return percentualPorVendas;
    }
    public void setPercentualPorVendas(double percentualPorVendas) {
        this.percentualPorVendas = percentualPorVendas;
    }

    // Sobrescrita do código -- POLIMORFISMO
    @Override
    public String getCodigo(){
        return "VN: " + this.codigo;
    }

    @Override
    public double getSalarioCompleto() {
        return this.salario + ((qtdVendas * percentualPorVendas) / 100);
    }


    public double getQtdVendas() {
        return qtdVendas;
    }

    public void setQtdVendas(double qtdVendas) {
        this.qtdVendas = qtdVendas;
    }
}
