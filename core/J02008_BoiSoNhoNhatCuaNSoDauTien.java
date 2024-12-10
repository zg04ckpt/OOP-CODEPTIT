
package core;

import java.util.Scanner;

public class J02008_BoiSoNhoNhatCuaNSoDauTien {
    private static long gcd(long a, long b) {
        if(a == 0) {
            return b;
        }
        return gcd(b % a, a);
    }
    
    private static long lcm(long a, long b) {
        return a * b / gcd(a, b);
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            long ans = 1;
            for(int i = 1; i <= n; i++) {
                ans = lcm(ans, i);
            }
            System.out.println(ans);
        }
    }

}
