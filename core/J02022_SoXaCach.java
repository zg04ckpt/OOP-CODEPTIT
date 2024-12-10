
package core;

import java.math.MathContext;
import java.util.Scanner;

public class J02022_SoXaCach {
    private static boolean[] isExisted = new boolean[10];
    
    private static void print(int[] a, int n) {
        for(int i = 2; i <= n; i++) {
            if(Math.abs(a[i] - a[i-1]) == 1) {
                return;
            }
        }
        for(int i = 1; i <= n; i++) {
            System.out.print(a[i]);
        }
        System.out.println();
    }
    
    private static void tryAt(int[] a, int i, int n) {
        for(int j = 1; j <= n; j++) {
            if(!isExisted[j]) {
                a[i] = j;
                isExisted[j] = true;
                if(i == n) {
                    print(a, n);
                } else {
                    tryAt(a, i+1, n);
                }
                isExisted[j] = false;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n+1];
            tryAt(a, 1, n);
        }
    }

}
