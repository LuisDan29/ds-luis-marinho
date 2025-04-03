import java.util.Scanner;

public class Exerc05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contador = 0, maior = Integer.MIN_VALUE;
        
        while (contador < 10) {
            System.out.print("Digite um número: ");
            int num = scanner.nextInt();
            if (num > maior) {
                maior = num;
            }
            contador++;
        }
        
        System.out.println("O maior número digitado foi: " + maior);
        scanner.close();
    }
    
}