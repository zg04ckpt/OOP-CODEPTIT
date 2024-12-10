
package core;

import java.util.Scanner;

public class J01007_KiemTraSoFibo {
    private static boolean isFibo(long n) {
        if(n == 0 || n == 1) {
            return true;
        }
        long a = 0, b = 1, c = 1;
        while(c < n) {
            a = b;
            b = c;
            c = a + b;
        }
        return c == n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            long n = sc.nextLong();
            System.out.println(isFibo(n)? "YES":"NO");
        }
    }

}
