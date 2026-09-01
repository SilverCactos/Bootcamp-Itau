import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) throws Exception {
        var scanner = new Scanner(System.in);
        System.out.println("=== Calcule seu IMC ===");
        System.out.println("--> Digite seu peso: ");
        float peso = scanner.nextFloat();
        System.out.println("--> Digite sua altura: ");
        float altura = scanner.nextFloat();

        float imc = peso / (altura * altura);

        if ( imc <= 18.5 ){
            System.out.println("Você esta abaixo do peso!");
            System.out.printf("Seu IMC é %s", imc);
        }
        if ( 24.9 > imc && imc > 18.6) {
            System.out.println("Você esta no peso ideal!");
            System.out.printf("Seu IMC é %s", imc);
        }
        if ( 29.9 > imc && imc > 25.0) {
            System.out.println("Você esta um pouco acima do peso.");
            System.out.printf("Seu IMC é %s", imc);
        }
        if ( 34.9 > imc && imc > 30.0) {
            System.out.println("Obesidade grau I.");
            System.out.printf("Seu IMC é %s", imc);
        }
         if ( 39.9 > imc && imc > 35.0) {
            System.out.println("Obesidade grau II.");
            System.out.printf("Seu IMC é %s", imc);
        }
         if ( imc > 40) {
            System.out.println("Obesidade grau III, severa.");
            System.out.printf("Seu IMC é %s", imc);
        }
    }
    
}
