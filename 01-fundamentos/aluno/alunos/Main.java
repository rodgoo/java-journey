package main.autonomo.alunos;

// Main com dois objetos criados
public class Main {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Rodrigo", 123, 10.0, 10.0);
        Aluno aluno2 = new Aluno("Manoel", 234, 5.4, 6.7);


        // Objetos + métodos sendo chamados
        aluno1.exibirBoletim();
        aluno2.exibirBoletim();
    }
}
