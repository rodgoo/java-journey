package aluno;

// Classe pública com atributos privados
public class Aluno {
    private String nome;
    private Integer matricula;
    private Double nota1;
    private Double nota2;

    // Construtor vazio
    public Aluno() {}

    // Construtor inteiro (O que o Lombok faz por baixo dos panos)
    public Aluno(String nome, Integer matricula, Double nota1, Double nota2) {
        this.nome = nome;
        this.matricula = matricula;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    // Metodo com retorno
    public double calcularMedia(){
        return (nota1 + nota2) / 2;
    }

    // Metodo void
    public void exibirBoletim(){
        double media = calcularMedia();
        System.out.println("Nome: " + nome);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Nota 1: " + nota1);
        System.out.println("Nota 2: " + nota2);
        System.out.printf("Média %.2f%n", media);
    }

}

