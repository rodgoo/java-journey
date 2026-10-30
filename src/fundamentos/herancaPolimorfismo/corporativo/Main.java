package herancaPolimorfismo;

public class Main {
    public static void main(String[] args) {
        mostrarColaborador(new Gerente());
        mostrarColaborador(new Vendedor());
    }

    public Main() {
    }

    public static void mostrarColaborador(Colaborador colaborador){

        if (colaborador instanceof Gerente) {
            // Fazendo casting
            colaborador.setNome("Rodrigo");
            ((Gerente)colaborador).setLogin("rodgoo");
            ((Gerente)colaborador).setSenha("Teste1234");

            System.out.println(colaborador.getNome());
            System.out.println(((Gerente)colaborador).getLogin());
            System.out.println(((Gerente)colaborador).getSenha());
        }

//        switch (colaborador){
//            case Gerente gerente ->{
//                colaborador.setCodigo("1223");
//                colaborador.setNome("João");
//                colaborador.setSalario(6000);
//
//                gerente.setLogin("rodgoo");
//                gerente.setSenha("Teste123456");
//
//                System.out.println(colaborador.getNome());
//
//
//                System.out.println(gerente.getLogin());
//                System.out.println(gerente.getSenha());
//            }
//        }

    }
}
