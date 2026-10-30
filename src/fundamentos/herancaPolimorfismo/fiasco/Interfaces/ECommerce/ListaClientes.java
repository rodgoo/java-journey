package herancaPolimorfismo.fiasco.Interfaces.ECommerce;

public class ListaClientes implements Exportavel {
    @Override
    public void exportarArquivo() {
        System.out.println("Exportando lista de clientes em formato Excel");
    }

}
