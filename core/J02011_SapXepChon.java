
package core;

import java.util.Scanner;

public class J02011_SapXepChon {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        
        for(int i = 0; i < n-1; i++) {
            int mi = a[i], k = i;
            for(int j = i+1; j < n; j++) {
                if(a[j] < mi) {
                    mi = a[j];
                    k = j;
                }
            }
            
            int temp = a[i];
            a[i] = a[k];
            a[k] = temp;
            
            System.out.print("Buoc " + (i+1) + ": ");
            for(int e : a) {
                System.out.print(e + " ");
            }
            System.out.println();
        }
    }

}
