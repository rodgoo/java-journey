package herancaPolimorfismo.fiasco.Interfaces.SisPagamento;

public class Boleto implements Pagavel {
    @Override
    public void processarPagamento(double valor) {
        System.out.println("Gerando boleto no valor de R$: " + valor);
    }
}
