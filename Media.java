import java.util.Scanner;

public class Media {
    public static void main(String [] args){
    Scanner scanner = new Scanner(System.in);
//Entrada de dados
    System.out.print("Digite a primeira nota: ");
    double primeiraNota = scanner.nextDouble();
    System.out.print("Digite a segunda nota: ");
    double segundaNota = scanner.nextDouble();
    System.out.print("Digite a terceira nota: ");
    double terceiraNota = scanner.nextDouble();
//procesamento dos dados
    double soma = primeiraNota + segundaNota + terceiraNota;
    double media = soma / 3;
//saida
    System.out.print("Sua média foi: " + media);
    scanner.close();


    }

    
}
