import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        
        System.out.println("Digite seu nome: ");
        String nome = obj.nextLine();
        System.out.println("Digite sua idade: ");
        int idade = obj.nextInt();
        obj.nextLine();
        System.out.println("Digite sua altura (m): ");
        double altura = obj.nextDouble();
        
        System.out.println("\nOlá, meu nome é " + nome + ", tenho " + idade + " anos e " + altura + "m de altura.");
    }
}