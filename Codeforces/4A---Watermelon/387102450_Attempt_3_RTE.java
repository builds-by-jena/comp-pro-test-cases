import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        
        // Intentional division by zero to trigger ArithmeticException
        int zero = 0;
        int crash = w / zero;
        
        System.out.println(crash);
    }
}