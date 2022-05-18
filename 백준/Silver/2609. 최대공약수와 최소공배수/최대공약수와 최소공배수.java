import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int small = Math.min(n, m);
        int gcd = 1;

        for (int i = 1; i < small + 1; i++) {
            if (n % i == 0 && m % i == 0) {
                gcd = i;
            }
        }
        int lcm = (n * m) / gcd;

        System.out.println(gcd);
        System.out.println(lcm);
    }
}
