package contabancaria;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Padrão local dos USA
        Locale.setDefault(Locale.US);
        Scanner pergunta = new Scanner(System.in);

        Banco banco;

        // Captura o número passado como Integer -- reutilizando do Scanner acima
        System.out.println("Insira o número da conta: ");
        Integer numero = pergunta.nextInt();

        System.out.println("Insira o proprietário da conta: ");
        pergunta.nextLine();
        String proprietario = pergunta.nextLine();

        System.out.println("Existe depósito inicial (s/n)? ");
        char resposta = pergunta.next().charAt(0);
        if (resposta == 's') {
            System.out.println("Insira o valor de depósito inicial: ");
            double depositoInicial = pergunta.nextDouble();

            // Sobrecarga (3 atributos)
            banco = new Banco(numero, proprietario, depositoInicial);
        }
        else {
            // (2 atributos)
            banco = new Banco(numero, proprietario);
        }

        System.out.println();
        System.out.println("Dados da conta:");
        System.out.println(banco.paraString());

        System.out.println();
        System.out.println("Digite um valor de depósito: ");

        // O valor que for digitado será adicionado ao banco
        double valorDeposito = pergunta.nextDouble();
        banco.deposito(valorDeposito);

        System.out.println();
        System.out.println("Valor atualizado:");
        System.out.println(banco.paraString());
        System.out.println();

        System.out.println("Digite um valor de saque:");

        // O valor que for digitado será removido ao banco
        double valorSaque = pergunta.nextDouble();
        banco.saque(valorSaque);

        System.out.println();
        System.out.println("Valor atualizado:");
        System.out.println(banco.paraString());

    }
}


