import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args)  {
        var scanner = new Scanner(System.in);

        System.out.println("Digite o nome da primeira pessoa e sua idade: ");
        var nome1 = scanner.next();
        var idade1 = scanner.nextInt();

        System.out.println("Agora digite o nome e idade da segunda pessoa: ");
        var nome2 = scanner.next();
        var idade2 = scanner.nextInt();

        var diferenca = 0;

        if (idade1 > idade2) {
            diferenca = idade1 - idade2;
        }else{
            diferenca = idade2 - idade1;
        }


        System.out.printf("A diferença de idade de vocês é de %s anos", diferenca);

    }
}
