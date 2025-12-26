package lista;

import java.util.Scanner;

public class exercicio15 {
    public static void main(String[] args) {
        double saldoAtual = Math.random() * 1000;
        int opcao;
        Scanner sc = new Scanner(System.in);


        do{
            System.out.println("Selecione uma opção");
            System.out.println("Opção 1: Depósito");
            System.out.println("Opção 2: Saque");
            System.out.println("Opção 3: Consulta");
            System.out.println("Opção 4: Sair");
            System.out.print(">");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Insira o valor para depósito: ");
                    double deposito = sc.nextDouble();
                    saldoAtual += deposito;
                    System.out.println("O saldo atual é de: R$" + saldoAtual);
                    break;

                case 2:
                    System.out.println("O valor disponível é de: R$" + saldoAtual);
                    System.out.println("Insira do valor do saque");
                    System.out.print(">");
                    double saque = sc.nextDouble();
                    if (saldoAtual >= saque) {
                        saldoAtual -= saque;
                        System.out.println("Saque realizado com sucesso.");
                        System.out.println("Novo saldo: R$ " + saldoAtual);
                    } else {
                        System.out.println("Saldo insuficiente");
                    }
                    break;

                case 3:
                    System.out.println("Seu saldo é de R$" + saldoAtual);
                    break;

                case 4:
                    System.out.println("Encerrando o programa...");
                    break;

                default:
                    System.out.println("Opção Inválida");
            }
        } while (opcao != 4);

        sc.close();
    }
}
