package herancaPolimorfismo.fiasco.Hierarquia;

public class PoderCura extends Caracteristicas {

    public void ativarCura() {
        System.out.println("Modo cura ativado para o usuário " + nome);
        seloHeranca();
        System.out.println("================");
    }
}
