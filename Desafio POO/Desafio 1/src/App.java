import java.util.Scanner;

public class App {

    static class Conta {
        private int saldo;

        public Conta(int saldoInicial) {
            this.saldo = saldoInicial;
        }

        public void depositar(int valor) {
            validarValor(valor);
            saldo += valor;
        }

        public void sacar(int valor) {
            validarValor(valor);

            if (valor > saldo) {
                throw new IllegalArgumentException("Erro: saldo insuficiente");
            }

            saldo -= valor;
        }

        public int getSaldo() {
            return saldo;
        }

        private void validarValor(int valor) {
            if (valor <= 0) {
                throw new IllegalArgumentException("Erro: valor invalido");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String operacao1 = scanner.nextLine().trim();

        //Solução
        String[] teste = operacao1.toString().split("<br>");

        String operacao = teste[0].trim();
        int saldoInicial = Integer.parseInt(teste[1].trim());
        int valorOperacao = Integer.parseInt(teste[2].trim());


        Conta conta = new Conta(saldoInicial);

        try {
            if ("DEPOSITO".equals(operacao)) {
                conta.depositar(valorOperacao);
                System.out.println("Saldo final: " + conta.getSaldo());
            } else if ("SAQUE".equals(operacao)) {
                conta.sacar(valorOperacao);
                System.out.println("Saldo final: " + conta.getSaldo());
            } else {
                System.out.println("Erro: operacao invalida");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }
}

