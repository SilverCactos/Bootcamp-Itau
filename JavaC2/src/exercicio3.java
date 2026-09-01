import java.util.Scanner;

public class exercicio3 {
     public static void main(String[] args) throws Exception {

        var scanner = new Scanner(System.in);

        System.out.println("=== Digite um número e em seguida, um número maior: ===");

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        System.out.println("=== Digite par ou ímpar: ===");

        var tipo = scanner.next();

        if (tipo.equalsIgnoreCase("par")){
            while(num1 <= num2) {
                if (num1 % 2 == 0) {
                    System.out.println(num1);
                    num1 += 1;
                }
                else {
                    num1 += 1;
                }
            }
        }
        if (tipo.equalsIgnoreCase("impar") || tipo.equalsIgnoreCase("ímpar")){
            while(num1 <= num2) {
                if (num1 % 2 != 0) {
                    System.out.println(num1);
                    num1 += 1;
                }
                else {
                    num1 += 1;
                }
            }
        }
        
     }
}
