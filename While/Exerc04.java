import java.util.Scanner;

public class Exerc04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quantos alunos há na sala? ");
        int totalAlunos = scanner.nextInt();
        
        int contador = 0;
        double soma = 0;
        
        while (contador < totalAlunos) {
            System.out.print("Digite a nota do aluno " + (contador + 1) + ": ");
            soma += scanner.nextDouble();
            contador++;
        }
        
        System.out.println("Média da turma: " + (soma / totalAlunos));
        scanner.close();
    }
}