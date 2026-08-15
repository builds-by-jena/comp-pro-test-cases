import java.util.Scanner;

class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            while (t-- > 0) {
                String s = sc.next();
                int countA = 0;
                int countB = 0;
                
                for (int i = 0; i < s.length(); i++) {
                    if (s.charAt(i) == 'a') {
                        countA++;
                    } else {
                        countB++;
                    }
                }
                System.out.println(Math.min(countA, countB));
            }
        }
        sc.close();
    }
}