package herancaPolimorfismo.fiasco.Interfaces.ECommerce;

public class RelatorioVendas implements Exportavel {
    @Override
    public void exportarArquivo() {
        System.out.println("Expotando relatório de vendas em PDF");
    }
}
