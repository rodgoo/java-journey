package herancaPolimorfismo;

public non-sealed class Vendedor extends Colaborador {
    private double percentualPorVendas;

    public double getPercentualPorVendas() {
        return percentualPorVendas;
    }

    public void setPercentualPorVendas(double percentualPorVendas) {
        this.percentualPorVendas = percentualPorVendas;
    }
}
