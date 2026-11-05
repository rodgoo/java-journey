package arrays.ArrayListaEmemoria;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exLista {
    public exLista() {
    }

    public static void main(String[] args) {
        Scanner pergunta = new Scanner(System.in);
        List<Empresa> listaEmpresa = new ArrayList();
        System.out.print("Quantos candidatos serão registrados?");
        int n = pergunta.nextInt();

        for(int i = 0; i < n; i++) {
            System.out.println();
            System.out.println("Empregado #" + (i+1) + ": ");
            System.out.print("ID: ");

            int id;
            for(id = pergunta.nextInt(); temID(listaEmpresa, id); id = pergunta.nextInt()) {
                System.out.print("ID já registrado. Tente novamente: ");
            }

            System.out.print("Nome: ");
            pergunta.nextLine();

            String nome = pergunta.nextLine();

            System.out.print("Salário: ");
            double salario = pergunta.nextDouble();

            listaEmpresa.add(new Empresa(id, nome, salario));
        }

        System.out.println();
        System.out.print("Insira o ID do empregado que vai ter seu salário aumentado: ");
        int id = pergunta.nextInt();
        Empresa empregado = listaEmpresa.stream().filter(x -> x.getId()== id).findFirst().orElse(null);

        if (empregado == null){
            System.out.println("ID não existe");
        }
        else {
            System.out.print("Insira a porcentagem: ");
            double porcentagem = pergunta.nextDouble();
            empregado.aumentarSalario(porcentagem);
        }

        System.out.println();
        System.out.println("Lista de empregados: ");

        for(Empresa obj : listaEmpresa) {
            System.out.println(obj);
        }

        pergunta.close();
    }

    public static boolean temID(List<Empresa> listaEmpresa, int id) {
        Empresa empresa = (Empresa)listaEmpresa.stream().filter((x) -> x.getId() == id).findFirst().orElse(null);
        return empresa != null;
    }
}
