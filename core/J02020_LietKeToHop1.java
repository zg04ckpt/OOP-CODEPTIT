
package core;

import java.util.Scanner;

public class J02020_LietKeToHop1 {
    private static boolean next(int[] a, int n, int k) {
        int i = k;
        while(i > 0 && a[i] == n-k+i) {
            i--;
        }
        
        if(i > 0) {
            a[i]++;
            for(int j = i+1; j <= k; j++) {
                a[j] = a[j-1] + 1;
            }
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[k+1];
        for(int i = 1; i <= k; i++) {
            a[i] = i;
        }
        
        int count = 0;
        do {            
            for(int i = 1; i <= k; i++) {
                System.out.print(a[i] + " ");
            }
            System.out.println();
            count++;
        } while (next(a, n, k));
        System.out.println("Tong cong co " + count + " to hop");
    }

}
