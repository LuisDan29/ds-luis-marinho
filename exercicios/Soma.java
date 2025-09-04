import java.util.Scanner;

public class Soma {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        
        System.out.println("Digite um numero: ");
        int num1 = obj.nextInt();
        obj.nextLine();
        System.out.println("Digite outro numero: ");
        int num2 = obj.nextInt();
        
        System.out.println("A soma é: " + (num1 + num2));
    }
}