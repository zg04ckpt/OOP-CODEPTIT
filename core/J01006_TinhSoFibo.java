
package core;

import java.util.Scanner;

public class J01006_TinhSoFibo {
    private static long[] fibo = new long[93];
    private static void init() {
        fibo[1] = fibo[2] = 1;
        for(int i = 3; i <= 92; i++) {
            fibo[i] = fibo[i-1] + fibo[i-2];
        }
    }

    public static void main(String[] args) {
        init();
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            System.out.println(fibo[n]);
        }
    }

}
