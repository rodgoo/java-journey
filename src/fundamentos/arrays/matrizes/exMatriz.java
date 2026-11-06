package arrays.matrizes;

import java.util.Scanner;

public class exMatriz {
    public static void main(String[] args) {
        Scanner pergunta = new Scanner(System.in);

        int n = pergunta.nextInt();

        // arranjo bidiomensional [n linhas] [n colunas]
        int[][] mat = new int[n][n];

        // dois (for) percorre a matriz inteira [i][j]
        for (int i = 0; i<n; i++){
            for (int j=0; j<n; j++){
                mat[i][j] = pergunta.nextInt();
            }
        }

        // Validação para matriz na diagonal
        System.out.println("--- Matriz na diagonal ---" );
        for (int i=0; i<mat.length; i++){
            System.out.print(mat[i][i] + " ");
        }

        System.out.println();


        // Validação para números negativos
        int contagem = 0;

        // Linhas
        for (int i=0; i< mat.length; i++){

            // Colunas
            /* para percorrer COLUNAS é necessário acessar a propriedade de dentro das
            linhas para procurar as colunas: j < variavel[coluna].length
            */

            for (int j=0; j<mat[i].length; j++){
                if (mat[i][j] < 0){
                    contagem++;
                }
            }
        }
        System.out.println("--- Números negativos ---");
        System.out.print(contagem);

        pergunta.close();
    }
}

