import java.util.Scanner;

public class Tempo {
    public static void main (String [] args) {
    Scanner scanner = new Scanner(System.in);
//entrada de dados
    System.out.print("Digite total em segundos: ");
    int totalSegundos = scanner.nextInt();
//processamento
    int horas = totalSegundos / 3600;
    int resto = totalSegundos % 3600;
    int minutos = resto / 60;
    int segundos = resto % 60;
//saida
    System.out.println("Resultados: ");
    System.out.println("Horas: " + horas);
    System.out.println("Minutos: " + minutos );
    System.out.println("Segundos: " + segundos);
    scanner.close();
    }
 }
