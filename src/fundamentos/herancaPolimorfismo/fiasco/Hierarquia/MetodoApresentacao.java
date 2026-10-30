package herancaPolimorfismo.fiasco.Hierarquia;

// Classe pública onde Metodo (classe filha) de Características
public class MetodoApresentacao extends Caracteristicas {

    public void apresentacaoInicial(){
        System.out.println("Olá, sou o " + nome + "!");
        System.out.println(cidade);
        System.out.println(idade + " anos");
        seloHeranca();
        System.out.println("================");

    }
}
