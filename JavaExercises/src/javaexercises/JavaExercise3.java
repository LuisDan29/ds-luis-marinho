package javaexercises;
import java.util.Scanner;

public class JavaExercise3 {
    
    public static void main(String[] args) {
        Scanner scanObj = new Scanner(System.in);
        
        System.out.println("Digite seu nome: ");
        String nome = scanObj.nextLine();
        
        System.out.println("Digite seu salário fixo (R$): ");
        float salario = scanObj.nextFloat();
        
        System.out.println("Digite o total de vendas no mês (R$): ");
        float vendas = scanObj.nextFloat();
        
        System.out.println("Nome do vendedor: " + nome);
        System.out.println("Salário fixo: " + salario);
        System.out.println("Salário com 15% de comissão: " + (salario + vendas * 0.15));
        
    }
    
}
