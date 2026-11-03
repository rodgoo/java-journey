package arrays;

import java.util.Scanner;

public class alturaMedia {
    public static void main(String[] args) {

        Scanner pergunta = new Scanner(System.in);

        // Pergunta quantos serão os N elementos
        int n = pergunta.nextInt();

        // Cria o vetor com N elementos
        double[] vetor = new double[n];

        for (int i=0; i<n; i++) {
            vetor[i] = pergunta.nextDouble();
        }

        double soma = 0.0;
        for (int i=0; i<n; i++) {
            soma+= vetor[i];
        }

        double media = soma / n;

        System.out.printf("Altura média: %.2f%n", media);
    }
}
