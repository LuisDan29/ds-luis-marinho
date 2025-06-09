package javaexercises;
import java.util.Scanner;

public class JavaExercise1 {

    public static void main(String[] args) {
        Scanner scanObj = new Scanner(System.in);
        
        System.out.println("Digite um número:");
        int num1 = scanObj.nextInt();
        
        System.out.println("Digite outro número:");
        int num2 = scanObj.nextInt();
        
        System.out.println("soma: " + (num1 + num2));
        System.out.println("subtração: " + (num1 - num2));
        System.out.println("produto: " + (num1 * num2));
        System.out.println("divisão: " + (num1 / num2));
    }
    
}