
package core;

import java.util.Scanner;

public class J01022_XauNhiPhan {
    private static long[] len = new long[93];
    private static void init() {
        len[1] = len[2] = 1;
        for(int i = 3; i < 93; i++) {
            len[i] = len[i-2] + len[i-1];
        }
    }
    
    private static char find(int n, long k) {
        if(n == 1) {
            return '0';
        }
        
        if(n == 2) {
            return '1';
        }
        
        if(k > len[n-2]) {
            return find(n-1, k - len[n-2]);
        }
        return find(n-2, k);
    }

    public static void main(String[] args) {
        init();
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            long k = sc.nextLong();
            System.out.println(find(n, k));
        }
    }

}
