import java.util.Scanner;
public class Area {
    public static void main (String [] args) {
    //Entrada de dados
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um valor para o lado do quadrado:");
        int ladoUm = scanner.nextInt();
        System.out.print("Digite um valor para o outro lado: ");
        int ladoDois = scanner.nextInt();
    
    //processamneto
        int area = ladoUm * ladoDois;

    //Saida
    System.out.println("A area do quadrado é: " + area);
    scanner.close();

    }
}
