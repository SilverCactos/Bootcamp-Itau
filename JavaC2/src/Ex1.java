import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) throws Exception {
        var scanner = new Scanner(System.in);
        System.out.println("Digite um numero para ver sua tabuada:");
        int numero = scanner.nextInt();
        int resultado = numero * 10;
        int multiplicador = 1;


        System.out.printf("-Aqui esta a tabuada do %s-\n", numero);
        while ((resultado != numero) && (multiplicador <= 10)) {
            var numeroM = numero;
            var multiplicacao = numeroM * multiplicador;

            System.out.printf("%s * %s = %s\n", numero, multiplicador, multiplicacao);
            multiplicador += 1;
            
        }
    }
}
