import java.util.Scanner;

public class Informacoes {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        
        System.out.println("Escreva seu nome: ");
        String nome = obj.nextLine();
        System.out.println("Digite sua idade: ");
        int idade = obj.nextInt();
        obj.nextLine();
        System.out.println("Escreva sua cidade: ");
        String cidade = obj.nextLine();
        
        System.out.println("\nNome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Cidade: " + cidade);
    }
}