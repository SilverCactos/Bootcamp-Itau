import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String operacao = scanner.nextLine();
        
        boolean operacaoValida = false;
        
        if (operacao.equals("DEPOSITO") || operacao.equals("TRANSFERENCIA") || operacao.equals("SAQUE")) {
          operacaoValida = true;
        }

        System.out.println(operacaoValida ? "VALID" : "INVALID");

        scanner.close();
    }
}
