import java.util.Scanner;

public class Conta {
    int saldo;
    int cheque;  
    boolean chequeUso = false;  

    void verificarSaldo(){
        System.out.println("Seu saldo é de: " + this.saldo);
    }

    void consultarCheque(){
        if (saldo >= 500 ) {
            this.cheque = this.saldo / 2;

            System.out.println("Seu cheque é de: " + cheque);
        }else {
            this.cheque = 50;

            System.out.println("Seu cheque é de: " + cheque);
        }
        
    }

    void depositar() {
        System.out.println("Digite o valor que gostaria de depositar: ");

        var scanner = new Scanner(System.in);
        int deposito = scanner.nextInt();
        this.saldo = this.saldo + deposito;

        System.out.println("Seu saldo agora é de: " + this.saldo);
    }

    void sacar() {
        System.out.println("Digite o valor que gostaria de sacar: ");

        var scanner = new Scanner(System.in);
        int saque = scanner.nextInt();

        if (saque <= this.saldo) {
            this.saldo = this.saldo - saque;

            System.out.println("Seu saldo agora é de: " + this.saldo);
        }else {
            System.out.println("Saldo insuficiente!");
        }
        
    }

    void pagar() {
        System.out.println("Digite o valor do boleto que deseja pagar: ");
        System.out.println("500R$ ");
        System.out.println("1000R$ ");
        System.out.println("1500R$ ");

        var scanner = new Scanner(System.in);
        int boleto = scanner.nextInt();

        if (this.saldo >= boleto && boleto == 500) {
            this.saldo = this.saldo - boleto;

            System.out.println("Boleto pago!");
            System.out.println("Seu saldo agora é de: " + this.saldo);

        }
        if (this.saldo >= boleto && boleto == 1000) {
            this.saldo = this.saldo - boleto;

            System.out.println("Boleto pago!");
            System.out.println("Seu saldo agora é de: " + this.saldo);

        }
        if (this.saldo >= boleto && boleto == 1500) {
            this.saldo = this.saldo - boleto;

            System.out.println("Boleto pago!");
            System.out.println("Seu saldo agora é de: " + this.saldo);

        }
        if (boleto != 500 && boleto != 1000 && boleto != 1500) {
            System.out.println("Valor inválido.");
        }
        if (this.saldo < boleto) {
            System.out.println("Saldo insuficiente.");
        }
    }

    void verificarCheque() {
        if (chequeUso == true) {
            System.out.println("Seu cheque está sendo usado." );
        }
        else {
            System.out.println("Seu cheque não esta sendo usado.." );
        }
    }


}
