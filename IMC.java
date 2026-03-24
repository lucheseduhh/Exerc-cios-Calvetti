import java.util.Scanner;

public class IMC {
    public static void main(String [] args) {
    Scanner scanner  = new Scanner(System.in);
//Entrada de dados
    System.out.print("Digite sua altura: ");
    double altura = scanner.nextDouble();
    System.out.print("Digite o seu peso: ");
    double peso = scanner.nextDouble();

//processamento
    double imc = peso / Math.pow(altura, 2);
//saida
    System.out.printf("Seu IMC é: " + imc );
    scanner.close();
    }
}
