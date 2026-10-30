package herancaPolimorfismo.fiasco.Interfaces.SisPagamento;

public class CartaoCredito implements Pagavel {
    @Override
    public void processarPagamento(double valor) {
        System.out.println("Aprovando transação de R$: " + valor + " na operadora do cartão!");
    }

}
