import  java.util.Scanner;

public class exercicio1 {
    
    public static void main(String[] args)  {
        var scanner = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        var nome = scanner.next();
        System.out.println("Digite seu ano de nascimento: ");
        var data = scanner.nextInt();

        var age = 2025 - data; 

        System.out.printf("Olá %s, você tem %s anos", nome, age);

    }
}
