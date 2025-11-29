import java.util.Scanner;

public class ConversorMoeda {
    private static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        boolean executando = true;
        
        while (executando) {
            exibirMenu();
            int opcao = scanner.nextInt();
            
            switch (opcao) {
                case 1:
                    converterMoeda("USD", "BRL", 5.50);
                    break;
                case 2:
                    converterMoeda("EUR", "BRL", 6.00);
                    break;
                case 3:
                    converterMoeda("GBP", "BRL", 7.00);
                    break;
                case 4:
                    converterMoeda("BRL", "USD", 0.18);
                    break;
                case 5:
                    converterMoeda("BRL", "EUR", 0.17);
                    break;
                case 6:
                    converterMoeda("BRL", "GBP", 0.14);
                    break;
                case 7:
                    converterMoedaPersonalizada();
                    break;
                case 0:
                    executando = false;
                    System.out.println("Obrigado por usar o conversor!");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
        
        scanner.close();
    }
    
    private static void exibirMenu() {
        System.out.println("\n=== CONVERSOR DE MOEDAS ===");
        System.out.println("1. USD → BRL");
        System.out.println("2. EUR → BRL");
        System.out.println("3. GBP → BRL");
        System.out.println("4. BRL → USD");
        System.out.println("5. BRL → EUR");
        System.out.println("6. BRL → GBP");
        System.out.println("7. Conversão personalizada");
        System.out.println("0. Sair");
        System.out.print("Escolha uma opção: ");
    }
    
    private static void converterMoeda(String moedaOrigem, String moedaDestino, double taxa) {
        System.out.print("Digite o valor em " + moedaOrigem + ": ");
        double valor = scanner.nextDouble();
        double resultado = valor * taxa;
        
        System.out.printf("→ %.2f %s = %.2f %s%n", valor, moedaOrigem, resultado, moedaDestino);
    }
    
    private static void converterMoedaPersonalizada() {
        System.out.print("Moeda de origem: ");
        String origem = scanner.next().toUpperCase();
        
        System.out.print("Moeda de destino: ");
        String destino = scanner.next().toUpperCase();
        
        System.out.print("Taxa de câmbio (1 " + origem + " = ? " + destino + "): ");
        double taxa = scanner.nextDouble();
        
        System.out.print("Valor: ");
        double valor = scanner.nextDouble();
        
        double resultado = valor * taxa;
        System.out.printf("→ %.2f %s = %.2f %s%n", valor, origem, resultado, destino);
    }
}