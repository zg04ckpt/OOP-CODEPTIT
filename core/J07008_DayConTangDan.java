
package core;

import java.util.Scanner;
import java.util.TreeSet;

public class J07008_DayConTangDan {
    private static TreeSet<String> set = new TreeSet<>();
    
    private static void add(int[] x, int i) {
        String s = "";
        for(int k = 1; k <= i; k++) {
            s += x[k] + " ";
        }
        set.add(s);
    }
    
    private static void tryAt(int[] a, int[] x, int i, int preIndex, int n) {
        for(int j = preIndex+1; j <= n; j++) {
            if(a[j] > x[i-1]) {
                x[i] = a[j];
                if(i > 1) {
                    add(x, i);
                }
                tryAt(a, x, i+1, j, n);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n+1];
        for(int i = 1; i <= n; i++) {
            a[i] = sc.nextInt();
        }
        int[] x = new int[n+1];
        x[0] = 0;
        tryAt(a, x, 1, 0, n);
        for(String e : set) {
            System.out.println(e);
        }
    }

}
