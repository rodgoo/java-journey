package getterssetters.pessoa;

public class Main {

    // Criando objeto no main
    public static void main(String[] args) {
        Pessoa serHumano1 = new Pessoa("Rodrigo", 20, "rodgoocode@hotmail.com");


        // Executando Getters e Setters + Resultado
        System.out.println(serHumano1.getNome()); // Getter - traz informação privada
        System.out.println(serHumano1.getIdade());
        System.out.println(serHumano1.getEmail());

        serHumano1.setNome("Manoel"); // Setter - alterando a informação privada
        serHumano1.setIdade(19);
        serHumano1.setEmail("cmanoel@hotmail.com");

        serHumano1.exibirDados(); // Chamando metodo (pra mostrar resultado)
    }
}
