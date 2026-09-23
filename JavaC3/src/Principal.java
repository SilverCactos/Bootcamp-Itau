import java.util.Scanner;

public class Principal {

    
    public static void main(String[] args) throws Exception {
    
    var scanner = new Scanner(System.in);

    System.out.println("Digite 1, 2 ou 3 para ver o respectivo exercício: ");
    System.out.println("==============================================");

    //O input pra pegar o exercício
    Seletor menu = new Seletor();
    menu.exercicio = scanner.nextInt();
    
    System.out.println("==============================================");

    //O exercício
    menu.selecionar();

    }
}
