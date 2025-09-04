import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        
        System.out.println("Celsius (°C): ");
        double celsius = obj.nextDouble();
        double fahrenheit = (celsius * 9/5) + 32;
        
        System.out.println("Fahrenheit (°F): " + fahrenheit);
    }
}