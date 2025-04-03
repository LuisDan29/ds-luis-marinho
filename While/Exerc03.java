package pkgwhile;

import java.util.Scanner;

public class Exerc03 {
    
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        
        System.out.print("Escreva um número: ");
        int limite = obj.nextInt();
        
        int num = 2;
        System.out.print("Pares de 1 até " + limite + ": ");
        while (num <= limite) { 
            System.out.print(num + ", ");
            num += 2;
        }
        
        num = 1;
        System.out.print("\nÍmpares de 1 até " + limite + ": ");
        while (num <= limite) {
            System.out.print(num + ", ");
            num += 2;
        }
        
    }
    
}
