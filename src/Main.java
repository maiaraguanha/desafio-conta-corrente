import java.util.Scanner;

public class Main {     // Classe
    public static void main(String[] args) {

        String nome = "Maiara Franciely";
        String tipoConta = "Corrente";
        double saldo = 2500.00;

        System.out.println("********************************************************");
        System.out.println("\nDados iniciais do cliente:");
        System.out.println("\nNome:               " + nome);
        System.out.println("Tipo de conta:      " + tipoConta);
        System.out.println("Saldo:              R$  " + saldo);
        System.out.println("\n********************************************************");


        String operacoesDoCliente = """
                                    
                Operações
                
                1- Consultar saldo
                2- Receber valor
                3- Transferir valor
                4- Sair
                
                Digite a opção desejada:
                
                """;

        Scanner lerValor = new Scanner(System.in);      // Objeto da Classe
        int opcao = 0;


        while (opcao != 4) {      // laço de repetição

            System.out.println(operacoesDoCliente);
            opcao = lerValor.nextInt();

            if (opcao == 1) {
                System.out.println("O saldo atual é R$ " + saldo);
            }else if (opcao == 2) {
                double valorRecebido = 0;
                Scanner recebido = new Scanner(System.in);
                System.out.println("Informe o valor a receber: ");
                valorRecebido = recebido.nextDouble();
                saldo += valorRecebido;    // saldoAtual = saldo + valorRecebido;
                System.out.println("Saldo atualizado R$ " + saldo);
            } else if (opcao == 3) {
                double valorSacado = 0;
                Scanner sacado = new Scanner(System.in);
                System.out.println("Informe o valor que deseja transferir: ");
                valorSacado = sacado.nextDouble();

                if (valorSacado <= saldo) {
                    saldo-= valorSacado;  // saldoAtual = saldoAtual - valorSacado;
                    System.out.println("Saldo atualizado R$ " + saldo);
                } else {
                    System.out.println("Saldo insuficiente para essa transferência");
                }
            } else if (opcao == 4) {
                System.out.println("Obrigada por escolher o nosso Banco! Volte Sempre !!!");
            } else {
                System.out.println("Operação inválida.");
            }
        }
    }
}