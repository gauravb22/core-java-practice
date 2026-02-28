package iteration_control_statements;

import java.util.Scanner;

public class greatestCommonDivisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first Number");
        int a = sc.nextInt();
        System.out.println("Enter second Number");
        int b = sc.nextInt();
        int gcd = findGcd(a, b);
        System.out.println("GCD: " + gcd);
    }

    private static int findGcd(int a, int b) {
        if (a == b) {
            return a;
        } else {
            int x = 0;
            int gcd = 1;
            if (a < b) {
                x = a;
            } else {
                x = b;
            }
            for (int i = 1; i <= x; i++) {
                if (a % i == 0 && b % i == 0) {
                    gcd = Math.max(gcd, i);
                }
            }
            return gcd;
        }
    }
}