import java.util.Scanner;

public class Seletor {
    
    int exercicio;

    void selecionar() {
        if (this.exercicio == 1) {
            //Exercício 1
            Conta conta1 = new Conta();
            conta1.saldo = 1000;

            System.out.println("Selecione a operação que gostaria de realizar: " );
            System.out.println("(1) Consultar saldo." );
            System.out.println("(2) Consultar cheque especial." );
            System.out.println("(3) Realizar um depósito." );
            System.out.println("(4) Sacar dinheiro." );
            System.out.println("(5) Pagar um boleto." );
            System.out.println("(6) Verificar cheque especial." );

            System.out.println("==============================================");


            var scanner = new Scanner(System.in);
            int opcao = scanner.nextInt();

            if (opcao == 1) {
                conta1.verificarSaldo();
            }
            if (opcao == 2) {
                conta1.consultarCheque();
            }
            if (opcao == 3) {
                conta1.depositar();
            }
            if (opcao == 4) {
                conta1.sacar();
            }
            if (opcao == 5) {
                conta1.pagar();
            }
            if (opcao == 6) {
                conta1.verificarCheque();
            }
            if (opcao != 1 && opcao != 2 && opcao != 3 && opcao != 4 && opcao != 5 && opcao != 6) {
                System.out.println("Opção inválida." );
            }

        }
        if (this.exercicio == 2) {
            //Exercício 2
            Carro carro1 = new Carro();

            carro1.desligar();
        }
    }
}
