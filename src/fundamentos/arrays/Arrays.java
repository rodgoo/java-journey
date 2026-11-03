package arrays;

import java.util.Scanner;

public class Arrays {

    public static void main(String[] args) {

        // Lendo as Arrays (for)
        Scanner pergunta = new Scanner(System.in);
        int n = pergunta.nextInt();
        double[] vetor = new double[n];

        for (int i=0; i<n; i++) {
            vetor[i] = pergunta.nextDouble();

        }

        double soma = 0.0;
        for (int i=0; i<n; i++){
            soma+= vetor[i];
        }

        double media = soma / n;
        System.out.printf("Média: %.2f%n", media);

        pergunta.close();
    }
}
