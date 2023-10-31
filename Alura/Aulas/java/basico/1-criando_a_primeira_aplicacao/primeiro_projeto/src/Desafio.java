import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        int operacao = 0;
        double saldo = 2500;
        double transferencia = 0;
        Scanner scanner = new Scanner(System.in);

        StringBuilder cabecalho = new StringBuilder("""
                *****************************************
                Dados iniciais do cliente
                                
                Nome:           Guilherme Grubba
                Tipo conta:     Corrente
                Saldo inicial:  R$ %.2f
                *****************************************
                """.formatted(saldo));

        System.out.println(cabecalho);
        while(operacao != 4){
            StringBuilder opcoes = new StringBuilder("""
    
                Operações
                
                1 - Consultar saldos
                2 - Receber valor
                3 - Transferir valor
                4 - Sair
                """);

            System.out.println(opcoes);
            System.out.print("Digite a opção desejada: ");
            operacao = scanner.nextInt();

            switch (operacao){
                case 1:
                    System.out.println(String.format("O saldo atual é R$ %.2f", saldo));
                    break;

                case 2:
                    System.out.print("Informe o valor a receber: ");
                    saldo += scanner.nextDouble();
                    break;

                case 3:
                    System.out.println("Informe o valor que deseja transferir: ");
                    transferencia = scanner.nextDouble();
                    if(saldo > transferencia){
                        saldo -= transferencia;
                    }else{
                        System.out.println("Saldo Insuficiente para realizar a transferencia");
                    }
                    break;

                case 4:
                    System.out.println("Adeus!!");
                    break;

                default:
                    System.out.println("Operação inválida");
            }
        }

    }
}
