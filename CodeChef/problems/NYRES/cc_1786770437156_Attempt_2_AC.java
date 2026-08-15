import java.util.Scanner;

class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int x = sc.nextInt();
            // January has 31 days
            System.out.println(x * 31);
        }
        sc.close();
    }
}