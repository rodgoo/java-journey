package getterssetters.pessoa;

// Classe pública com atributos privados
public class Pessoa {
    private String nome;
    private Integer idade;
    private String email;

    // Construtor completo
    Pessoa(String nome, Integer idade, String email) {
        this.nome = nome;
        this.idade = idade;
        this.email = email;
    }

    // Getter - pegando atributo privado
    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public String getEmail() {
        return email;
    }

    // Setter - alterando atributo privado
    public void setNome(String nome){
        this.nome = nome;
    }

    public void setIdade(Integer idade){
        this.idade = idade;
    }

    public void setEmail(String email){
        this.email = email;
    }

    // Criando metodo apenas para exibir resultado (Sout)
     public void exibirDados() {
         System.out.println("-----Metodo exibirDados-----");
        System.out.println("Nome do usuário: " + nome);
        System.out.println("Idade do usuário: " + idade);
        System.out.println("E-mail do usuário: " + email);
    }

}

