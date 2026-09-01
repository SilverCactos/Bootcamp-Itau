import  java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args)  {
        var scanner = new Scanner(System.in);
        System.out.println("Pra calcular a área do seu quadrado digite o tamanho de um dos lados (apenas números): ");
        var lado = scanner.nextInt();
        
        var area = lado * lado;
        System.out.printf("A área do seu quadrado é: %s", area);

    }
}
