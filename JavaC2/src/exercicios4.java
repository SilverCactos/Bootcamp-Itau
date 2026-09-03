import java.util.Scanner;

public class exercicios4 {
    public static void main(String[] args) throws Exception {
        
        var scanner = new Scanner(System.in);

        System.out.println("Insira o primeiro número: ");
        int num1 = scanner.nextInt();

        System.out.println("Insira o segundo número: ");
        int num2 =  scanner.nextInt();

        if (num2 > num1) {
                System.out.println("O primeiro número inserido não pode ser menor que o segundo!");
        }

        while (num1 % num2 == 0) {
            System.out.println("Insira outro número: ");
            num2 = scanner.nextInt();
        }
    }
}
