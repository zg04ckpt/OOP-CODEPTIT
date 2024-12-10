
package core;

import java.util.Scanner;

public class J01021_TinhLuyThua {
    private static final int MOD = 1000000007;
    private static long calc(long a, long b) {
        long ans = 1;
        while(b > 0) {
            if(b % 2 == 1) {
                ans = (ans * a) % MOD;
            }
            a = (a * a) % MOD;
            b /= 2;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {            
            long a = sc.nextLong();
            long b = sc.nextLong();
            if (a == 0 && b == 0) {
                break;
            }
            
            System.out.println(calc(a, b));
        }
    }

}
