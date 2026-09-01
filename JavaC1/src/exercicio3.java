import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args)  {
        var scanner = new Scanner(System.in);
        System.out.println("Pra calcular a área do seu retângulo digite o tamanho da base (apenas números): ");
        var lado = scanner.nextInt();
        System.out.println("E agora digite a altura: ");
        var altura = scanner.nextInt();
        
        var area = lado * altura;
        System.out.printf("A área do seu retângulo é: %s", area);

    }
}
