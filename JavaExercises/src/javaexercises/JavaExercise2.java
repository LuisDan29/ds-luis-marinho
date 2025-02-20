package javaexercises;
import java.util.Scanner;

public class JavaExercise2 {
    
    public static void main(String[] args) {
        Scanner scanObj = new Scanner(System.in);
        
        System.out.println("Digite distância percorrida (Km):");
        int dist = scanObj.nextInt();
        
        System.out.println("Digite combustível gasto (Litros):");
        int comb = scanObj.nextInt();
        
        System.out.println("Consumo médio: " + (dist / comb) + " Km/L");
    }
    
}
