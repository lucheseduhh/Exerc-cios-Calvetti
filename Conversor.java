import java.util.Scanner;

public class Conversor {
    public static void main(String [] args) {
    Scanner scanner = new Scanner(System.in);
//Entrada de dados
    System.out.print("Digite o valor em real: ");
    double valorReal = scanner.nextDouble();
//Processamento
    double dolar = valorReal / 5;
//Saida
    System.out.print("Valor em dolar: " + dolar);
    scanner.close();

    }

}
